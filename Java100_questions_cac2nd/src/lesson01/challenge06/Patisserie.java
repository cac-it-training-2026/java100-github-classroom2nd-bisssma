/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		ctrStock = ctrStock - ctrCount;
		choStock = choStock - choCount;
		pisStock = pisStock - pisCount;

		System.out.println("在庫");
		System.out.println("シトロン      \\250 ・・・ 残り" + ctrStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + choStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pisStock + "個");
	}
}
