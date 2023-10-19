package br.com.music.model;
import java.util.Scanner;

public class Audio extends PaiClass {
	
	public static void Reproduzir() {
		
		Scanner scanner = new Scanner(System.in);
		Audio audios = new Audio();
		
		System.out.println("Escolha a musica a ser reproduzida:");
	     System.out.println("1. Toxicity");
	     System.out.println("2. Mixed nuts");
	     
	    int escolha = scanner.nextInt();
	    
	    if (escolha == 1) {
	    	
	    	audios.setTitulo("Toxicity");
			audios.setGenero("Rock");
			audios.setArtista("System of a down");
			audios.setDuracao(3.30);
			audios.setTotalDeReproducoes(45);
			System.out.println("A musica Toxicity está sendo reproduzida");
	    	audios.infoAudio();
	    	System.out.println("Tempo total escutado: " + audios.TempoDeRepTotal() + " minutos");
	    	System.out.println("/------------------------------------------/");
	    	audios.Curtir();
	    	
	    } else {
	    	
	    	audios.setTitulo2("Mixed Nuts");
			audios.setGenero2("Jazz");
			audios.setArtista2("Will Stetson");
			audios.setDuracao2(3.35);
			audios.setTotalDeReproducoes2(34);
			System.out.println("♥ A musica Mixed nuts está sendo reproduzida ♥");
	    	audios.infoAudio2();
	    	System.out.println("Tempo total escutado: " + audios.TempoDeRepTotal2() + " minutos");
	    	System.out.println("/------------------------------------------/");
	    	audios.Curtir2();
	    		
	    }
	    
	}

}
