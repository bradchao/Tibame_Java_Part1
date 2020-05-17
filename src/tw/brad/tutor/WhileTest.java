package tw.brad.tutor;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		System.out.print("i = ?");
		Scanner scanner  = new Scanner(System.in);
		int n = scanner.nextInt();
		
		while (i <= n) {
			sum += i++;
		}
		
		System.out.printf("1 + 2 + ... + %d = %d", n, sum);
		System.out.println("\n==");
		
		i = 1;
		sum = 0;
		for ( ; i <= n;  ) {
			sum += i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d", n, sum);
		
		
	}

}
