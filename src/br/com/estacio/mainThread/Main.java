package br.com.estacio.mainThread;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Olá Mundo");
		Thread.sleep(30000);
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			System.out.println("Oi");
		}
	}

}
