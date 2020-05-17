package tw.brad.tutor;

public class DiceCheat {

	public static void main(String[] args) {
		int[] p = new int[6];
		
		for ( int i = 0; i< 1000000; i++) {
			int point = (int)(Math.random()*9); // 0 - 8; 0-5; 6,7,8 => 3,4,5
			p[point>=6?point-3:point]++;
		}

		for (int i=0; i<p.length; i++) {
			System.out.printf("%d點出現%d次\n", (i+1), p[i]);
		}
	}

}
