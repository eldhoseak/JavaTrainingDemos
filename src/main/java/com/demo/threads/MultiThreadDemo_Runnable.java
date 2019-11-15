package com.demo.threads;


/**
 * class Animal
 * Description: class extends Thread
 class
 * overrides run() method
 */

/*how to create a thread extending from
 * thread class, here start is being
 * called from main method where two
 * threads are getting created*/


class RAnimal implements Runnable{

    private String message; //message to output
    Thread t;


    RAnimal(String msg)
    {
        message = msg;
        t = new Thread(this, message);

        t.start();
    }

    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(2000);  // sleep for 2 seconds
            }
            catch (InterruptedException e) { }

        } //end of while
    } // end of run
} // end of Animal


/**
 * class MultiThreadDemo
 * Description: class contains main method
 */


class MultiThreadDemo_Runnable {   // multithreaded client code



    public static void main(String args[])  {

        //Instantiate a thread named dog
        RAnimal dog = new RAnimal("Wuff..Wuff");


        //Instantiate a thread named cow
        RAnimal cow = new RAnimal("Moo..Moo");

    } // end of main
}// end of MultiThreadDemo_Runnable class
