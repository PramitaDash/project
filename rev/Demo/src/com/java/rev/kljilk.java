package com.java.rev;
import java.util.ArrayList;
import java.util.List;
public class kljilk extends Thread {
	

		@Override
		public void run() {
			List<String> names = new ArrayList<String>();
			names.add("Ananya");
			names.add("Akanksha");
			names.add("Sanjay");
			names.add("Sireesha");
			names.add("Jitendra");
			names.add("Ayush");
			for (String s : names) {
				System.out.println("ArrayList Data " +s);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}

	
