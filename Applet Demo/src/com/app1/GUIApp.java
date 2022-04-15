package com.app1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIApp extends Frame{
	Button b1,b2;
	TextField t;
	public GUIApp(){
		setLayout(new FlowLayout());
		add(b1=new Button("click"));
		add(t=new TextField (15));
		add(b2=new Button("clear"));
		b1.addActionListener((e)->t.setText("Blessed Life"));
		b2.addActionListener((e)->t.setText(""));
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
		setSize(400,500);
		setVisible(true);
		
		
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GUIApp();
	}

}
