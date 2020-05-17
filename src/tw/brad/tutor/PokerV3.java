package tw.brad.tutor;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		int[] poker = new int[52];
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i = poker.length - 1; i > 0; i--) {
			int rand = (int)(Math.random()*(i+1));
			
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
//		for (int card : poker) {
//			System.out.println(card);
//		}
		
//		System.out.println("----");
//		System.out.println(System.currentTimeMillis() - start);
		

		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			// 1? => 0, 1, 2, 3, 0, 1, 2, 3, .... 
			players[i % 4][ i / 4] = poker[i];
		}
		
		// 0, 1, 2,...12 => 黑桃
		// 13, 14, 15,...25 => 紅心
		String[] suits = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ","8 ",
				"9 ","10","J ","Q ","K "};
		
		for (int[] player : players) {
			Arrays.sort(player);
			for (int card : player) {
				System.out.print(suits[card/13] + values[card%13] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
