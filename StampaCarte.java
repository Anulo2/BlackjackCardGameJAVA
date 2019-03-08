public class StampaCarte{
	
	String[] linee = new String[9];
	
	String risultato = "";
	
	Carta[] d;
	
	private final String[] SEMI = new String[]{"♠", 
											   "♣", 
											   "♦", 
											   "♥"
											   };
	private final String[] VALORI = new String[]{											 
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
			linee[0] = linee[0] + "┌───────── " + "           ";
			linee[1] = linee[1] + "│" + valoreCarta + "        │" + "           ";
			linee[2] = linee[2] + "│         │" + "           ";
			linee[3] = linee[3] + "│         │" + "           ";
			linee[4] = linee[4] + "│    " + semeCarta + "    │" + "           ";
			linee[5] = linee[5] + "│         │" + "           ";
			linee[6] = linee[6] + "│         │" + "           ";	
			linee[7] = linee[7] + "│        " + valoreCarta + "│" + "           ";
			linee[8] = linee[8] + "└─────────┘" + "           ";	
		}
		risultato = linee[0] + "\n" + linee[1] + "\n" + linee[2] + "\n" + linee[3] + "\n" + linee[4] + "\n" + linee[5] + "\n" + linee[6] + "\n" + linee[7] + "\n" + linee[8];
		*/
		d = new Carta[c.length];
		for (int i=0; i<c.length; i++){
			d[i]=c[i];
		}
	}
	
	
	
	
	public String StampaggioCarte(){
		
		for(int i=0; i<d.length; i++){
			String seme = d[i].getSem().semeStringa();
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
			String valore = d[i].getVal().valoreStringa();
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
			for(int d = 0; d<linee.length; d++){
				linee[d] = "";
			}
			linee[0] = linee[0] + "┌───────── " + "           ";
			linee[1] = linee[1] + "│" + valoreCarta + "        │" + "           ";
			linee[2] = linee[2] + "│         │" + "           ";
			linee[3] = linee[3] + "│         │" + "           ";
			linee[4] = linee[4] + "│    " + semeCarta + "    │" + "           ";
			linee[5] = linee[5] + "│         │" + "           ";
			linee[6] = linee[6] + "│         │" + "           ";	
			linee[7] = linee[7] + "│        " + valoreCarta + "│" + "           ";
			linee[8] = linee[8] + "└─────────┘" + "           ";	
		}
		String risultato = linee[0] + "\n" + linee[1] + "\n" + linee[2] + "\n" + linee[3] + "\n" + linee[4] + "\n" + linee[5] + "\n" + linee[6] + "\n" + linee[7] + "\n" + linee[8];
		return risultato;							
	}
}

			 
			 

