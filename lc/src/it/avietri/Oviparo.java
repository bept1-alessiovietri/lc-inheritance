package it.avietri;

public class Oviparo extends Animale {
	
	public int numUova;
	
	public Oviparo(String nome, int numZampe, boolean denti, String dieta, int numUova) {
		super(nome, numZampe, denti, dieta);
		
		this.numUova = numUova;
	}

}
