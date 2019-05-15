import java.util.Scanner;
public class ProvaMano{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.println("Benvenuto nella classe di prova della classe mano!\n");
			Mano mano = new Mano();
			int i = 0;
			do{
				System.out.println("Che metodo vuoi provare?\n");
				System.out.println("1) aggiungiCarta");
				System.out.println("2) estraiSplit (Carta)");
				System.out.println("3) getMano");
				System.out.println("4) setMano (array di carte)");
				System.out.println("5) setCartaNull");
				System.out.println("6) estraiSplit (int)");
				System.out.println("7) azzeraValore");
				System.out.println("8) aggiornaValore");
				System.out.println("9) getValore");
				System.out.println("10) getCarte");
				System.out.println("11) Esci!\n");
	
				i = input.nextInt();
				mano.getMano().setCarteNull();
				switch(i){
					case 1:
						System.out.println("\nOra aggiungero' una carta alla mano!\n");
						try{
							Carta c = new Carta(1,1);
							mano.aggiungiCarta(c);
							System.out.println("Di seguito verra' mostrata la mano dopo l'aggiunta.\n");
							mano.getMano().stampaMazzo(true);
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						System.out.println("Ho aggiunto un asso di picche!\n");
						break;
					case 2:
						System.out.println("\nOra estrarro' una carta dalla mano!\n");
						try{
							Carta card = new Carta(2,1);
							mano.aggiungiCarta(card);
							System.out.println("Di seguito verra' mostrata la mano prima dell'estrazione.\n");
							mano.getMano().stampaMazzo(true);
							System.out.println("Ora estrarro' una carta dalla mano!\n");
							mano.estraiSplit(card);
							System.out.println("Ho estratto un asso di fiori!\n");
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						break;
					case 3:
						try{
							Carta[] carte = new Carta[4];
							carte[0] = new Carta(1,1);
							carte[1] = new Carta(2,1);
							carte[2] = new Carta(3,1);
							carte[3] = new Carta(4,1);
							mano.setMano(carte);
							System.out.println("\nOra restituiro' la mano!\n");
							System.out.println("ATTENZIONE!\n");
							System.out.println("Essendo un oggetto restituira' il suo indirizzo in memoria.\n");
							System.out.println(mano.getMano() + "\n");
							System.out.println("Ora ti mostrero' la mano sotto forma di lista di carte!\n");
							mano.getMano().stampaMazzo(true);
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						break;
					case 4:
						System.out.println("\nOra impostero' un arry di carte come mano!\n");
						try{
							Carta[] carte = new Carta[4];
							carte[0] = new Carta(1,1);
							carte[1] = new Carta(2,1);
							carte[2] = new Carta(3,1);
							carte[3] = new Carta(4,1);
							mano.setMano(carte);
							System.out.println("Ora mostrero' la mano in seguito all'aggiunta dell'array!\n");
							mano.getMano().stampaMazzo(true);
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						System.out.println("Ho impostato 4 assi dei diversi semi come mano!\n");
						break;
					case 5:
						System.out.println("\nOra impostero' una carta della tua mano a volore NULL!\n");
						try{
							Carta[] carte = new Carta[4];
							carte[0] = new Carta(2,1);
							carte[1] = new Carta(1,1);
							carte[2] = new Carta(3,1);
							carte[3] = new Carta(4,1);
							mano.setMano(carte);
							System.out.println("Ora mostrero' la mano precedentemente e in seguito!\n");
							mano.getMano().stampaMazzo(true);
							mano.setCartaNull(0);
							mano.getMano().stampaMazzo(true);
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						System.out.println("Ho impostato la prima carta della tua mano a valore NULL!\n");
						break;
					case 6:
						System.out.println("\nOra estrarrò una carta della tua mano!\n");
						try{
							Carta[] carte = new Carta[4];
							carte[0] = new Carta(2,1);
							carte[1] = new Carta(1,1);
							carte[2] = new Carta(3,1);
							carte[3] = new Carta(4,1);
							mano.setMano(carte);
							System.out.println("Ora mostrero' la mano precedentemente e in seguito!\n");
							mano.getMano().stampaMazzo(true);
							mano.estraiSplit(0);
							mano.getMano().stampaMazzo(true);
							System.out.println("Ho estratto la prima carta della mano!\n");
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						break;
					case 7:
						System.out.println("\nOra azzerero' il valore della mano!\n");
						mano.azzeraValore();
						System.out.println("Valore della mano azzerato con successo a 0!\n");
						break;
					case 8:
						System.out.println("\nOra aggiornero' il valore della tua mano basandomi sulle carte che possiedi!\n");
						try{
							Carta[] carte = new Carta[4];
							carte[0] = new Carta(1,1);
							carte[1] = new Carta(2,1);
							carte[2] = new Carta(3,1);
							carte[3] = new Carta(4,1);
							mano.setMano(carte);
							mano.aggiornaValore();
							System.out.println("Ora mostrero' la tua mano!\n");
							mano.getMano().stampaMazzo(true);
							System.out.println("Il valore della tua mano e': " + mano.aggiornaValore() + "\n");
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						break;
					case 9:
						System.out.println("\nOra mostrero' il valore memorizzato in questo momento!\n");
						System.out.println("Il valore in questo momento risulta essere: " + mano.getValore() + "\n");
						break;
					case 10:
						try{
							Carta[] carte = new Carta[4];
							carte[0] = new Carta(1,1);
							carte[1] = new Carta(2,1);
							carte[2] = new Carta(3,1);
							carte[3] = new Carta(4,1);
							mano.setMano(carte);
							System.out.println("\nOra restiruiro' le tue carte!\n");
							System.out.println("ATTENZIONE!\n");
							System.out.println("Essendo un oggetto restituira' il suo indirizzo in memoria.\n");
							System.out.println(mano.getCarte() + "\n");
							System.out.println("Ora ti mostrerlo' la mano sotto forma di lista di carte!\n");
							mano.getMano().stampaMazzo(true);
						}catch(CartaNonValidaEcc e){
							System.out.println(e.getMessage());
						}
						break;
				}
			}while (i!=11);
			System.out.println("\nGrazie per aver provato questa classe!\n");
	}
}
