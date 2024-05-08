package it.avietri;

public class Animale {

	protected String nome;
	public int numZampe;
	public boolean denti;
	public String dieta;

	public Animale(String nome, int numZampe, boolean denti, String dieta) {
		this.nome = nome;
		this.numZampe = numZampe;
		this.denti = denti;
		this.dieta = dieta;
	}
	
	public void stampaNome() {
		System.out.println("Questo animale si chiama " + this.nome);
	}
	
	public String toString() {
		return "Questo animale si chiama " + this.nome;
	}
	
}
