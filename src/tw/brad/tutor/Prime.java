package tw.brad.tutor;

public class Prime {

	public static void main(String[] args) {
		boolean isPrime;
		
		for (int i = 1; i <= 100; i++) {
			
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			System.out.print(i + (isPrime?"*":" ") + " ");
			
			if (i % 10 == 0 )System.out.println();
			
		}
	}

}
