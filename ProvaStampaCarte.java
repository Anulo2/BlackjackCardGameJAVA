public class ProvaStampaCarte{
	public static void main(String[] args){
		try{
			Carta e1 = new Carta(1, 1);
			Carta e2 = new Carta(2, 1);
			Carta[] d = {e1, e2};
			StampaCarte stampa = new StampaCarte(d);
			//System.out.println(stampa.StampaggioCarte());
			stampa.StampaggioCarte();

		}catch(CartaNonValidaEcc e){}
	}
}
