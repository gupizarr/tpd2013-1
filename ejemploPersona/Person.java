package org.processmining.plugins.pluginTPDLucas.ejemploPersona;

import org.deckfour.xes.extension.std.XTimeExtension;
import org.deckfour.xes.info.XLogInfo;
import org.deckfour.xes.info.XLogInfoFactory;
import org.deckfour.xes.model.XEvent;
import org.deckfour.xes.model.XLog;


public class Person {
  private String name;
  private int age;
  public XLog log;
 
  public Person(XLog log) {
    age = 0;
    this.log= log;
    
  }
  
  public void ShowEjecutoresLog()
  {	 
	  XLogInfo Info=XLogInfoFactory.createLogInfo(this.log);
      XTimeExtension extractor = XTimeExtension.instance();

	  //Recorrer trazas
	  for(int j=0;j<log.size(); j++)
	  {
		  //Recorrer eventos en trazas
			for (XEvent event : log.get(j)) 
			{			
	   
		  	     String resource= Info.getResourceClasses().getClassOf(event).getId();
		  	     long time=  extractor.extractTimestamp(event).getTime();

		
		      	        System.out.print("\n ejecutor: "+ resource+"\n Tiempo: "+time);
			}
	  }
	  

  }
 
  public String getName() {
    return name;
  }
 
  public void setName(String name) {
    this.name = name;
  }
 
  public int getAge() {
    return age;
  }
 
  public void setAge(int age) {
    this.age = age;
  }
}