import java.util.Scanner;
public class ProvaCarta {
	public static void main(String[] args) {
		
		Scanner tastiera = new Scanner(System.in);
		try{
			Seme s = new Seme(1);
			Valore v = new Valore(1);
			int so = 1;
			int vo = 1;
			
			Carta c = new Carta(s,v);
			System.out.println(c.cartaStringa());
			
			Carta co = new Carta(so,vo);
			System.out.println(co.cartaStringa());
			
			System.out.println(c.getSem().semeStringa());
			System.out.println(c.getVal().valoreStringa());
			
			Seme a = new Seme(2);
			
			c.setSem(a);
			
			c.setSem(2);
			
			Valore b = new Valore(2);
			c.setVal(b);
			
			c.setSem(2);
			
			System.out.println(c.cartaStringa());
			
			
			Carta secondo = new Carta(3,3);
			
			System.out.println(c.ugualeCarta(secondo));
		}catch(CartaNonValidaEcc e){
			System.out.println(e.getMessage());
		}

}
}
