public class StampaCarte{
	
	String[] linee = new String[7];
	
	String risultato = "";
	
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
		/*
		for(int i=0; i<c.length; i++){
			String seme = c[i].getSem().semeStringa();
			String semeCarta = "";
			switch (seme) {
				case "picche":
					semeCarta = SEMI[0];
				case "fiori":
					semeCarta = SEMI[1];
				case "quadri":
					semeCarta = SEMI[2];
				case "cuori":
					semeCarta = SEMI[3];
			}
			String valore = c[i].getVal().valoreStringa();
			String valoreCarta = "";
			switch (valore) {
				case "asso":
					valoreCarta = VALORI[0];
				case "due":
					valoreCarta = VALORI[1];
				case "tre":
					valoreCarta = VALORI[2];
				case "quattro":
					valoreCarta = VALORI[3];
				case "cinque":
					valoreCarta = VALORI[4];
				case "sei":
					valoreCarta = VALORI[5];
				case "sette":
					valoreCarta = VALORI[6];
				case "otto":
					valoreCarta = VALORI[7];
				case "nove":
					valoreCarta = VALORI[8];
				case "dieci":
					valoreCarta = VALORI[9];
			}
			linee[0] = linee[0] + "\u250C\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F " + "           ";
			linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
			linee[2] = linee[2] + "\u007C         \u007C" + "           ";
			linee[3] = linee[3] + "\u007C         \u007C" + "           ";
			linee[4] = linee[4] + "\u007C    " + semeCarta + "    \u007C" + "           ";
			linee[5] = linee[5] + "\u007C         \u007C" + "           ";
			linee[6] = linee[6] + "\u007C         \u007C" + "           ";	
			linee[7] = linee[7] + "\u007C        " + valoreCarta + "\u007C" + "           ";
			linee[8] = linee[8] + "\u2514\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u2518" + "           ";	
		}
		* 
		risultato = linee[0] + "\n" + linee[1] + "\n" + linee[2] + "\n" + linee[3] + "\n" + linee[4] + "\n" + linee[5] + "\n" + linee[6] + "\n" + linee[7] + "\n" + linee[8];
		*/
		d = new Carta[c.length];
		for (int i=0; i<c.length; i++){
			d[i]=c[i];
		}
	}
	
	
	
	
	public String StampaggioCarte(){
		System.out.println(d.length);
		for(int p = 0; p<linee.length; p++){
			linee[p] = "";
		}
		for(int i=0; i<d.length; i++){
			String seme = d[i].getSem().semeStringa();
			
			System.out.println(seme);
			
			String semeCarta = "";
			switch (seme) {
				case "picche":
					semeCarta = SEMI[0];
				break;
				case "fiori":
					semeCarta = SEMI[1];
				break;
				case "quadri":
					semeCarta = SEMI[2];
				break;
				case "cuori":
					semeCarta = SEMI[3];
				break;
			}
			
			System.out.println(semeCarta);
			
			String valore = d[i].getVal().valoreStringa();
			
			System.out.println(valore);
			
			String valoreCarta = "";
			switch (valore) {
				case "asso":
					valoreCarta = VALORI[0];
				break;
				case "due":
					valoreCarta = VALORI[1];
				break;
				case "tre":
					valoreCarta = VALORI[2];
				break;
				case "quattro":
					valoreCarta = VALORI[3];
				break;
				case "cinque":
					valoreCarta = VALORI[4];
				break;
				case "sei":
					valoreCarta = VALORI[5];
				break;
				case "sette":
					valoreCarta = VALORI[6];
				break;
				case "otto":
					valoreCarta = VALORI[7];
				break;
				case "nove":
					valoreCarta = VALORI[8];
				break;
				case "dieci":
					valoreCarta = VALORI[9];
				break;
			}
			System.out.println(valoreCarta);
			
			
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
				linee[0] = linee[0] + "\u250C\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u2510" + "           ";
				linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
				linee[3] = linee[3] + "\u007C         \u007C" + "           ";
				linee[4] = linee[4] + "\u007C    " + semeCarta + "    \u007C" + "           ";
				linee[5] = linee[5] + "\u007C         \u007C" + "           ";	
				linee[6] = linee[6] + "\u007C       " + valoreCarta + "\u007C" + "           ";
				linee[7] = linee[7] + "\u2514\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u2518" + "           ";	
			}
			
			
			/*
			if (valoreCarta != "10"){
				linee[0] = linee[0] + "\u250C\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u2510" + "           ";
				System.out.println(linee[0]);
				linee[1] = linee[1] + "\u007C" + valoreCarta + "        \u007C" + "           ";
				System.out.println(linee[1]);
				linee[2] = linee[2] + "\u007C         \u007C" + "           ";
				System.out.println(linee[2]);
				linee[3] = linee[3] + "\u007C         \u007C" + "           ";
				System.out.println(linee[3]);
				linee[4] = linee[4] + "\u007C    " + semeCarta + "    \u007C" + "           ";
				System.out.println(linee[4]);
				linee[5] = linee[5] + "\u007C         \u007C" + "           ";
				System.out.println(linee[5]);
				linee[6] = linee[6] + "\u007C         \u007C" + "           ";	
				System.out.println(linee[6]);
				linee[7] = linee[7] + "\u007C        " + valoreCarta + "\u007C" + "           ";
				System.out.println(linee[7]);
				linee[8] = linee[8] + "\u2514\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u2518" + "           ";	
				System.out.println(linee[8]);
			}
			else{
				linee[0] = linee[0] + "\u250C\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u2510" + "           ";
				System.out.println(linee[0]);
				linee[1] = linee[1] + "\u007C" + valoreCarta + "       \u007C" + "           ";
				System.out.println(linee[1]);
				linee[2] = linee[2] + "\u007C         \u007C" + "           ";
				System.out.println(linee[2]);
				linee[3] = linee[3] + "\u007C         \u007C" + "           ";
				System.out.println(linee[3]);
				linee[4] = linee[4] + "\u007C    " + semeCarta + "    \u007C" + "           ";
				System.out.println(linee[4]);
				linee[5] = linee[5] + "\u007C         \u007C" + "           ";
				System.out.println(linee[5]);
				linee[6] = linee[6] + "\u007C         \u007C" + "           ";	
				System.out.println(linee[6]);
				linee[7] = linee[7] + "\u007C       " + valoreCarta + "\u007C" + "           ";
				System.out.println(linee[7]);
				linee[8] = linee[8] + "\u2514\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u005F\u2518" + "           ";	
				System.out.println(linee[8]);	
			}
			*/
		}
		String risultato = linee[0] + "\n" + linee[1] + "\n" + linee[2] + "\n" + linee[3] + "\n" + linee[4] + "\n" + linee[5] + "\n" + linee[6] + "\n";
		System.out.println(risultato);
		return risultato;							
	}
}

			 
			 

