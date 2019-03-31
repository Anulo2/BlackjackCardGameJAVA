/**
 * Classe che getisce i 4 semi delle carte
 * @version 1.0 (21-02-2019)
 * @author Leonardo Canello, Gabriele Trevisan, Leonardo Daniele, Bogdan Popov, Alberto Bettella e Simone Dassani
 */


public class Seme{
	
	/**
	 * Assegna a picche il valore corrispondente 
	 */
	public static final int PICCHE = 1; 
	/**
	 * Assegna a fiori il valore corrispondente  
	 */
	public static final int FIORI = 2;
	/**
	 * Assegna a quadri il valore corrispondente  
	 */
	public static final int QUADRI = 3; 
	/**
	 * Assegna a cuori il valore corrispondente  
	 */
	public static final int CUORI = 4;
	
	/**
	 * Valore del seme 
	 */
	int s;
	/**
	* Array contenente i nomi dei semi
	*/
	private final String[] SEMI = new String[]{"picche", 
											   "fiori", 
											   "quadri", 
											   "cuori"
											   };
	
	public Seme(int sem) throws CartaNonValidaEcc{
		
		if(!(sem >= 1 && sem < 5)){
			throw new CartaNonValidaEcc();
		}
		s = sem;
	}
	
	/**
	* Restituisce il valore numerico del seme
	* @return valore numerico del nome 
	*/
	public int getS(){
		return s;
	}
	/**
	 * Imposta il valore numerico del seme 
	 * @param sem Valore numerico al quale impostare il seme
	 * @throws CartaNonValidaEcc Se il parametro non è nell intervallo tra 1(compreso) e 4(compreso)
	 */
	public void setS(int sem)throws CartaNonValidaEcc{
		
		if(!( sem >= 1 && sem < 5 )){
			throw new CartaNonValidaEcc();
		}
		s = sem;
	}
	/**
	 * Restituisce il nome completo del seme come stringa 
	 * @return nome completo come stringa 
	 */
	public String semeStringa(){
		return SEMI[s - 1];	
	}
	/**
	 * Confronta se il seme è uguale a un altro restituendo true o false 
	 * @param sem2 oggetto seme sul quale eseguire il confronto
	 * @return confronto tra i due semi
	 */
	public boolean ugualeSeme(Seme sem2){
		return s == sem2.getS();
	}
}
