import java.util.Scanner;
import java.util.InputMismatchException;
public class Giocatore{
	
	private Mano[] mano;
	private Mazzo mazzo;
	private int vittorie;
	
	public Giocatore(){
		mano = new Mano[2];
		
		for(int i = 0; i < 2; i++)
			mano[i] = new Mano();
		
		vittorie = 0;
	}
	
	
	private void split(){
		Mano m, m2;
		m  = mano[0];
		m2 = mano[1];
		
		m2.aggiungiCarta(m.estraiSplit(1));
		m.setCartaNull(1);
		
		mano[0] = m;
		mano[1] = m2;
		
		mano[0].aggiungiCarta(mazzo.estrai());
		mano[1].aggiungiCarta(mazzo.estrai());
		
		mano[0].azzeraValore();
		mano[0].aggiornaValore();
		
		mano[1].aggiornaValore();
		System.out.println("------------------Split------------------\n\n");
		System.out.println("---------------prima mano----------------\n");
		System.out.println(mano[0].stampaManoASCII(6));
		System.out.println("Valore mano: " + mano[0].getValore());
		System.out.println("-----------------------------------------\n\n");

		System.out.println("--------------seconda mano---------------\n");
		System.out.println(mano[1].stampaManoASCII(6));
		System.out.println("Valore mano: " + mano[1].getValore());
		System.out.println("-----------------------------------------\n");
	}
	
	public Mano getMano(int n){
		return mano[n];
	}
	
	public Mano[] getMani(){
		return mano;
	}
	
	public void setMano(int n, Mano m){
		mano[n] = m;
	}
	
	public void setMani(Mano[] m){
		mano = m;
	}
	
	public void riceviCarta(Carta c, int n){
		mano[n].aggiungiCarta(c);
	}
	
	public void aggiungiVittoria(){
		vittorie += 1; 
	}
	
	public int getVittorie(){
		return vittorie;
	}
	
	public void reset(){
		mano = null;
		mano = new Mano[2];
		
		for(int i = 0; i < 2; i++)
			mano[i] = new Mano();
	
	}
	
	private int getInput(){
		Scanner input = new Scanner(System.in);
		int n = -1;
		boolean ok = false;
		do{
			try{
				n = input.nextInt();
				ok = true;
			}catch(InputMismatchException e){input.next();}
		}while(!ok);
		return n;
	}
	
	private boolean miniTurno(int n){
		Scanner input = new Scanner(System.in);
		boolean output = false;
		int is = -1;
		
		while(is != 1 && is != 2){
			
			mano[n].aggiornaValore();
			if(mano[n].getValore() >= 21){
				is = 2;
				System.out.println(mano[n].stampaManoASCII(6));
				if(n == 0){
					System.out.println("\nTurno con la prima mano\n");
					System.out.println("Valore prima mano: " + mano[0].getValore() + "\n");
				}else if(n == 1){
					System.out.println("\nTurno con la seconda mano\n");
					System.out.println("Valore seconda mano: " + mano[1].getValore() + "\n");
				}
			}else{
				System.out.println(mano[n].stampaManoASCII(6));
				if(n == 0){
					System.out.println("\nTurno con la prima mano\n");
					System.out.println("Valore prima mano: " + mano[0].getValore() + "\n");
				}else if(n == 1){
					System.out.println("\nTurno con la seconda mano\n");
					System.out.println("Valore seconda mano: " + mano[1].getValore() + "\n");
				}
				
				System.out.println("inserire 1 per pescare una carta, 2 per fermarti");
				is = getInput();
				System.out.println();
				
			}
		
			if(is == 1){
				mano[n].aggiungiCarta(mazzo.estrai());
				if(mano[n].getValore() >= 21){
					System.out.println(mano[n].stampaManoASCII(6));
					System.out.println(n == 0 ? "Valore prima mano: " + mano[0].getValore() + "\n" : "Valore seconda mano: " + mano[1].getValore() + "\n");
				}
				output = n == 0 ? false : true;
				if(mano[n].getValore() >= 21)
					output = n == 1 ? false : true;
			}else{
				output = n == 1 ? false : true;
			}
		}
		return output;
	}

	
	public Mazzo turno(Mazzo m){
		
		Scanner input = new Scanner(System.in);
		mazzo = m;
	
		boolean fT1 = false;
		boolean fT2 = true;
		boolean fT3 = true;
		
		int is = -1;
		
		int v1 = mano[0].getMano().getCarte()[0].getVal().getV();
		v1 = v1 < 10 ? v1 : 10;
		
		int v2 = mano[0].getMano().getCarte()[1].getVal().getV();
		v2 = v2 < 10 ? v2 : 10;
		
		if (v1 == v2){
			while(is != 1 && is != 2 && is != 3){
				mano[0].aggiornaValore();
				if(mano[0].getValore() >= 21){
					is = 3;
				}else{
					System.out.println(mano[0].stampaManoASCII(6));
					System.out.println("\nTurno con la prima mano\n");
					System.out.println("Valore prima mano: " + mano[0].getValore() + "\n");
					System.out.println("inserire 1 per pescare una carta nella mano, 2 per dividere la mano, 3 per fermarti");
					is = getInput();
					System.out.println();
				}
				if(is == 1){
					mano[0].aggiungiCarta(mazzo.estrai());
				}else if(is == 2){
					split();
					fT2 = false;
				}else{
					fT1 = true;
				}
			}
		}else{
			fT1 = miniTurno(0);
		}
		
		if(!fT1 || !fT2){
			while(!fT1){
				
				fT1 = miniTurno(0); 
			}
			if(!fT2){
				while(fT3){
					fT3 = miniTurno(1);
				}
			}
		}
		return mazzo;		
	}
}
