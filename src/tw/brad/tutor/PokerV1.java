package tw.brad.tutor;

public class PokerV1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] poker = new int[52];	// poker[0]=0; poker[1]=0; ....poker[51]=0;
		boolean isDup;
		
		
		for (int i=0; i<poker.length; i++) {
			int rand = (int)(Math.random()*52); // 0-51
			
			// 檢查機制
			isDup = false;
			for (int j=0; j<i; j++) {
				if (rand == poker[j]) {
					isDup = true;
					break;
				}
			}
			
			if (!isDup) {
				poker[i] = rand;
			}else {
				i--;
			}
		}
		
		for (int card : poker) {
			System.out.println(card);
		}
		
		System.out.println("----");
		System.out.println(System.currentTimeMillis() - start);
	}

}
