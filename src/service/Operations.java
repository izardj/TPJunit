package service;

public class Operations {

	public static long add(long... numbers){
		if(numbers.length > 0){
			long resultat = 0;
			for(long n : numbers){
				resultat += n;
			}
			return resultat;
		}
		return 0;
	}
	
	public static long mult(long... numbers){
		if(numbers.length > 0){
			long resultat = 1;
			for (long n : numbers){
				resultat *= n;
			}
			return resultat;
		}
		else {
			return 0;
		}
	}

}
