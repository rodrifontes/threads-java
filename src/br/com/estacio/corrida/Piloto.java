package br.com.estacio.corrida;

public class Piloto extends Thread {
	
	private String nome;
	public Piloto(String nome) {
		this.nome = nome;
	}
	
	public void run() {
		System.out.println("**** LARGADA ****");
		System.out.println("Primeira Volta: " + nome);
		for (int i = 0; i < 1000; i++) {}		
		System.out.println(nome + " >>> terminou a corrida!!!");
	}
	
}
