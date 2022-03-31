package com.app1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet2 extends Applet
  {
	 Button b;
	 TextField t;
	   public void init()
	   {
		   b=new Button("submit");
		   add(b);
		   t=new TextField();
		   add(t);
		   
	   }
	
}
