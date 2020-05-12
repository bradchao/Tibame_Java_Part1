package tw.brad.tutor;

public class Score1 {

	public static void main(String[] args) {
		double doubleScore = Math.random();
		int intScore = (int)(Math.random()*101); 	// 101 => 取得幾個(101)整數值
		
		System.out.println(intScore);
		if (intScore >= 60) {
			System.out.println("Pass");
		}else {
			System.out.println("Down");
		}
	}

}
