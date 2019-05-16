import java.util.Scanner;
public class ProvaGiocatore{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.println("Benvenuto nella classe di prova della classe giocatore!\n");
			Giocatore g = new Giocatore();
			int i = 0;
			do{
				System.out.println("Che metodo vuoi provare?\n");
				System.out.println("1) getMano (int), setMano, getMani e setMano");
				System.out.println("2) riceviCarta");
				System.out.println("3) aggiungiVittoria e getVittorie");
				System.out.println("4) reset");
				System.out.println("5) turno");
				System.out.println("6) Esci!\n");
	
				i = input.nextInt();

				switch(i){
					case 1:
						try{
							Carta[] carte = new Carta[2];
							carte[0] = new Carta(4,6);
							carte[1] = new Carta(2,8);
							
							Carta[] carte2 = new Carta[2];
							carte2[0] = new Carta(3,5);
							carte2[1] = new Carta(2,6);
							
							Mano[] mani = new Mano[2];
							for(int j = 0; j < 2; j++)
								mani[j] = new Mano();
							mani[0].setMano(carte);
							mani[1].setMano(carte2);
							
							g.setMani(mani);
							System.out.println("Inserisci 0 oppure 1 per vedere la prima o la seconda mano!");
							int mInt = input.nextInt();
							if(mInt == 0){
								System.out.println("La tua prima mano e':");
								g.getMano(0).getMano().stampaMazzo(false);
							}
							else{
								System.out.println("La tua seconda mano e':");
								g.getMano(1).getMano().stampaMazzo(false);
							}
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						break;
					
					case 2:
						try{
							Carta[] carte = new Carta[2];
							carte[0] = new Carta(4,6);
							carte[1] = new Carta(2,8);
							
							Carta[] carte2 = new Carta[2];
							carte2[0] = new Carta(3,5);
							carte2[1] = new Carta(2,6);
							
							Mano[] mani = new Mano[2];
							for(int j = 0; j < 2; j++)
								mani[j] = new Mano();
							mani[0].setMano(carte);
							mani[1].setMano(carte2);
							
							g.setMani(mani);
							
							System.out.println("Prima mano:");
							g.getMano(0).getMano().stampaMazzo(false);
							
							System.out.println("Seconda mano:");
							g.getMano(1).getMano().stampaMazzo(false);
							
							System.out.println("Ora aggiungero'una carta alla prima e alla seconda mano");
							g.riceviCarta(new Carta(3,10), 0);
							g.riceviCarta(new Carta(3,10), 1);
							
														System.out.println("Prima mano:");
							g.getMano(0).getMano().stampaMazzo(false);
							
							System.out.println("Seconda mano:");
							g.getMano(1).getMano().stampaMazzo(false);
							
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						break;
					case 3:
						System.out.println("Vittorie giocatore: " + g.getVittorie());
						System.out.println("Aggiungo una vittoria...");
						g.aggiungiVittoria();
						System.out.println("Vittorie giocatore: " + g.getVittorie());
						break;
					case 4:
						try{
							Carta[] carte = new Carta[2];
							carte[0] = new Carta(4,6);
							carte[1] = new Carta(2,8);
							
							Carta[] carte2 = new Carta[2];
							carte2[0] = new Carta(3,5);
							carte2[1] = new Carta(2,6);
							
							Mano[] mani = new Mano[2];
							for(int j = 0; j < 2; j++)
								mani[j] = new Mano();
							mani[0].setMano(carte);
							mani[1].setMano(carte2);
							
							g.setMani(mani);
							
							System.out.println("Prima mano:");
							g.getMano(0).getMano().stampaMazzo(false);
							
							System.out.println("Seconda mano:");
							g.getMano(1).getMano().stampaMazzo(false);
							
							System.out.println("Ora resettero' il giocatore senza modificare il numero di vittorie");
							g.reset();
							
							g.aggiungiVittoria();
							System.out.println("Vittorie giocatore: " + g.getVittorie());
							
							
							System.out.println("Prima mano:");
							g.getMano(0).getMano().stampaMazzo(false);
							
							System.out.println("Seconda mano:");
							g.getMano(1).getMano().stampaMazzo(false);
							
							System.out.println("Vittorie giocatore: " + g.getVittorie());
							
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						break;
					case 5:
						try{
							Mazzo m = new Mazzo();
							Carta[] carte = new Carta[2];
							carte[0] = new Carta(4,6);
							carte[1] = new Carta(2,8);
							
							Carta[] carte2 = new Carta[2];
							carte2[0] = new Carta(3,5);
							carte2[1] = new Carta(2,6);
							
							Mano[] mani = new Mano[2];
							for(int j = 0; j < 2; j++)
								mani[j] = new Mano();
							mani[0].setMano(carte);
							
							g.setMani(mani);
							System.out.println("Ora avviero' un turno");
							g.turno(m);
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						break;
				}
			}while (i != 6);
			System.out.println("\nGrazie per aver provato questa classe!\n");
	}
}
