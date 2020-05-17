package tw.brad.tutor;

public class NineNineV2 {

	public static void main(String[] args) {
		int row = 4;
		int start = 2;
		int col = 5;
		
		for (int k = 0; k<row; k++) {
			for (int j = 1; j<=9; j++) {
				for (int i=start; i<start+col; i++) {
					int newi = i + k * col;
					int r = newi * j;
					System.out.printf("%d x %d = %d\t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println("---");
		}
		
	}

}
