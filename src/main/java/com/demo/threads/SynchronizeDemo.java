package com.demo.threads;

class Account {
	int bankBalance;

	public synchronized void debitAccount(int amount) {
		try {
			System.out.println("Checking for bal");
			while ((bankBalance - amount) < 0) {
				System.out.println("going to wait");
				wait();
			}
			System.out.println("debiting..");
			bankBalance -= amount;
			System.out.println("After debiting balance is " + bankBalance);
		} catch (Exception e) {
		}
	}

	public synchronized void creditAccount(int amount) {
		bankBalance += amount;
		System.out.println("bal=" + bankBalance + " notify");

		notify();
	}
}

class Thread111 extends Thread {
	Account ac;

	Thread111(Account ac) {
		this.ac = ac;
	}

	public void run() {
		ac.debitAccount(300);
	}
}

class Thread222 extends Thread {
	Account ac;

	Thread222(Account ac) {
		this.ac = ac;
	}

	public void run() {
		int i = 100;
		while (i <= 300) {
			ac.creditAccount(100);
			i += 100;
		}
	}
}

public class SynchronizeDemo {
	public static void main(String[] args) {
		Account ac = new Account();
		Thread111 t1 = new Thread111(ac);
		t1.start();
		Thread222 t2 = new Thread222(ac);
		t2.start();
	}
}
