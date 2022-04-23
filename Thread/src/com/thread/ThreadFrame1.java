package com.thread;

public class ThreadFrame1 extends Thread {
	 public void run() {
		  System.out.println("My Thread");
	  }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThreadFrame1 th=new ThreadFrame1();
		 th.start();
		 System.out.println(th.getName());
		}
	}

