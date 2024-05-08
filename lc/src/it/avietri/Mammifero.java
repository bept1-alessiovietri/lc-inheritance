package it.avietri;

public class Mammifero extends Animale {

	public int numCuccioli;
	
	public Mammifero(String nome, int numZampe, boolean denti, String dieta, int numCuccioli) {
		super(nome, numZampe, denti, dieta);
		
		this.numCuccioli = numCuccioli;
	}
	
	public void stampaNome() {
		super.stampaNome();
		System.out.println("Che è un mammifero");
	}
	
	public String toString() {
		return "Questo animale si chiama " + this.nome + " ed è un mammifero";
	}

}
