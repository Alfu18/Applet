package com.thread;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadDemo2 extends Frame {
    TextField t1,t2;
	Thread th1,th2;
	int i,j;
	public ThreadDemo2() {
	setLayout(new FlowLayout());
	add(t1=new TextField(15));
	add(t2=new TextField(15));
	th1=new Thread(new Thread() {
		public void run() {
			while(true) {	 
				t1.setText(String.valueOf(i));
				if(i==100)
					 i=0;
				else
					 i++;
			 	try {
			 		Thread.sleep(10);
			 	    }
			 	catch(Exception e) {
				}
			}	
		}	
		});		
		th2=new Thread(new Thread() {
			public void run() {
			while (true) {
	          t2.setText(String.valueOf(j));
			  if(j==100)
				  j=0;
			  else
				  j++;
			  try {
				   Thread.sleep(10);
				  }
		      catch(Exception e) {
				}	
			}
		 }
	});
		th1.start();
		th2.start();
		  addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e) 
				{
					System.exit(0);
				}
			});
			setSize(400,400);
			setVisible(true);	
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new ThreadDemo2();
		}

	}


























