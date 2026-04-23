package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Yamanotesen {
	public static void main(String[] args) throws IOException {

		String[] stations = { "品川", "大崎", "五反田", "目黒",
				"恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保", "高田馬場",
				"目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里",
				"鴬谷", "上野", "御徒町", "秋葉原", "神田", "東京", "有楽町", "新橋",
				"浜松町", "田町", "高輪ゲートウェイ" };

		boolean[] stationFlag = new boolean[stations.length];
		Arrays.fill(stationFlag, true);

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("      ゲームスタート！    \n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();

		boolean hitFlag = false;

		int gameCount = 0;
		do {
			String inputStationName = br.readLine();
			for (int i = 0; i < stations.length; i++) {
				if (stations[i].equals(inputStationName)) {
					if (stationFlag[i]) {
						hitFlag = true;
						stationFlag[i] = false;
						break;
					} else {
						break;
					}
				}
			}

			gameCount++;
			if (!hitFlag || (gameCount == stations.length)) {
				break;
			}

			hitFlag = false;
			while (!hitFlag) {
				int num = rand.nextInt(stations.length);
				if (stationFlag[num]) {
					System.out.println(stations[num]);
					stationFlag[num] = false;
					hitFlag = true;
				}
			}

			gameCount++;
			hitFlag = false;
		} while (gameCount != stations.length);

		if (gameCount == stations.length) {
			System.out.println("あなたの勝ちです！");
		} else {
			System.out.println("あなたの負けです！");
		}
	}
}
