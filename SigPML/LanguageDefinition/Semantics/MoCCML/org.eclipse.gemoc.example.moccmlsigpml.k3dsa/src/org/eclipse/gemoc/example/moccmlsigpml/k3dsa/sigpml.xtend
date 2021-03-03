package org.eclipse.gemoc.example.moccmlsigpml.k3dsa

import cnrs.luchogie.up.InteractiveSwingPlotter
import cnrs.luchogie.up.SwingPlotter
import cnrs.luchogie.up.data.Figure
import com.google.common.collect.LinkedListMultimap
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import java.util.Map
import javax.swing.JFrame
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.Agent
import org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.InputPort
import org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.NamedElement
import org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.OutputPort
import org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.Place
import org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.Port
import org.eclipse.gemoc.example.moccmlsigpml.model.sigpml.System

import static extension org.eclipse.gemoc.example.moccmlsigpml.k3dsa.InputPortAspect.*
import static extension org.eclipse.gemoc.example.moccmlsigpml.k3dsa.OutputPortAspect.*
import static extension org.eclipse.gemoc.example.moccmlsigpml.k3dsa.PlaceAspect.*
import static extension org.eclipse.gemoc.example.moccmlsigpml.k3dsa.SystemAspect.*
import groovy.lang.Binding
import groovy.lang.GroovyShell
import cnrs.luchogie.up.data.rendering.figure.ConnectedLineFigureRenderer
//import fr.inria.diverse.k3.al.annotationprocessor.coordination.Exposed
//import fr.inria.diverse.k3.al.annotationprocessor.coordination.Input
//import fr.inria.diverse.k3.al.annotationprocessor.coordination.Output
import fr.inria.diverse.k3.al.annotationprocessor.Step


@Aspect(className = Agent) 
class AgentAspect extends NamedElementAspect {
	public SwingPlotter plotter = new InteractiveSwingPlotter
	public JFrame frame = new JFrame
	public Figure figure = new Figure
	public Boolean hasBeenStopped = false
	public Integer currentExecCycle = 0;
	public Boolean isCurrentlyExecuting = false;

	def void isExecuting() {
		if (SystemAspect.DEBUG) println(_self.name+'\n      isExecuting ('+_self.currentExecCycle+')')
		if(_self.currentExecCycle <= _self.cycles && (!_self.hasBeenStopped) ){
			_self.currentExecCycle = _self.currentExecCycle + 1
		}
	}

	def void stop() {
		if (SystemAspect.DEBUG) println(_self.name+'\n      stop('+_self.currentExecCycle+')')
		_self.currentExecCycle = 0
		_self.hasBeenStopped = true
	}

	def void execute() {
		_self.hasBeenStopped = false
		if (SystemAspect.DEBUG) println(_self.name + "\n      execute (" + _self.currentExecCycle + ")")

		val outputPortNames = newArrayList
		_self.frame.setContentPane(_self.plotter)
		_self.frame.setSize(700, 400)
		_self.frame.alwaysOnTop = true;
		_self.frame.title = _self.name
		_self.plotter.getGraphics2DPlotter().setFigure(_self.figure);
		_self.figure.addRenderer(new ConnectedLineFigureRenderer());
		if (_self.frame.isVisible()){
			_self.frame.repaint(500);
		}else{
			_self.frame.repaint(5000);
		}


		/* reset sizeToRead */
		for (Port p : _self.ownedPorts) {
			if (p instanceof InputPort) {
				p.sizeToread = 0
			}
		}
		
	}
}

@Aspect(className = InputPort)
class InputPortAspect extends NamedElementAspect {
	public Integer sizeToread = 0

	def int read() {
		_self.sizeToread = _self.sizeToread + 1
		return _self.sizeToread
	}
	
	def void logSizeToReadWhenZero()
	{
		if (SystemAspect.DEBUG) println("*** sizeToRead is equal to 0 ***")
	}

	def void logSizeToReadWhenNotZero()
	{
		if (SystemAspect.DEBUG) println("sizeToRead = " + _self.sizeToread)
	}

}

@Aspect(className = OutputPort)
class OutputPortAspect extends NamedElementAspect {
	public Integer sizeWritten = 0

	def void write() {
//		_self.sizeWritten = _self.sizeWritten + 1
	}
}

@Aspect(className = Place)
class PlaceAspect extends NamedElementAspect {
	public EList<Object> fifo = new BasicEList()
	public Integer currentSize = 0
	public Boolean isInitialized = false

	@Step
	def void initialize() {
		if (SystemAspect.DEBUG) println("place " + _self.name + "is initializing")
		_self.fifo.clear
		for(i:0 ..< _self.delay) {
			var Object initialObject = 0
			_self.fifo.add(initialObject)
		}

		_self.currentSize = _self.fifo.size
	}

	@Step
	def void push() {
		//write move here to avoid k3 call order dependence
		_self.itsOutputPort.sizeWritten = _self.itsOutputPort.sizeWritten + 1 
		
		if (!_self.isInitialized) {
			_self.initialize()
			_self.isInitialized = true
		}

		_self.itsOutputPort.sizeWritten = _self.itsOutputPort.sizeWritten - 1 

		if (SystemAspect.DEBUG) println(_self.name + "push")

		var fifo_view = _self.fifo
		_self.currentSize = _self.fifo.size
		_self.fifo = fifo_view

		if (SystemAspect.DEBUG) println(fifo_view)
	}

	def void pop() {
		if(! _self.isInitialized) {
			_self.initialize()
			_self.isInitialized = true
		}

		if (SystemAspect.DEBUG) println(_self.name + "pop")

		val readedObject = _self.fifo.get(0)
		_self.fifo.remove(0)
		_self.currentSize = _self.fifo.size

	}
}

@Aspect(className=System)
class SystemAspect {
	public static Boolean DEBUG = false;
}

@Aspect(className=NamedElement)
abstract class NamedElementAspect {
	def System getSystem() {
		var contents = _self.eResource.contents
		val system = contents.findFirst[x | x instanceof System] as System
			
		return system
	}
}
