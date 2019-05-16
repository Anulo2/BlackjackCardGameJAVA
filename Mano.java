/** 
 * Classe contenente tutti i metodi necesari alla creazione e alla manipolazione di una mano del giocatore.
 * @author Alberto Bettella, Leonardo Canello, Leonardo Daniele, Simone Dassani Bogdan Popov, Gabriele Trevisan
 * @version 1.0 (21-02-2019)
*/
public class Mano {
	/**
	* Crea l'array di carte presenti nella mano;
	*/
	Mazzo mano = new Mazzo();
	/**
	* Indica il valore numerico della mano;
	*/
	private int valore;
	/**
	* Indica il numero di carte;
	*/
	private int carte;
	/**
	* Inizializza i due attributi carte e assi a "0" e imposta il valore di tutte le carte a "null"
	*/
	public Mano() {
		carte = 0;	
		mano.setCarteNull();
	}
	/**
	* Inserisce la carta scelta nella mano
	* @param c Carta che verrà aggiunta alla mano
	*/
	public void aggiungiCarta(Carta c) {
		mano.inserisci(c);
		valore = aggiornaValore();
	 }
	/**
	* Estrae la carta scelta dalla mano
	* @param ca Carta che verrà estratta dalla mano
	*/
	public void estraiSplit(Carta ca) {
		int c = mano.cerca(ca);
		mano.estrai(c);
	}
	/**
	* restituisce l'attributo mano
	* @return mano
	*/
	public Mazzo getMano(){
		return mano;
	}
	/**
	* Imposta un array di carte a mano 
	* @param car[] Array di carte che verrà inserito
	*/
	public void setMano (Carta [] car) {
		mano.setCarte(car);
	}
	/**
	* imposta la carta in una posizione desiderata a NULL 
	* @param p posizione della mano da estrarre
	*/
	public void setCartaNull(int p){
		mano.estrai(p);
	}
	/**
	* Estrae la carta alla posizione desiderata
	* @param i Posizione della carta
	* @return carta estratta
	*/
	public Carta estraiSplit (int i) {
		return mano.estrai(i);
	}
	/**
	* Azzera il valore complessivo delle carte che si ha nella mano 
	*/
	public void azzeraValore(){
		valore = 0;
	}
	/**
	* Aggiorna il valore complessivo delle carte che si ha nella mano 
	* @return restituisce il valore complessivo delle carte
	*/
	public int aggiornaValore() {
		
		int valNum = 0;
		int tempVal = 0;
		int i = 0;

		Carta carte[] = mano.getCarte();
		while(carte[i] != null){
			if(carte[i].getVal().getV() != 1){
				tempVal = carte[i].getVal().getV();
				valNum += tempVal > 10 ? 10 : tempVal;
			}
			i++;
		}	
		
		i = 0;
		
		while (carte[i] != null){
			if(carte[i].getVal().getV() == 1){
				if (valNum + 11 > 21){
					valNum += 1;
				}
				else{
					valNum += 11;
				}
			}
			i++;
		}
		valore = valNum;
		return valNum;
	}
	/**
	* restituisce in valore della mano 
	* @return valore della mano
	*/
	public int getValore() {
		return valore;
	}
	/**
	* restituisce il numero delle carte 
	* @return carte del mazzo
	*/
	public int getCarte() {
		return carte;
	}
	/**
	* restituisce l'array di carte sotto forma grafica 
	* @param m Numero di carte per riga
	* @return carte del mazzo
	*/
	public String stampaManoASCII(int m){
		StampaCarte carteASCII = new StampaCarte(mano.getCarte());
		return carteASCII.StampaggioCarte(m);
	}
	/**
	* restituisce l'array di carte in input sotto forma grafica 
	* @param c[] array di carte da stampare
	* @param m numero di carte per riga
	* @return carte del mazzo
	*/
	public String stampaManoASCII(Carta[] c, int m){
		StampaCarte carteASCII = new StampaCarte(mano.getCarte());
		return carteASCII.StampaggioCarte(m);
	}

}















