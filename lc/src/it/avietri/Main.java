package it.avietri;

public class Main {

	public static void main(String[] args) {
		Animale genericoAnimale = new Animale("Animale", 7, false, "Qualcosivoro");
		Mammifero tigre = new Mammifero("Tigre", 4, true, "Carnivoro", 3);

		System.out.println(genericoAnimale.nome);
		System.out.println(tigre.nome);
		
		System.out.println(tigre);
	}

}
