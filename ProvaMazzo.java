public class ProvaMazzo{
	public static void main(String[] args){
		Mazzo mazzo = new Mazzo(2, 1);
		
		System.out.println(mazzo.stampaMazzoASCII(4));
		
		try{
			Carta c2 = new Carta(4, 1, 0);
			System.out.println("----------------------------");
			System.out.println(mazzo.cerca(c2));
		}catch(CartaNonValidaEcc e){}
		
		try{
			Carta c3 = new Carta(4, 3, 0);
			System.out.println("-----------INSERISCI---------");
			mazzo.inserisci(c3, 5);
			System.out.println(mazzo.stampaMazzoASCII(4));
		}catch(CartaNonValidaEcc e){
			System.out.println(e.getMessage());
			}
		
		mazzo.stampaMazzoASCII(4);
		System.out.println("-----------ESTRAI---------");
		mazzo.estrai(3);
		System.out.println(mazzo.stampaMazzoASCII(4));

		try{
			Carta c3 = new Carta(4, 1, 0);
			System.out.println("-----------INSERISCI---------");
			mazzo.inserisci(c3);//, 5);
			System.out.println(mazzo.stampaMazzoASCII(4));
		}catch(CartaNonValidaEcc e){}

		
	} 
}
