package tw.brad.tutor;

public class Score2 {

	public static void main(String[] args) {
		double doubleScore = Math.random();
		int intScore = (int)(Math.random()*101); 	// 101 => 取得幾個(101)整數值
		
		System.out.println(intScore);
		if (intScore >= 90) {
			System.out.println("A");
		}else {
			if (intScore >= 80) {
				System.out.println("B");
			}else {
				if (intScore >= 70) {
					System.out.println("C");
				}else {
					if (intScore >= 60) {
						System.out.println("D");
					}else {
						System.out.println("E");
					}
				}
			}
		}
	}

}
