<?xml version="1.0" encoding="UTF-8"?>
<pls:ProductionLineModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:pls="https://inf.kcl.ac.uk/models/pls">
  <elements xsi:type="pls:GenHandle" name="handleGenerator" out="//@elements.3"/>
  <elements xsi:type="pls:GenHead" name="headGenerator" out="//@elements.5"/>
  <elements xsi:type="pls:Assembler" name="hammerAssembler" out="//@elements.7" in="//@elements.6"/>
  <elements xsi:type="pls:Conveyor" name="conveyor1" parts="//@elements.4" tray="//@elements.6"/>
  <elements xsi:type="pls:Handle"/>
  <elements xsi:type="pls:Conveyor" name="conveyor2" tray="//@elements.6"/>
  <elements xsi:type="pls:Tray"/>
  <elements xsi:type="pls:Conveyor" name="conveyor3"/>
</pls:ProductionLineModel>
