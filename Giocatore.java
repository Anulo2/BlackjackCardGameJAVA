import java.util.Scanner;
public class Giocatore{
	//Mano[2] mano;
	private int carte;
	private int turni;
	public boolean inGioco;
	public Giocatore(){
		inGioco = true;
		System.out.println("Giocatore inizializzato");
		carte = 0;
	}
	
	public void split(){
		System.out.println("Mano splittata");
	}
	
	public void inizializzaGiocatori(){
	
	}
	
	public void riceviCarta(Carta c){
		carte++;
		System.out.println(c.cartaStringa() + " ricevuta, carte: " + carte);
	}
	
	public boolean turno(){
		Scanner tastiera = new Scanner(System.in);
		boolean ripeti = true;
		String azione;
		while(ripeti){
			
			while(!azione.equals("richiedi") || !azione.equals("fine") || !azione.equals("split")){
				System.out.println("Cosa vuoi fare?");
				azione = tastiera.nextInt();
			}
			
			System.out.println("Turno: " + turni);
			turni++;
			inGioco = turni < 5;
			
		}
		return inGioco;
	}
}
