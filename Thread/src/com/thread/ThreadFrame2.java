package com.thread;

public class ThreadFrame2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Thread t=new Thread(new ThreadFrame2());
		 t.start();
		 System.out.println(t.getName());
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Dice");
	}
	}


