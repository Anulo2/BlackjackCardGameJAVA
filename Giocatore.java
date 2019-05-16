import java.util.Scanner;
import java.util.InputMismatchException;
/** 
 * classe contenente tutti i metodi corrispondenti alle varie azioni che un utente può svolgere durante un partita
 * @author Alberto Bettella, Leonardo Canello, Leonardo Daniele, Simone Dassani Bogdan Popov, Gabriele Trevisan
 * @version 1.0 (21-02-2019)
*/
public class Giocatore{
	/**
	* Crea l'array di mani
	*/
	private Mano[] mano;
	/**
	* crea il mazzo;
	*/
	private Mazzo mazzo;
	/**
	* Indica il numero di vittorie;
	*/
	private int vittorie;
	/**
	* Inizializza il numero di carte nella mano del giocatore
	*/
	public Giocatore(){
		mano = new Mano[2];
		
		for(int i = 0; i < 2; i++)
			mano[i] = new Mano();
		
		vittorie = 0;
	}
	
	/**
	 * permette al giocatore di dividere la mano e formarne quindi 2 
	 */
	private void split(){
		Mano m, m2;
		m  = mano[0];
		m2 = mano[1];
		
		m2.aggiungiCarta(m.estraiSplit(1));
		m.setCartaNull(1);
		
		mano[0] = m;
		mano[1] = m2;
		
		mano[0].aggiungiCarta(mazzo.estrai());
		mano[1].aggiungiCarta(mazzo.estrai());
		
		mano[0].azzeraValore();
		mano[0].aggiornaValore();
		
		mano[1].aggiornaValore();
		System.out.println("------------------Split------------------\n\n");
		System.out.println("---------------prima mano----------------\n");
		System.out.println(mano[0].stampaManoASCII(6));
		System.out.println("Valore mano: " + mano[0].getValore());
		System.out.println("-----------------------------------------\n\n");

		System.out.println("--------------seconda mano---------------\n");
		System.out.println(mano[1].stampaManoASCII(6));
		System.out.println("Valore mano: " + mano[1].getValore());
		System.out.println("-----------------------------------------\n");
	}
	/**
	 * Restituisce la mano selezionata dal parametro
	 * @param n Mano da restituire
	 * @return mano
	 */
	public Mano getMano(int n){
		return mano[n];
	}
	/**
	 * Restituisce l'intero array di mani
	 * @return mani
	 */
	public Mano[] getMani(){
		return mano;
	}
	/**
	 * imposta la mano nella posizione dell'array che si desidera
	 * @param n Mano da impostare
	 * @param m mano a cui impostarla 
	 */
	public void setMano(int n, Mano m){
		mano[n] = m;
	}
	/**
	 * sostituisce l'array del giocatore con le mani da input 
	 * @param m Array di mani alla quale impostare le mani
	 */
	public void setMani(Mano[] m){
		mano = m;
	}
	/**
	 * permette di aggiungere una carta alla mano
	 * @param c carta da inserire
	 * @param n Mano in cui inserire la carta 
	 */
	public void riceviCarta(Carta c, int n){
		mano[n].aggiungiCarta(c);
	}
	/**
	 * incrementa il numero di vittorie 
	 */
	public void aggiungiVittoria(){
		vittorie += 1; 
	}
	/**
	* restituisce il numero di vittorie
	* @return numero di vittorie
	*/
	public int getVittorie(){
		return vittorie;
	}
	/**
	* resetta tutti i valori delle mani 
	*/
	public void reset(){
		mano = null;
		mano = new Mano[2];
		
		for(int i = 0; i < 2; i++)
			mano[i] = new Mano();
	
	}
	/**
	* permette di gestire le eccezzioni quando l'utente inserisce l'input da tastiera 
	* @return l'inserimento da tastiera
	*/
	private int getInput(){
		Scanner input = new Scanner(System.in);
		int n = -1;
		boolean ok = false;
		do{
			try{
				n = input.nextInt();
				ok = true;
			}catch(InputMismatchException e){input.next();}
		}while(!ok);
		return n;
	}
	/**
	*  metodo ausiliario per turno, che permette di pescare una carta o passare il turno
	* @param n numero corrispondente alla mano sulla quale si vuole eseguire il turno
	* @return boolean in base all'operazione eseguita
	*/
	private boolean miniTurno(int n){
		Scanner input = new Scanner(System.in);
		boolean output = false;
		int is = -1;
		
		while(is != 1 && is != 2){
			
			mano[n].aggiornaValore();
			if(mano[n].getValore() >= 21){
				is = 2;
				System.out.println(mano[n].stampaManoASCII(6));
				if(n == 0){
					System.out.println("Turno con la prima mano\n");
					System.out.println("Valore prima mano: " + mano[0].getValore() + "\n");
				}else if(n == 1){
					System.out.println("Turno con la seconda mano\n");
					System.out.println("Valore seconda mano: " + mano[1].getValore() + "\n");
				}
			}else{
				System.out.println(mano[n].stampaManoASCII(6));
				if(n == 0){
					System.out.println("Turno con la prima mano\n");
					System.out.println("Valore prima mano: " + mano[0].getValore() + "\n");
				}else if(n == 1){
					System.out.println("Turno con la seconda mano\n");
					System.out.println("Valore seconda mano: " + mano[1].getValore() + "\n");
				}
				
				System.out.println("Inserire 1 per pescare una carta, 2 per fermarti\n");
				is = getInput();
				System.out.println();
				
			}
		
			if(is == 1){
				mano[n].aggiungiCarta(mazzo.estrai());
				if(mano[n].getValore() >= 21){
					System.out.println(mano[n].stampaManoASCII(6));
					System.out.println(n == 0 ? "Valore prima mano: " + mano[0].getValore() + "\n" : "Valore seconda mano: " + mano[1].getValore() + "\n");
				}
				output = n == 0 ? false : true;
				if(mano[n].getValore() >= 21)
					output = n == 1 ? false : true;
			}else{
				output = n == 1 ? false : true;
			}
		}
		return output;
	}

