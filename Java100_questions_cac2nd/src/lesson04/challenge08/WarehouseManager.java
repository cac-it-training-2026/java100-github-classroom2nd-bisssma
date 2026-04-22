/**
 * 第4章 倉庫番のお仕事
 *
 * 問題8 荷物の入れ替え（二つの配列の要素を入れ替える）
 *
 * AB興産から新たな荷物のセットを預かりました。
 * 5袋からなる荷物のセットで、それぞれ6～10の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定し、
 * それぞれの袋の値は重複しません。
 *
 * AB興産からの依頼は、以前から預かっている1～5の荷物と
 * 今回預かる6～10の荷物を再編し、奇数のみの配列と
 * 偶数のみの配列に分けるというものです。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産から新たに預かった荷物と以前から預かっている荷物の
 *  中身を確認してください。
 *
 *  Yさん：
 *  はい、
 *  以前から預かっている荷物の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  今回預かった荷物の状態は、
 *  7,9,10,6,8
 *  です。
 *
 *  E主任：
 *  その二つの荷物を奇数群、偶数群で入れ替えてください。
 *
 *  Yさん：
 *  はい、入れ替えました。
 *  奇数群の荷物の状態は、
 *  3,5,1,9,7
 *  です。
 *
 *  偶数群の荷物の状態は、
 *  10,2,8,6,4
 *  です。
 *
 */

package lesson04.challenge08;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] luggage1 = new int[5];
		int[] luggage2 = new int[5];

		//ここに重複チェックおよび値の代入処理を記述する①(1～5)
		int inputNum = 0;
		boolean loopFlag = false;

		for (int i = 0; i < luggage1.length; i++) {
			do {
				loopFlag = false;
				inputNum = (int) (Math.random() * 10) % 5 + 1;

				for (int j = 0; j < luggage1.length; j++) {
					if (luggage1[j] == inputNum) {
						loopFlag = true;
						break;
					}
				}

			} while (loopFlag);

			luggage1[i] = inputNum;
		}

		//ここに重複チェックおよび値の代入処理を記述する②(6～10)
		inputNum = 0;
		loopFlag = false;

		for (int i = 0; i < luggage2.length; i++) {
			do {
				loopFlag = false;
				inputNum = (int) (Math.random() * 10) % 10 + 1;

				if (inputNum > 5) {
					for (int j = 0; j < luggage2.length; j++) {
						if (luggage2[j] == inputNum) {
							loopFlag = true;
							break;
						}
					}
				}

			} while (loopFlag);

			luggage2[i] = inputNum;
		}

		System.out.println("E主任：");
		System.out.println("AB興産から新たに預かった荷物と以前から預かっている荷物の");
		System.out.println("中身を確認してください。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("以前から預かっている荷物の状態は、");
		for (int i = 0; i < luggage1.length; i++) {
			System.out.print(luggage1[i]);
			if (i != (luggage1.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("今回預かった荷物の状態は、");
		for (int i = 0; i < luggage2.length; i++) {
			System.out.print(luggage2[i]);
			if (i != (luggage2.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("E主任：");
		System.out.println("その二つの荷物を奇数群、偶数群で入れ替えてください。\n");

		//ここに奇数群(ABKosanArray1)と偶数群(ABKosanArray2)に振り分ける処理を記述する。

		int evenNumberIndex = 0;
		int oddNumberIndex = 0;
		int changeTimes = 0;
		do {
			// ①配列1(luggage1)の中から偶数を探す
			for (int i = evenNumberIndex; i < luggage1.length; i++) {
				if (luggage1[i] % 2 == 0) {
					evenNumberIndex = i;// 見つけたインデックスを保存
					break;// 見つけたのでこのfor文を抜ける
				}
			}
			// ②配列2(luggage2)の中から奇数を探す
			for (int i = oddNumberIndex; i < luggage2.length; i++) {
				if (luggage2[i] % 2 != 0) {
					// ③見つけたら「配列1の偶数」と「配列2の奇数」を入れ替える
					int temp = luggage1[evenNumberIndex];
					luggage1[evenNumberIndex] = luggage2[i];
					luggage2[i] = temp;
					oddNumberIndex = i;// 見つけたインデックスを更新
					changeTimes++;
					break;
				}
			}
		} while (changeTimes < 2);

		System.out.println("Yさん：");
		System.out.println("はい、入れ替えました。");
		System.out.println("奇数群の荷物の状態は、");
		for (int i = 0; i < luggage1.length; i++) {
			System.out.print(luggage1[i]);
			if (i != (luggage1.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		System.out.println("偶数群の荷物の状態は、");
		System.out.println("");
		for (int i = 0; i < luggage2.length; i++) {
			System.out.print(luggage2[i]);
			if (i != (luggage2.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
