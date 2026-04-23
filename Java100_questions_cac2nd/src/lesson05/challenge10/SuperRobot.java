package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Robot {
	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {
		if (flourNum >= 170 && sugarNum >= 50 && eggNum >= 1 && butterNum >= 80) {
			return "クッキー";
		} else if (eggNum >= 2 && butterNum >= 5) {
			return "オムレツ";
		} else if (eggNum > 0) {
			return "ゆで卵";
		} else {
			return null;
		}
	}
}

class ClearRobot {
	void clearTable(int[] ingredient) {
		Arrays.fill(ingredient, 0);
	}
}

public class SuperRobot {

	/**
	 * 豪華な料理を作成するメソッド
	 */
	String makeLuxuryDishes(int flour, int sugar, int egg, int butter) {
		System.out.println("SuperRobot：フルパワーで調理を開始します！");

		if (flour >= 500 && butter >= 200 && egg >= 10) {
			return "王室御用達・特製五段デコレーションケーキ";
		} else if (flour >= 300 && sugar >= 150) {
			return "最高級発酵バター香る、至高のガレット・デ・ロワ";
		} else if (egg >= 5 && butter >= 50) {
			return "黒トリュフを贅沢に添えた、究極のトリュフ・オムレツ";
		} else {
			return "シェフ厳選・本日のスペシャリテ";
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Rさん：");
		System.out.println("G博士、これが私の最高傑作「SuperRobot」です！\n");

		// 材料の入力
		System.out.print("小麦粉（g）＞");
		int flour = Integer.parseInt(br.readLine());

		System.out.print("砂糖（g）＞");
		int sugar = Integer.parseInt(br.readLine());

		System.out.print("卵（個）＞");
		int egg = Integer.parseInt(br.readLine());

		System.out.print("バター（g）＞");
		int butter = Integer.parseInt(br.readLine());

		// SuperRobotのインスタンス化
		SuperRobot superRobot = new SuperRobot();

		// 豪華な料理の実行
		String luxuryMenu = superRobot.makeLuxuryDishes(flour, sugar, egg, butter);
		System.out.println("\n【" + luxuryMenu + "】が完成しました！");

		// あとかたづけ
		System.out.println("\nあとかたづけをします。");
		int[] ingredients = { flour, sugar, egg, butter };
		ClearRobot clearRobot = new ClearRobot();
		clearRobot.clearTable(ingredients);

		System.out.println("きれいになりました。");
	}
}