import java.util.Scanner;
//import java.util.Arrays;
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
		mazzo.mescola();
	}
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
	public void resettaGiocatori(){		
		for(int i = 0; i < numGiocatori; i++){
			giocatori[i].reset();
		}
		
		for(int j = 0; j < 2; j++)
			for(int i = 0; i < numGiocatori; i++)
				giocatori[i].riceviCarta(mazzo.estrai(), 0);	
	}
	
	
	public void gioca(){
		Scanner scanner = new Scanner(System.in);
		String continua;
		int volte = 0;

		do{
			if(volte > 0){
				resettaGiocatori();
			}
			volte++;
			for(int i = 0; i < numGiocatori; i++){
				System.out.println("\n\n\nGiocatore " + (i + 1) + "\n\n\n");
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
				System.out.println("Vuoi continuare a giocare? (si/no)");
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

