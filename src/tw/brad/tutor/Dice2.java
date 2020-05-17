package tw.brad.tutor;

public class Dice2 {

	public static void main(String[] args) {
		int[] p = new int[6];
		
		for ( int i = 0; i< 1000000; i++) {
			int point = (int)(Math.random()*6); // 0 - 5
			p[point]++;
		}

		for (int i=0; i<p.length; i++) {
			System.out.printf("%d點出現%d次\n", (i+1), p[i]);
		}
		
	}

}
