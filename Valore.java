/**
 * Classe che rappresenta il valore delle carte.
 * @version 1.0 (21-02-2019)
 * @author Leonardo Canello, Gabriele Trevisan, Leonardo Daniele, Bodan Popov, Alberto Bettellella e Simone Dassani
 */

public class Valore{
	
	public static final int    ASSO = 1;
	public static final int     DUE = 2;
	public static final int     TRE = 3;
	public static final int QUATTRO = 4;
	public static final int  CINQUE = 5;
	public static final int     SEI = 6;
	public static final int   SETTE = 7;
	public static final int    OTTO = 8;
	public static final int    NOVE = 9;
	public static final int   DIECI = 10;
	public static final int    JACK = 11;
	public static final int   DONNA = 12;
	public static final int      RE = 13;
	
	/**
	 * Attributo che conterrà uno dei valori precedenti
	 */
	private 			int       v     ;
	
	private final String[] VALORI = new String[]{/*"asso",  
												 "2", 
												 "3", 
												 "4", 
												 "5", 
												 "6", 
												 "7", 
												 "8", 
												 "9", 
												 "10", 
												 "jack", 
												 "donna", 
												 "re",*/
												 
												 "asso",  
												 "due", 
												 "tre", 
												 "quattro", 
												 "cinque", 
												 "sei", 
												 "sette", 
												 "otto", 
												 "nove", 
												 "dieci", 
												 "jack", 
												 "donna", 
												 "re"
												 };
	
	public Valore(int val)throws CartaNonValidaEcc{
		
		if(!(val >= 1 && val < 14)){
			throw new CartaNonValidaEcc();
		}
		v = val;
	}
	
	/**
	 * Restituisce il valore
	 * @return Valore
	 */
	public int getV(){
		return v;
	}
	
	/**
	 * Imposta il valore
	 * @throws CartaNonValidaEcc se il valore non è tra quelli definiti
	 * @param val Valore che verrà assegnato
	 */
	public void setV(int val) throws CartaNonValidaEcc{
		
		if(!(val >= 1 && val < 14)){
			throw new CartaNonValidaEcc();
		}
		v = val;
	}
	
	/**
	 * Restituisce il nome completo del valore
	 * @return Nome completo del Valore
	 */
	public String valoreStringa(){
		return VALORI[v-1];
	}
	
	/**
	 * Confronta se il valore è uguale a un altro
	 * @param v2 Valore con il quale eseguire il confronto
	 * @return Risultato del confronto
	 */
	public boolean ugualeValore(Valore v2){
		return v == v2.getV();
	}
	
	
}
