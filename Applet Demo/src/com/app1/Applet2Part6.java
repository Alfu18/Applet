package com.app1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part6 extends Applet implements ActionListener {

	Button b1,b2;
	TextField t;
	public void init(){
		add(b1=new Button("click"));
		add(t=new TextField (15));
		add(b2=new Button("clear"));
		M m= new M();
		m.takeRef(this);
		b1.addActionListener(m);
		b2.addActionListener(new N(this));
	}
	
	class M implements ActionListener {
			Applet2Part6 ap;			
		public void takeRef(Applet2Part6 ap) {
			// TODO Auto-generated method stub
			this.ap=ap;
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			ap.t.setText("Hello World");
		}
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	}
	
	
		class N implements ActionListener{
			Applet2Part6 ap;
			public N(Applet2Part6 ap){
				this.ap=ap;
			}
				// TODO Auto-generated constructor stub

			public void actionPerformed(ActionEvent e) {
			//Applet2Part6 ap=new Applet2Part6();
				ap.t.setText("");
			}
    }
}