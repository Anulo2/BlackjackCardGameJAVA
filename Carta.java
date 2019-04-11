/**
 * Classe per gestire una carta
 *@version 1.0 (21-02-2019)
 * @author Leonardo Canello, Gabriele Trevisan, Leonardo Daniele, Bodgan Popov, Alberto Bettella e Simone Dassani
 */
public class Carta{
	/**
	 * Seme della carta
	 */
	Seme sem;
	/**
	 * Valore della carta
	 */
	Valore val;
	
	int stats;
	
	public Carta(Seme s, Valore v, int status){
		sem = s;
		val = v;
		stats = status;
	}
	public Carta(Seme s, Valore v){
		sem = s;
		val = v;
		stats = 0;
	}
	public Carta(int s, int v)throws CartaNonValidaEcc{
		
		try{
			sem = new Seme(s);
			val = new Valore(v);
			stats = 0;
		}catch(CartaNonValidaEcc e){
			throw new CartaNonValidaEcc();
		}
	}
	
	public Carta(int s, int v, int status)throws CartaNonValidaEcc{
		
		try{
			sem = new Seme(s);
			val = new Valore(v);
			stats = status;
		}catch(CartaNonValidaEcc e){
			throw new CartaNonValidaEcc();
		}
	}
	
	public int getStatus(){
		return stats;
	}
	
	public String getStatusString(){
		return stats==1 ? "Coperta" : "Scoperta";
	}
	
	public void setStatus(int status){
		stats=status;
	}
	
	/**
	 * Restituisce il seme della carta
	 * @return sem, restituiasce il seme della carta
	 */	
 
	public Seme getSem(){
		return sem;
	}
	
	/**
	 * Restituisce il valore della carta
	 * @return val, restituisce il valore della carta
	 */	
	
	public Valore getVal(){
		return val;
	}
	
	/**
	 * Imposta il seme della carta
	 * @param s Oggetto seme
	 */
	
	public void setSem(Seme s){
		sem = s;
	}
	
	/**
	 * Imposta il seme della carta
	 * @param s Valore del seme
	 * @throws CartaNonValidaEcc se il valore non è tra quelli definiti
	 */
	
	public void setSem(int s) throws CartaNonValidaEcc{
		try{	
			sem.setS(s);
		}catch(CartaNonValidaEcc e){
			throw new CartaNonValidaEcc();
		}
	}
	
	/**
	 * Imposta il valore della carta
	 * @param v Oggetto valore al quale impostare la carta
	 */
	
	public void setVal(Valore v){
		val = v;
	}
	
	/**
	 * Imposta il valore della carta
	 * @param v Valore al quale impostare la carta
	 * @throws CartaNonValidaEcc se il valore non è tra quelli definiti
	 */
		
	public void setVal(int v) throws CartaNonValidaEcc{
		
		try{	
			val.setV(v);
		}catch(CartaNonValidaEcc e){
			throw new CartaNonValidaEcc();
		}
	}
	
	/**
	 * Restituisce il nome completo della carta combinando i nomi di seme e valore
	 * @return restituisce il nome della carta
	 */
	
	public String cartaStringa(){
		String valore, seme;
		valore = val.valoreStringa();
		seme = sem.semeStringa();
		return(valore + " di " + seme);
	}
	
	/**
	 * Confronta se la carta è uguale ad un'altra 
	 * @param c carta da confrontare
	 * @return true se le carte sono uguali altrimenti false
	 */
	
	public boolean ugualeCarta(Carta c){
		boolean output;
		Seme s2 = c.getSem();
		Valore v2 = c.getVal();
		int val1, val2, sem1, sem2;
		
		val1 = val.getV();
		val2 = v2.getV();
		sem1 = sem.getS();
		sem2 = s2.getS();
		
		if (sem1 == sem2 && val1 == val2){
			output = true;
		} else {
			output = false;
		 }
		 return output;
	 }
}
