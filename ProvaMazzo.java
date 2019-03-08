public class ProvaMazzo{
	public static void main(String[] args){
		Mazzo mazzo = new Mazzo();
		/*
		
		mazzo.stampaMazzo(true);
		
		try{
			Carta c2 = new Carta(4, 1);
			System.out.println("----------------------------");
			System.out.println(mazzo.cerca(c2));
		}catch(CartaNonValidaEcc e){}
		
		try{
			Carta c3 = new Carta(4, 3);
			System.out.println("-----------INSERISCI---------");
			mazzo.inserisci(c3, 5);
			mazzo.stampaMazzo(false);
		}catch(CartaNonValidaEcc e){}
		*/
		
		mazzo.stampaMazzo(true);
		System.out.println("-----------ESTRAI---------");
		mazzo.estrai(3);
		mazzo.stampaMazzo(true);
		
		try{
			Carta c3 = new Carta(4, 1);
			System.out.println("-----------INSERISCI---------");
			mazzo.inserisci(c3);//, 5);
			mazzo.stampaMazzo(true);
		}catch(CartaNonValidaEcc e){}
		
		try{
			Carta e1 = new Carta(1, 1);
			Carta e2 = new Carta(2, 1);
			Carta[] d = {e1, e2};
			StampaCarte stampa = new StampaCarte(d);
			System.out.println(stampa.StampaggioCarte());

		}catch(CartaNonValidaEcc e){}
	
		
		
	} 
	
	
}
