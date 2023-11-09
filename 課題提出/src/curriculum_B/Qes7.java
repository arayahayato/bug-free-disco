package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		//ユーザーが入力するスキャナーを初期化
		int StudentCount = 0;
		//生徒数を格納する変数を初期化
		System.out.println("生徒の人数を入力してください(2以上)");
		while (StudentCount < 2) {
		//while文で無限ループ　条件を生徒数が2より少ない場合
			StudentCount = scanner.nextInt();
			//変数にユーザーが入力した数字を格納
			if (StudentCount < 2) {
			//StudentCountが２以下の場合下記を表示
				System.out.println("2以上の数字を入力してください");
			} else {
				System.out.println(StudentCount + "人で入力を確認いたしました");

				int[][] grades = new int[StudentCount][4];
				//2次元配列を作成
				String[] subject = { "英語", "数学", "理科", "社会" };
				for (int i = 0; i < StudentCount; i++) {
				//入力した生徒数になるまでループする
					for (int j = 0; j < 4; j++) {
					//４教科分なので４回ループ
						System.out.println((i + 1) + "人目の科目" + subject[j] + "の点数を入力してください");
						//iは0,1,2とはじまるので(i+1)と入力
						grades[i][j] = scanner.nextInt();
						System.out.println(grades[i]);
					}
				}
				double[] StudentAverage = new double[StudentCount];
				for (int i = 0; i < StudentCount; i++) {
					int total = 0;
					for (int j = 0; j < 4; j++) {
						total += grades[i][j];
					}
					StudentAverage[i] = total / 4.0;
				}

				for (int i = 0; i < StudentCount; i++) {
					System.out.println((i + 1) + "人目の平均点は" + StudentAverage[i] + "点です");

				}
				double[] SubjectAverage = new double[4];
				String[] subjects = { "英語", "数学", "理科", "社会" };
				for (int j = 0; j < 4; j++) {
					int total = 0;
					for (int i = 0; i < StudentCount; i++) {
						total += grades[i][j];
					}
					SubjectAverage[j] = total / StudentCount;
				}
				for (int j = 0; j < 4; j++) {
					System.out.println(subjects[j] + "の平均点は" + SubjectAverage[j] + "点です");
				}
			}
		}
		scanner.close();
	}

}
