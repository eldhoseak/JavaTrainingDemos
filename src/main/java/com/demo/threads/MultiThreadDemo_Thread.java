package com.demo.threads;

class Animal extends Thread {

    private String message; //message to output


    Animal(String msg)
    {
        message = msg;


    }

    public void run() {
        while (true) {
            System.out.println(message);
            try {
                sleep(2000);  // sleep for 2 seconds
            }
            catch (InterruptedException e) { }

        } //end of while
    } // end of run
} // end of Animal


class MultiThreadDemo_Thread {   // multithreaded client code

    public static void main(String args[])  {


        //Instantiate a thread named dog
        Animal dog = new Animal("Wuff..Wuff");


        //Instantiate a thread named cow
        Animal cow = new Animal("Moo..Moo");

        dog.start();
        cow.start();
    }
}
