public class Mano {

	Mazzo mano = new Mazzo();
	int valore ;
	
	
	public Mano() {
		for(int i =0;i < 11; i++){
			mano = null;
			}
		
	}
	
	
	public void AggiungiCarta(Carta c){
		
	}
	
	public void EstraiSplit (Carta c){
	
	}
	
	public Mazzo getMano (){
		
		return mano;
	}
	
	public void setMano (Carta [] c){
		
	}
	
	public Carta EstraiSplit (int i){
		
	}
		
	public int aggiornaValore(){
		int valTot = 0;
		for(int i =0;i < 11; i++){
			valTot = valTot + mano[i].getVal();
		}
		return valTot;
	}
		
	public int getValore(){
		return valore;
	}

}
