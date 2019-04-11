public class provaMano{
	public static void main(String[] args){
		Mano mano = new Mano();
		try{
			Carta c = new Carta(2, 10);
			//mano.AggiungiCarta(c);
			//System.out.println("c: " + mano.getMano().getCarte()[0].cartaStringa());
			
			Carta cq = new Carta(2, 10);
			//mano.AggiungiCarta(cq);
			//System.out.println("cq: " + mano.getMano().getCarte()[0].cartaStringa());
			
			Carta c1 = new Carta(1, 5, 1);
			mano.AggiungiCarta(c1);
			//System.out.println("c1: " + mano.getMano().getCarte()[51].cartaStringa());
			
			
			for(int i = 0; i <11; i++){
				Carta c3 = new Carta(1, 1);
				mano.AggiungiCarta(c3);
			}
			/*
			Carta c2 = new Carta(2, 1);
			mano.AggiungiCarta(c2);
			//System.out.println("c2: " + mano.getMano().getCarte()[1].cartaStringa());
			Carta c3 = new Carta(3, 1);
			mano.AggiungiCarta(c3);
			Carta c4 = new Carta(4, 1);
			mano.AggiungiCarta(c4);
		*/
			Carta c4 = new Carta(1, 8, 1);
			mano.AggiungiCarta(c4);
			//System.out.println("c4: " + mano.getMano().getCarte()[51].cartaStringa());
			
			System.out.println("Valore: " + mano.aggiornaValore());
			System.out.println(mano.stampaManoASCII(5));
			
		}catch(CartaNonValidaEcc e2){}
	}
}
