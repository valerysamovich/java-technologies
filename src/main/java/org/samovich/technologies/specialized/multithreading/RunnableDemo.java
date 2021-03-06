/**
 * @file RunnableDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/7/2014
 */

package org.samovich.technologies.specialized.multithreading;

public class RunnableDemo implements Runnable {

    // Declare variables
    private Thread t;
    private String threadName;

    // Constructor
    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    /**
     * Run the thread
     */
    public void run() {
        System.out.println("Running" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    /**
     * Start the thread
     */
    public void start() {

        System.out.println("Starting " + threadName);
        if (null == t) {
            t = new Thread((java.lang.Runnable) this, threadName);
            t.start();
        }

    }
}
