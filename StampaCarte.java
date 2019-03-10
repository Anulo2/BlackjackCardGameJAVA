public class StampaCarte{
	
	String[] linee = new String[7];
	
	String risultato = "";
	String extra = "";
	
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
		}
	}
	
	
	
	public String StampaggioCarte(int numCarte){
		int lunghezzaArray= d.length;
		int i=0;
		int numRis = 0;
		while(i<lunghezzaArray){
			i= i+numCarte;
			numRis++;
		}
		String[] risultati = new String[numRis];
		numRis=0;
		i=0;
		for(int p = 0; p<linee.length; p++){
			linee[p] = "";
		}
		while(i+numCarte<lunghezzaArray){
			for(int t=i; t<(i+numCarte); t++){
				String semeCarta = SEMI[d[t].getSem().getS() - 1];
				String valoreCarta = VALORI[d[t].getVal().getV() - 1];
				
				if (valoreCarta != "10" ){
					if (semeCarta == SEMI[0]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "   .    \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   /.\\\u0020  \u007C" + "           ";
						linee[3] = linee[3] + "\u007C  (_._)  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
						linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[1]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "   _    \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   ( )   \u007C" + "           ";
						linee[3] = linee[3] + "\u007C  (_'_)  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
						linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[2]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "   ^    \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   / \\\u0020  \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
						linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[3]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "  _ _   \u007C" + "           ";
						linee[2] = linee[2] + "\u007C  ( v )  \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
						linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
						linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}				
				}
				else{
					if (semeCarta == SEMI[0]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "  .    \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   /.\\\u0020  \u007C" + "           ";
						linee[3] = linee[3] + "\u007C  (_._)  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
						linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[1]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "  _    \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   ( )   \u007C" + "           ";
						linee[3] = linee[3] + "\u007C  (_'_)  \u007C" + "           ";
						linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
						linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[2]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + "  ^    \u007C" + "           ";
						linee[2] = linee[2] + "\u007C   / \\\u0020  \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
						linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}
					else if (semeCarta == SEMI[3]){
						linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
						linee[1] = linee[1] + "\u007C" + valoreCarta + " _ _   \u007C" + "           ";
						linee[2] = linee[2] + "\u007C  ( v )  \u007C" + "           ";
						linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
						linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
						linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
						linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
					}	
				}
			}
			risultati[numRis] = linee[0] + "\n" + linee[1] + "\n" + linee[2] + "\n" + linee[3] + "\n" + linee[4] + "\n" + linee[5] + "\n" + linee[6] + "\n";
			for(int p = 0; p<linee.length; p++){
				linee[p] = "";
			}
			i= i+numCarte;
			numRis++;
		
		}
		for(int p = 0; p<linee.length; p++){
			linee[p] = "";
		}
		for(int j= i; j<d.length; j++){
			
			String semeCarta = SEMI[d[j].getSem().getS() - 1];
			
			String valoreCarta = VALORI[d[j].getVal().getV() - 1];
			
			
			if (valoreCarta != "10"){
				if (semeCarta == SEMI[0]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "   .    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   /.\\\u0020  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C  (_._)  \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[1]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "   _    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   ( )   \u007C" + "           ";
					linee[3] = linee[3] + "\u007C  (_'_)  \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[2]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "   ^    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   / \\\u0020  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[3]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "  _ _   \u007C" + "           ";
					linee[2] = linee[2] + "\u007C  ( v )  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}				
			}
			else{
				if (semeCarta == SEMI[0]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "  .    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   /.\\\u0020  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C  (_._)  \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[1]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "  _    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   ( )   \u007C" + "           ";
					linee[3] = linee[3] + "\u007C  (_'_)  \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[2]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "  ^    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   / \\\u0020  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[3]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + " _ _   \u007C" + "           ";
					linee[2] = linee[2] + "\u007C  ( v )  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}	
			}
			
			
		}
		extra = linee[0] + "\n" + linee[1] + "\n" + linee[2] + "\n" + linee[3] + "\n" + linee[4] + "\n" + linee[5] + "\n" + linee[6] + "\n";
		
		for(int p = 0; p< risultati.length; p++){
			risultato= risultato + risultati[p];
		}
		risultato = risultato.substring(0, risultato.length()-4) + extra;
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
					linee[1] = linee[1] + "\u007C" + valoreCarta + "   .    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   /.\\\u0020  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C  (_._)  \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[1]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "   _    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   ( )   \u007C" + "           ";
					linee[3] = linee[3] + "\u007C  (_'_)  \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[2]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "   ^    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   / \\\u0020  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[3]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "  _ _   \u007C" + "           ";
					linee[2] = linee[2] + "\u007C  ( v )  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C        " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}				
			}
			else{
				if (semeCarta == SEMI[0]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "  .    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   /.\\\u0020  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C  (_._)  \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[1]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "  _    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   ( )   \u007C" + "           ";
					linee[3] = linee[3] + "\u007C  (_'_)  \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    |    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[2]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + "  ^    \u007C" + "           ";
					linee[2] = linee[2] + "\u007C   / \\\u0020  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}
				else if (semeCarta == SEMI[3]){
					linee[0] = linee[0] + "\u250C\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510" + "           ";
					linee[1] = linee[1] + "\u007C" + valoreCarta + " _ _   \u007C" + "           ";
					linee[2] = linee[2] + "\u007C  ( v )  \u007C" + "           ";
					linee[3] = linee[3] + "\u007C   \\\u0020/   \u007C" + "           ";
					linee[4] = linee[4] + "\u007C    .    \u007C" + "           ";
					linee[5] = linee[5] + "\u007C       " + valoreCarta + "\u007C" + "           ";
					linee[6] = linee[6] + "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518" + "           ";	
				}	
			}
			
			
		}
		String risultato = linee[0] + "\n" + linee[1] + "\n" + linee[2] + "\n" + linee[3] + "\n" + linee[4] + "\n" + linee[5] + "\n" + linee[6] + "\n";
		return risultato;							
	}
}

			 
			 

