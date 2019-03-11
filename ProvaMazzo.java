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
		
		/*
		System.out.println("-----------ESTRAI---------");
		mazzo.estrai(3);
		mazzo.stampaMazzo(true);
		*/
		
		/*
		try{
			Carta c3 = new Carta(4, 1);
			System.out.println("-----------INSERISCI---------");
			mazzo.inserisci(c3);//, 5);
			mazzo.stampaMazzo(true);
		}catch(CartaNonValidaEcc e){}
		*/
		
			//mazzo.mescola();
			System.out.println(mazzo.stampaMazzoASCII(8));
			

	
		
		
	} 
	
	
}
