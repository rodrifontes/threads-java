package br.com.estacio.corrida;

public class Corrida {

	public static void main(String[] args) {

		Piloto um = new Piloto("Hamilton");
		Piloto dois = new Piloto("Verstappen");
		Piloto tres = new Piloto("Bottas");
		
		um.start();
		dois.start();
		tres.start();
		
	}

}
