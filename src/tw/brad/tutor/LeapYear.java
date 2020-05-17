package tw.brad.tutor;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Year = ");
		int year = scanner.nextInt();
		boolean isLeap = false;
		
		if ( year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 潤
					isLeap = true;
				}else {
					// 平
					isLeap = false;
				}
			}else {
				// 潤
				isLeap = true;
			}
		}else {
			// 平
			isLeap = false;
		}
		
		System.out.println(year + " => " + (isLeap?"潤":"平") + "年");
		
		
		
	}

}
