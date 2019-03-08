import java.util.Scanner;
public class TestValore{
	public static void main (String[] args){
	Valore val=new Valore(1);
	String n;
	Scanner tastiera=new Scanner(System.in);
	
	n=val.valoreStringa();
	System.out.println("la carta scelta corrisponde a: " + n);
	
	}
}
