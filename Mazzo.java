/** 
 * Classe contenente tutti i metodi necesari alla creazione alla manipolazione di un mazzo di 52.
 * @author Leonardo Canello, Gabriele Trevisan, Leonardo Daniele, Bodan Popov, Alberto Bettellella e Simone Dassani
 * @version 1.0 (21-02-2019)
*/
import java.util.Random;
public class Mazzo{
	/**
	* Numero massimo di carte nel mazzo;
	*/
	private final int MAXCARTE = 52;
	
	/**
	* Array di carte
	*/
	private Carta[] carte;
	
	/**
	* Numero attuale di carte
	*/
	private int numCarte;
	
	/**
	* Crea un array di carte grande quanto il numero di carte massimo e inizializza il mazzo ai valori default
	*/
	public Mazzo(){
		carte = new Carta[MAXCARTE];		
		inizializza();
	}

	/**
	* Imposta l'array di carte ai valori default 
	*/
	public void inizializza(){
		int k = 0;
		for(int i = 1; i < 14; i++){
			for(int j = 1; j < 5; j++){
				try{
					carte[k] = new Carta(j, i);
				}catch(CartaNonValidaEcc e){}
				k++;
			}
		}
		setNumCarte(k);
	}
	
	/**
	* Mescola il mazzo
	*/
	public void mescola(){ 
		Random rnd = new Random(); 			
		for (int i = 0; i < carte.length; i++) {
		    int newPos = rnd.nextInt(carte.length);
		    Carta temp = carte[i];
		    carte[i] = carte[newPos];
		    carte[newPos] = temp;
		}

	}
	
	/**
	* Sposta tutte le carte alla sinistra della posizione desiderate di una posizione verso destra 
	* @param pos posizione necessaria per sapere fino a dove eseguire lo shift
	*/
	private void shiftDx(int pos){
			
		for (int i = numCarte - 2; i >= pos; i--) {           
			//System.out.println("Shift verso destra [" + (i + 1) + "] 
			//										   <-- [" + i
			//			                			   + "]");
				
			carte[i + 1] = carte[i];
		}
	}	
	
	/**
	* Sposta tutte le carte alla destra della posizione desiderate di una posizione verso sinistra
	* @param pos
	*/
	private void shiftSx(int pos){
		
		if(carte[pos] == null){
			for (int i = pos + 1; i < MAXCARTE; i++) {                
				//System.out.println("Shift verso sinistra [" 
				//					  + (i - 1) + "] <-- [" + i + "]");
					
				carte[i - 1] = carte[i];
			}
			carte[MAXCARTE - 1] = null;
			subNumCarte();
		}
	}
	
	/**
	* Estrae la prima carta del mazzo
	* @return carta estratta
	*/
	public Carta estrai(){
		Carta output = carte[0];
		carte[0] = null;
		shiftSx(0);
		return output;
	}
	
	/**
	* Estrae la carta alla posizione desiderata
	* @param n Posizione carta da estrarre
	* @return carta estratta
	*/
	public Carta estrai(int n){
		Carta output = carte[n];
		carte[n] = null;
		shiftSx(n);
		return output;
	}
	
	/**
	* Inserisce in cima al mazzo la carta desiderata
	* @param c Carta da inserire
	*/
	public void inserisci(Carta c){
		addNumCarte();
		shiftDx(0);
		carte[0] = c;
	}
	
	/**
	* Inserisce la carta desiderata in una posizione del mazzo specifica
	* @param c Carta da inserire
	* @param n Posizione alla quale inserire la carta
	*/
	public void inserisci(Carta c, int n){
		addNumCarte();
		shiftDx(n);
		carte[n] = c;
	}
	
	/**
	* Trova la posizione di una carta desiderata
	* @param c Carta da cercare
	* @return posizione
	*/
	public int cerca(Carta c){
		int posizione = -1;
		int i = 0;
		while(i < numCarte && posizione == -1){
			
			if (carte[i].ugualeCarta(c)){
				posizione = i;
			}
			i++;
		}
		return posizione;
	}
	
	/**
	* Restituisce l'array carte
	* @return carte
	*/
	public Carta[] getCarte(){
		return carte;
	}
	
	/**
	* Restituisce il numero di carte
	* @return Numero di carte attualmente nel mazzo
	*/
	public int getNumCarte(){
		return numCarte;
	}
	
	/**
	* Imposta un array di carte voluto come mazzo
	* @param c[] Array di carte
	* @throws CarteNonSuffEcc Se la lunghezza dell'array di carte da copiare minore di MAXCARTE
	*/
	public void setCarte(Carta[] c) throws CarteNonSuffEcc{
		if(c.length < MAXCARTE)
			throw new CarteNonSuffEcc(MAXCARTE);
					
		for(int i = 0; i < MAXCARTE; i++)
			carte[i] = c[i];
	}
	
	/**
	* Imposta il numero di carte
	* @param Numero al quale impostare numCarte
	*/
	private void setNumCarte(int n){
		numCarte = n;
	}
	
	/**
	* Aumenta il numero di carte di 1
	*/
	private void addNumCarte(){
		numCarte++;
	}
	
	/**
	* Aumenta il numero di carte del numero desiderato
	* @param n Numero del quale incrementare numCarte
	*/
	private void addNumCarte(int n){
		numCarte = numCarte + n;
	}	
	
	/**
	* Diminuisce il numero di carte di 1
	*/
	private void subNumCarte(){
		numCarte--;
	}
	
	/**
	* Diminuisce il numero di carte del numero desiderato
	* @param n Numero del quale decrementare numCarte
	*/
	private void subNumCarte(int n){
		numCarte = numCarte - n;
	}
	
	/**
	* Stampa il mazzo
	* @param modo imposta il formato degli output
	*/
	public void stampaMazzo(boolean modo){
				
		if(modo){
			int k = 0;
			for(int i = 1; i < 14; i++){
				for(int j = 1; j < 5; j++){
					if(carte[k] != null)
						System.out.println(carte[k].cartaStringa() + 
										   " [" + (k + 1) + "]");
					k++;
				}
				System.out.println();
			}
		}else{
			for(int i = 0; i < numCarte; i++){
				if(carte[i] != null){
					System.out.println(carte[i].cartaStringa() + 
									   " [" + (i + 1) + "]");
				}else{
					System.out.println("Posizione [" + (i + 1) + 
									   "] null");
				}
			}
		}
				
		for(int j = numCarte; j < MAXCARTE; j++){
			System.out.println("\nPosizione (del mazzo) [" + 
								(j + 1) + "] libera");
		}
		System.out.println();
	}
}
