/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n閉店時間となりました。またのお越しをお待ちしております。\n");
		System.out.println("\n売上の割合");
		System.out.println("売上合計  \\" + totalPrice);
		System.out.println("内訳\n");
		System.out.println("シトロン      \\" + (int) (250 * ctrCount) + "・・・"
				+ (int) ((250 * ctrCount) / totalPrice * 100) + "%");
		System.out.println("ショコラ      \\" + (int) (280 * choCount) + "・・・"
				+ (int) ((280 * choCount) / totalPrice * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * pisCount) + "・・・"
				+ (int) ((320 * pisCount) / totalPrice * 100) + "%");
	}

}
