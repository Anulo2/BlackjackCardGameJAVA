public class Mano {

	Mazzo mano = new Mazzo();
	private int valore;
	private int carte;
	
	public Mano() {
		carte = 0;	
		mano.setCarteNull();
	}
	
	public void aggiungiCarta(Carta c) {
		mano.inserisci(c);
		valore = aggiornaValore();
	 }

	public void estraiSplit(Carta ca) {
		int c = mano.cerca(ca);
		mano.estrai(c);
	}
	
	public Mazzo getMano(){
		return mano;
	}
	
	public void setMano (Carta [] car) {
		mano.setCarte(car);
	}
	
	public void setCartaNull(int p){
		mano.estrai(p);
	}
	
	public Carta estraiSplit (int i) {
		return mano.estrai(i);
	}
	
	public void azzeraValore(){
		valore = 0;
	}
	
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

	public int getValore() {
		return valore;
	}
	
	public int getCarte() {
		return carte;
	}
	public String stampaManoASCII(int m){
		StampaCarte carteASCII = new StampaCarte(mano.getCarte());
		return carteASCII.StampaggioCarte(m);
	}
	public String stampaManoASCII(Carta[] c, int m){
		StampaCarte carteASCII = new StampaCarte(mano.getCarte());
		return carteASCII.StampaggioCarte(m);
	}

}















