package com.app1;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

//import com.app1.Applet5.panel2;

public class Applet5 extends Applet {
 Checkbox c1,c2,c3,c4,c5,c6;
 CheckboxGroup group;
 TextField t;
 
 	public void init()
 	{
 			setLayout(new GridLayout(4,2));
 			group=new CheckboxGroup();
	  add(c1=new Checkbox("Tour1",group,true));
	  add(c4=new Checkbox("Dubai",true));
	  add(c2=new Checkbox("Tour2",group,false));
	  add(c5=new Checkbox("Kuwait",true));
	  add(c3=new Checkbox("Tour3",group,false));
	  add(c6=new Checkbox("Saudi",false));
 	  add(t=new TextField("2000",15));
 	}
 }