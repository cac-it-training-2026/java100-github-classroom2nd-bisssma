/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int ctrStock = 30;
		int choStock = 30;
		int pisStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + ctrStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + choStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pisStock + "個");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		System.out.println("シトロン      >");
		String ctrCountStr = br.readLine();
		int ctrCount = Integer.parseInt(ctrCountStr);

		System.out.println("ショコラ      >");
		String choCountStr = br.readLine();
		int choCount = Integer.parseInt(choCountStr);

		System.out.println("ピスターシュ  >");
		String pisCountStr = br.readLine();
		int pisCount = Integer.parseInt(pisCountStr);

		System.out.println("\nシトロン" + ctrCount + "個");
		System.out.println("ショコラ" + choCount + "個");
		System.out.println("ピスターシュ" + ctrCount + "個");

		int totalCount = ctrCount + choCount + pisCount;
		int totalPrice = ctrCount * 250 + choCount * 280 + pisCount * 320;

		System.out.println("\n合計個数：" + totalCount + "個");
		System.out.println("合計金額：" + totalPrice + "円");
		System.out.print("\nをお買いあげですね。承りました。");
	}
}
