/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double ctrCount = Double.parseDouble(ctrCountStr);

		System.out.println("ショコラ      >");
		String choCountStr = br.readLine();
		double choCount = Double.parseDouble(choCountStr);

		System.out.println("ピスターシュ  >");
		String pisCountStr = br.readLine();
		double pisCount = Double.parseDouble(pisCountStr);

		System.out.println("\nシトロン" + ctrCount + "個");
		System.out.println("ショコラ" + choCount + "個");
		System.out.println("ピスターシュ" + ctrCount + "個\n");

		double totalCount = ctrCount + choCount + pisCount;
		int totalPrice = (int) (ctrCount * 250 + choCount * 280 + pisCount * 320);

		System.out.println("合計個数：" + totalCount + "個");
		System.out.println("合計金額：" + totalPrice + "円");
		System.out.print("をお買いあげですね。承りました。\n");

		ctrStock = (int) (ctrStock - ctrCount);
		choStock = (int) (choStock - choCount);
		pisStock = (int) (pisStock - pisCount);

		System.out.println("--在庫--");
		System.out.println("シトロン      \\250 ・・・ 残り" + ctrStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + choStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pisStock + "個");

	}
}
