package com.learnings.java.threads;

/*******************
 * Java Learnings  *
 * @java.learnings *
 *******************/

public class ThreadJoining {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Waiting for 5 secs.");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Done!");
		};
		
		Thread thread = new Thread(runnable);
		System.out.println("Starting the thread.");
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread terminated.");
	}
}

/****************************
 * Output:					*
 * Starting the thread.		*
 * Waiting for 5 secs.		*
 * Done!					*
 * Thread terminated.		*
 ****************************/
