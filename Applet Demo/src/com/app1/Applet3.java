package com.app1;

import java.applet.Applet;

import java.awt.Button;
import java.awt.Label;
import java.awt.Event;
import java.awt.TextField;
import java.util.EventObject;

public class Applet3 extends Applet 
{
     Label l;
     Button b;
     TextField t1,t2,t3;
	public void init()
	{
		add(t1=new TextField(7));
		add(l=new Label("+"));
		add(t2=new TextField(7));
		add(b=new Button("="));
		add(t3=new TextField(7));		
	}
	
	public boolean action(Event e,Object o)
	{
	   if (e.target.equals(b))
	   {
		   String s1=t1.getText();
		   int i= Integer.parseInt(s1);
		   String s2=t1.getText();
		   int j= Integer.parseInt(s2);
		   int k=i+j; 
		   String s3= String.valueOf(k);
		   t3.setText(s3);  
	   }
	   return true;
    }
}