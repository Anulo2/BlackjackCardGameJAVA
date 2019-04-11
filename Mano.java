public class Mano {

	Mazzo mano = new Mazzo();
	int valore;
	int carte;
	int assi;
	
	public Mano() {
		carte = 0;	
		assi = 0;	
		mano.setCarteNull();
	}
	
	
	public void AggiungiCarta(Carta c) {
		mano.inserisci(c, carte);
		carte++;
	 }

	public void EstraiSplit(Carta ca) {
		int c = mano.cerca(ca);
		mano.estrai(c);
	}
	
	public Mazzo getMano (){
		
		return mano;
	}
	/*
	public void setMano (Carta [] car) {
		mano.setCarte(car);
	}*/
	
	public Carta EstraiSplit (int i) {
		return mano.estrai(i);
		
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
				if (valNum + 11>21){
					valNum += 1;
				}
				else{
					valNum += 11;
				}
			}
			i++;
		}
		return valNum;
	}
	public String getManoString(){
		String manoS = "Nella mano sono presenti le carte: ";
		int carteLength = mano.getCarte().length;
		String cartaBuffer = "";
		for (int i = 0; i<carteLength; i++){
			if(mano.getCarte()[i].getSem().getS() == 1 &&  mano.getCarte()[i] != null){
					cartaBuffer= mano.getCarte()[i].getVal().getV() + " di PICCHE";
			}
			else if(mano.getCarte()[i].getSem().getS() == 2 &&  mano.getCarte()[i] != null){
					cartaBuffer= mano.getCarte()[i].getVal().getV() + " di FIORI";
			}
			else if(mano.getCarte()[i].getSem().getS() == 3 &&  mano.getCarte()[i] != null){
					cartaBuffer= mano.getCarte()[i].getVal().getV() + " di QUADRI";
			}
			else if(mano.getCarte()[i].getSem().getS() == 4 &&  mano.getCarte()[i] != null){
					cartaBuffer= mano.getCarte()[i].getVal().getV() + " di CUORI";
			}
			else{
				cartaBuffer="";
			}
			manoS = manoS+cartaBuffer + ", ";
		}
		return manoS;
	}

	public int getValore() {
		return valore;
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