	/**
	* gestisce tutte le operazioni possibili che un giocatore può effettuare durante un intero turno 
	* @param m mazzo in tavola
	* @return il mazzo con tutti i valori aggiornati 
	*/
	public Mazzo turno(Mazzo m){
		
		Scanner input = new Scanner(System.in);
		mazzo = m;
	
		boolean fT1 = false;
		boolean fT2 = true;
		boolean fT3 = true;
		
		int is = -1;
		
		int v1 = mano[0].getMano().getCarte()[0].getVal().getV();
		v1 = v1 < 10 ? v1 : 10;
		
		int v2 = mano[0].getMano().getCarte()[1].getVal().getV();
		v2 = v2 < 10 ? v2 : 10;
		
		if (v1 == v2){
			while(is != 1 && is != 2 && is != 3){
				mano[0].aggiornaValore();
				if(mano[0].getValore() >= 21){
					is = 3;
				}else{
					System.out.println(mano[0].stampaManoASCII(6));
					System.out.println("Turno con la prima mano\n");
					System.out.println("Valore prima mano: " + mano[0].getValore() + "\n");
					System.out.println("inserire 1 per pescare una carta nella mano, 2 per dividere la mano, 3 per fermarti");
					is = getInput();
					System.out.println();
				}
				if(is == 1){
					mano[0].aggiungiCarta(mazzo.estrai());
				}else if(is == 2){
					split();
					fT2 = false;
				}else{
					fT1 = true;
				}
			}
		}else{
			fT1 = miniTurno(0);
		}
		
		if(!fT1 || !fT2){
			while(!fT1){
				fT1 = miniTurno(0); 
			}
			if(!fT2){
				while(fT3){
					fT3 = miniTurno(1);
				}
			}
		}
		return mazzo;		
	}
}
