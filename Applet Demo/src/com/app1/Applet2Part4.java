package com.app1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part4 extends Applet implements ActionListener {
	Button b1,b2;
	TextField t;
	public void init(){
		add(b1=new Button("click"));
		add(t=new TextField (15));
		add(b2=new Button("clear"));
		b1.addActionListener(new A());
		b2.addActionListener(new B());
	}
	
      class A implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		t.setText("Hello World");
	}
	
}
	class B implements ActionListener{
		public void actionPerformed(ActionEvent e) {
		t.setText("");
	}
	}
}
	
