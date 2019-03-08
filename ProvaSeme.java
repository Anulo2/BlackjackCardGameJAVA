import java.util.Scanner;
public class ProvaSeme {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int s, outputI;
		String outputS;
		Seme sem = new Seme(1);
		Seme sem2 = new Seme(2);
		boolean conf;
		
		conf = sem.ugualeSeme(sem2);
		outputS = sem.semeStringa();
		outputI = sem.getS();
		
		System.out.println(conf);
		
		System.out.println("il seme impostatato e': " + outputS + ", il suo valore e': " + outputI);
		
		
		System.out.println("inserisci 1 per avere un seme di picche, 2 per i fiori, 3 per i quadri e 4 per i cuori");
		s = input.nextInt();
		
		sem.setS(s);
		
		outputS = sem.semeStringa();
		outputI = sem.getS();
		
		System.out.println("il seme impostatato e': " + outputS + ", il suo valore e': " + outputI);
		
		
		System.out.println("inserisci 1 per avere un seme di picche, 2 per i fiori, 3 per i quadri e 4 per i cuori");
		s = input.nextInt();
		
		sem.setS(s);
		
		outputS = sem.semeStringa();
		outputI = sem.getS();
		
		System.out.println("il seme impostatato e': " + outputS + ", il suo valore e': " + outputI);
		
		
		System.out.println("inserisci 1 per avere un seme di picche, 2 per i fiori, 3 per i quadri e 4 per i cuori");
		s = input.nextInt();
		
		sem.setS(s);
		
		outputS = sem.semeStringa();
		outputI = sem.getS();
		
		System.out.println("il seme impostatato e': " + outputS + ", il suo valore e': " + outputI);
		
		
		System.out.println("inserisci 1 per avere un seme di picche, 2 per i fiori, 3 per i quadri e 4 per i cuori");
		s = input.nextInt();
		
		sem.setS(s);
		
		outputS = sem.semeStringa();
		outputI = sem.getS();
		
		System.out.println("il seme impostatato e': " + outputS + ", il suo valore e': " + outputI);
	}
}
		
		
		
		
		
