public class ProvaStampaCarte{
	public static void main(String[] args){
		try{
			Carta e1 = new Carta(1, 1);
			Carta e2 = new Carta(2, 1);
			Carta e3 = new Carta(3, 9);
			Carta e4 = new Carta(4, 10);
			Carta[] d = {e1, e2, e3, e4};
			StampaCarte stampa = new StampaCarte(d);
			//System.out.println(stampa.StampaggioCarte());
			stampa.StampaggioCarte();

		}catch(CartaNonValidaEcc e){}
	}
}
