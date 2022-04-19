package com.app1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Applet2Part5 extends Applet implements ActionListener {

	Button b1,b2;
	TextField t;
	public void init() {
		add(b1= new Button("Click"));
		add(t = new TextField(20));
		add(b2 = new Button("Clear"));
		b1.addActionListener((ActionEvent e)-> {t.setText("Life  Goals");});
		//b1.addActionListener((e)-> {t.setText("Hello World");});
		//b1.addActionListener((e)-> t.setText("Hello World"));
		b2.addActionListener((e) -> t.setText(""));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

