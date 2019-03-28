
public class StampaCarte{
	
	String[] linee = new String[8];
	
	String risultato = "";
	String extra = "";
	int lunghezzaArray=0;
	
	Carta[] d;
	/*
	String[] SEMI = new String[]{			   "  .  \n
												 /.\ \n
												(_._)\n
												  |  ", 
											   
											   "  _  \n
												 ( ) \n
												(_'_)\n
												  |  ",
												  
											   "  ^  \n
												 / \ \n
												 \ / \n
												  .  ",
 
											   " _ _ \n
												( v )\n
												 \ / \n
												  .  ",
											   };
	*/
	String[] SEMI = new String[]{			   "  .  \n /.\\\u0020\n(_._)\n  |  ", "  _  \n ( ) \n(_'_)\n  |  ", "  ^  \n / \\\u0020\n \\\u0020/ \n  .  "," _ _ \n( v )\n \\\u0020/ \n  .  ",   };
											   
											   
	String[] VALORI = new String[]{											 
											 "A",  
											 "2", 
											 "3", 
											 "4", 
											 "5", 
											 "6", 
											 "7", 
											 "8", 
											 "9", 
											 "10", 
											 "J", 
											 "Q", 
											 "K"
											 };
	public StampaCarte(Carta[] c){
		d = new Carta[c.length];
		for (int i=0; i<c.length; i++){
			d[i]=c[i];
			if (d[i] != null){
				lunghezzaArray++;
			}
		}
	}
	
	
	
	
	public String StampaggioCarte(int numCarte){
		
		int i=0;
		int numRis = 0;
		while(i<=lunghezzaArray){
			i= i+numCarte;
			numRis++;
		}
		String[] risultati = new String[numRis];
		int numSucc= numCarte;
		String semeCarta;
		String valoreCarta;
		for (int g=0; g<numRis; g++){
			for(int h = 0; h<linee.length; h++){
				linee[h] = "";
			}
			for(int p=g*numCarte; p<numSucc; p++){

				semeCarta = SEMI[d[p].getSem().getS() - 1];
			
				valoreCarta = VALORI[d[p].getVal().getV() - 1];
				
				
				
				if (valoreCarta != "10"){
					if (semeCarta == SEMI[0]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    .    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   /.\\\u0020  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C  (_._)  \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    |    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[1]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    _    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   ( )   \u007C" + "           ";
						linee[4] = linee[4] + "\u007C  (_'_)  \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    |    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[2]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    ^    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   / \\\u0020  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    .    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[3]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   _ _   \u007C" + "           ";
						linee[3] = linee[3] + "\u007C  ( v )  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    .    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}				
				}
				else{
					if (semeCarta == SEMI[0]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    .    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   /.\\\u0020  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C  (_._)  \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    |    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[1]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    _    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   ( )   \u007C" + "           ";
						linee[4] = linee[4] + "\u007C  (_'_)  \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    |    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[2]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    ^    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   / \\\u0020  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    .    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[3]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   _ _   \u007C" + "           ";
						linee[3] = linee[3] + "\u007C  ( v )  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    .    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}	
				}
			}
			risultati[g] = linee[0] + "\n" + linee[1] + "\n" + linee[2] + "\n" + linee[3] + "\n" + linee[4] + "\n" + linee[5] + "\n" + linee[6] + "\n" + linee[7] + "\n";
			numSucc = ((g+1)* numCarte)+numCarte;
			if (numSucc > lunghezzaArray){
				do{
					numSucc--;
				}while(numSucc>lunghezzaArray);
			}
			else{
			}
			risultato= risultato + risultati[g];
		}
		return risultato;
	}
	
	
	
	
	
	
	public String StampaggioCarte(){
		for(int p = 0; p<linee.length; p++){
			linee[p] = "";
		}
		for(int i=0; i<d.length; i++){
			
			String semeCarta = SEMI[d[i].getSem().getS() - 1];
			
			String valoreCarta = VALORI[d[i].getVal().getV() - 1];
			
			
			if (valoreCarta != "10"){
					if (semeCarta == SEMI[0]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    .    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   /.\\\u0020  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C  (_._)  \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    |    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[1]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    _    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   ( )   \u007C" + "           ";
						linee[4] = linee[4] + "\u007C  (_'_)  \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    |    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[2]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    ^    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   / \\\u0020  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    .    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[3]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   _ _   \u007C" + "           ";
						linee[3] = linee[3] + "\u007C  ( v )  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    .    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}				
				}
				else{
					if (semeCarta == SEMI[0]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    .    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   /.\\\u0020  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C  (_._)  \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    |    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[1]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    _    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   ( )   \u007C" + "           ";
						linee[4] = linee[4] + "\u007C  (_'_)  \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    |    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[2]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
						linee[2] = linee[2] + "\u007C    ^    \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   / \\\u0020  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    .    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[3]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   _ _   \u007C" + "           ";
						linee[3] = linee[3] + "\u007C  ( v )  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[5] = linee[5] + "\u007C    .    \u007C" + "           ";
						linee[6] = linee[6] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[7] = linee[7] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}	
				}
			
			
		}
		String risultato = linee[0] + "\n" + linee[1] + "\n" + linee[2] + "\n" + linee[3] + "\n" + linee[4] + "\n" + linee[5] + "\n" + linee[6] + "\n" + linee[7] + "\n";
		return risultato;							
	}
	
}

			 
			 


