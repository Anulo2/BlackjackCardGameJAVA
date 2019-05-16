/** 
 * Classe contenente tutti i metodi necesari alla corretta esecuzione del gioco "Black Jack".
 * @author Leonardo Canello, Gabriele Trevisan, Leonardo Daniele, Bogdan Popov, Alberto Bettella e Simone Dassani
 * @version 1.0 (21-02-2019)
*/
import java.util.Scanner;
//import java.util.Arrays;
public class Gioco{
	
	/**
	* Numero di giocatori.
	*/
	int numGiocatori;
	
	/**
	* Numero di mazzi con cui si gioca.
	*/
	int numMazzi;
	
	/**
	* Oggetto mazzo per gestire le carte.
	*/
	Mazzo mazzo;
	
	/**
	* Array di oggetti giocatore per gestire i giocatori.
	*/
	Giocatore[] giocatori;
	
	/**
	* Inizializza l'array di giocatori e il mazzo.
	* @param g Numero di giocatori
	* @param m Numero di mazzi
	*/
	public Gioco(int g, int m){
		
		numGiocatori = g <= 8 ? g : 8;
		
		if(m < 0){
			numMazzi = -m;
		}else if(m == 0){
			numMazzi = 1;
		}else{
			numMazzi = m;
		}

		
		inizializzaMazzo();
		inizializzaGiocatori();
	}
	
	/**
	* Inizializza e mescola il mazzo.
	*/
	public void inizializzaMazzo(){
		mazzo = new Mazzo(numMazzi);
		mazzo.mescola();
	}
	
	/**
	* inizializza i giocatori e distribuisce le carte.
	*/
	public void inizializzaGiocatori(){
		giocatori = new Giocatore[numGiocatori];
		
		for(int i = 0; i < numGiocatori; i++)
			giocatori[i] = new Giocatore();
		
		for(int j = 0; j < 2; j++){
			for(int i = 0; i < numGiocatori; i++){
				giocatori[i].riceviCarta(mazzo.estrai(), 0);
			}
			System.out.println();
		}
	}
	
	/**
	* Azzera lo stato dei giocatori e distribuisce delle nuove carte.
	* Mantiene il conteggio delle vittorie.
	*/
	public void resettaGiocatori(){		
		for(int i = 0; i < numGiocatori; i++){
			giocatori[i].reset();
		}
		
		for(int j = 0; j < 2; j++)
			for(int i = 0; i < numGiocatori; i++)
				giocatori[i].riceviCarta(mazzo.estrai(), 0);	
	}
	
	/**
	* Gestisce l'interazione tra i giocatori e decreta il vincitore.
	*/
	public void gioca(){
		Scanner scanner = new Scanner(System.in);
		String continua;
		int volte = 0;

		do{
			if(volte > 0){
				resettaGiocatori();
			}
			volte++;
			
			int maxP = -1;
			int p = -1;
			for(int i = 1; i < numGiocatori; i++){
				p = giocatori[i].getMano(0).getValore();
				if(p > maxP){
					maxP = p; 
				}
			}
			
			for(int i = 0; i < numGiocatori; i++){
				
				System.out.println("\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510");
				System.out.println("\u007C Giocatore " + (i + 1) + " \u007C");
				System.out.println("\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518\n");
				
				System.out.println("\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510");
				System.out.println("\u007C Punteggio massimo giocatori: " + maxP + (maxP < 10 ? "  \u007C" : " \u007C"));
				System.out.println("\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518\n");
				mazzo = giocatori[i].turno(mazzo);
			}
			
			int max = -1;
			int posI = -1;
			int posJ = -1;
			int punteggio;
			for(int i = 0; i < numGiocatori; i++){
				for(int j = 0; j < 2; j++){
					punteggio = giocatori[i].getMano(j).getValore();
					if(punteggio > max && punteggio <= 21){
						max = punteggio;
						posI = i;
						if(giocatori[i].getMano(j).getValore() != 0) 
							posJ = j;
					}
				}
			}
			
			int punteggi[] = new int[numGiocatori * 2];
			int paritaP = -1;
			int l = 0;
			for(int j = 0; j < numGiocatori; j++){
				for(int k = 0; k < 2; k++){
					punteggi[l] = giocatori[j].getMano(k).getValore();
					l++;
				}
			}
            //System.out.println(Arrays.toString(punteggi));
			boolean b = true;
			
			for (int i = 0; i < punteggi.length - 1; i++){
				
				b = true;
				if(punteggi[i] == punteggi[i + 1] && (i % 2) == 0){
					
					b = false;
					
				}
				
				for (int j = i + 1; j < punteggi.length; j++){
					
					if ((punteggi[i] == punteggi[j]) && (i != j) && punteggi[i] != 0){
						
						paritaP = punteggi[j];
						
						if(paritaP <= max && paritaP <= 21 && b){
							posI = -1;
						}
						
					}
				}
			}

			if(posI != -1){
				System.out.println("Il vincitore e' il giocatore: " + (posI + 1) + "\n");
				giocatori[posI].aggiungiVittoria();
			}else{
				System.out.println("Parita'\n");
			}
			
			do{
				System.out.println("Vuoi continuare a giocare? (si/no)\n");
				continua = scanner.nextLine();
			}while(!(continua.equals("si")) && !(continua.equals("no")));
			
		}while(continua.equals("si"));
		
		int max = -1;
		int mIndex = -1;
		int vitt = -1;
		boolean par = false;
		
		for(int i = 0; i < numGiocatori; i++){
			vitt = giocatori[i].getVittorie();
			if(vitt > max){
				max = vitt;
				mIndex = i;
			}else if(vitt == max){
				par = true;
			}
		}
		if(!par){
			System.out.println("Il giocatore con il maggior numero di vittorie e' il giocatore numero " + (mIndex + 1) + "\n");
		}else{
				System.out.println("Parita'\n");
		}
	}
		
}

