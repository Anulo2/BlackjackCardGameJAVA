public class Gioco{
	int numGiocatori;
	int numMazzi;
	Mazzo mazzo;
	Giocatore[] giocatori;
	
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
	
	public void inizializzaMazzo(){
		mazzo = new Mazzo(numMazzi);
		//mazzo.stampaMazzo(true);
		mazzo.mescola();
		
		//debug
		mazzo.stampaMazzo(true);
	
	}
	public void inizializzaGiocatori(){
		giocatori = new Giocatore[numGiocatori];
		
		for(int i = 0; i < numGiocatori; i++)
			giocatori[i] = new Giocatore();
		
		for(int j = 0; j < 2; j++){
			for(int i = 0; i < numGiocatori; i++){
				giocatori[i].riceviCarta(mazzo.estrai());
			}
			System.out.println();
		}
	}
	
	public String gioca(){
		for(int i = 0; i < numGiocatori; i++){
			while(giocatori[i].inGioco){
				System.out.println("--------" + i + "---------");
				giocatori[i].turno();
				System.out.println("------------------");
			}
		}
		
		return "";
	
	}
}
