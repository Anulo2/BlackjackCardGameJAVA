public class CarteNonSuffEcc extends Exception {
	CarteNonSuffEcc(int n){
		super ("il numero di carte da copiare nel mazzo è minore di " + n);
	 }
}
