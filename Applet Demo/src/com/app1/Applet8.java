package com.app1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Applet8 extends Applet {
	Button b1,b2;
	TextField t;
	public void init(){
		add(b1=new Button("Click"));
		add(t=new TextField (15));
		add(b2=new Button("Clear"));
		b1.addFocusListener(new FocusAdapter() {
			
		public void focusGained(FocusEvent e) {
			t.setText("Positive Vibes");
		}	
	});
		b2.addFocusListener(new FocusListener() {
			
			public void focusGained(FocusEvent e) {
				t.setText("");
		}
			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub	
			}
	});	
}
}