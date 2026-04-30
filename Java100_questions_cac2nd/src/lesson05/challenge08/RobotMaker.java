/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題8  材料によって作るメニューを変える
 *
 * 引数として渡された食材の分量を計算して
 * 的確な料理を返すメソッドを追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  もうちょっと高度な調理機能が欲しいですね。
 *
 *  G博士：
 *  では材料の分量に応じて作るメニューを変える機能を入れてみようかの。
 *
 *  Rさん：
 *  そんなことが出来るんですか！
 *
 *  G博士：
 *  出来るとも。小麦粉170g、砂糖50g、卵1個、バター80gがそろえばクッキーを作る。
 *
 *  G博士：
 *  クッキーが出来ない場合で、卵2個、バター5gがそろえばオムレツを作る。
 *
 *  G博士：
 *  卵のみの場合はゆで卵を作る。
 *
 *  G博士：
 *  それ以外の場合は何も作らないようにするんじゃ。
 *
 *  Rさん：
 *  それは凄そうですね。完成をお待ちしています。
 *
 *  G博士：
 *  ......出来たぞ！早速動かしてみよう。
 *
 *  小麦粉の量を入力してください（グラム）＞○
 *
 *  砂糖の量を入力してください（グラム）＞○
 *
 *  卵の個数を入力してください＞○
 *
 *  バターの量を入力してください（グラム）＞○
 *
 *  <料理を作成する条件を満たす場合の実行例>
 *  【※調理できる料理】が出来ました。
 *
 *  <料理を作成する条件を満たさない場合の実行例>
 *  何も作れません。
 *
 */

package lesson05.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここに問題7で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：makeEggDishes(引数int flourNum, int sugarNum, int eggNum, int butterNum、
//戻り値String、作成できるメニューを戻り値として返す。また、作成できるメニューが無い場合はnull値を返す)
class Robot {
	int energy;
	int water;
	String name;

	void pumpWater() {
		System.out.println("水を" + water + "リットル出します。\n");
	}

	void randomWater() {
		water = (int) (Math.random() * 10) % 9 + 1;
	}

	void setWater(int water) {
		this.water = water;
	}

	// 二つのうち、小さい方の数が実際に作れる人数になる。材料が足りない分は作れない。
	void makeOmelet(int eggNum, int butterNum) {
		int egg = eggNum / 2;
		int butter = butterNum / 5;

		if (egg < butter) {
			System.out.println(egg + "人分のオムレツを作成しました。\n");
		} else {
			System.out.println(butter + "人分のオムレツを作成しました。\n");
		}
	}

	int getWater() {
		return water;
	}

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {
		int flour = flourNum;
		int sugar = sugarNum;
		int egg = eggNum;
		int butter = butterNum;

		String menu = null;
		if (flour >= 170 && sugar >= 50 && egg >= 1 && butter >= 80) {
			menu = "クッキー";
		} else if (egg >= 2 && butter >= 5) {
			menu = "オムレツ";
		} else if (egg > 0) {
			menu = "ゆで卵";
		} else {
			menu = null;
		}

		return menu;
	}
}

public class RobotMaker {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("もうちょっと高度な調理機能が欲しいですね。\n");
		System.out.println("G博士：");
		System.out.println("では材料の分量に応じて作るメニューを変える機能を入れてみようかの。\n");
		System.out.println("Rさん：");
		System.out.println("そんなことが出来るんですか！\n");
		System.out.println("G博士：");
		System.out.println("出来るとも。小麦粉170g、砂糖50g、卵1個、バター80gがそろえばクッキーを作る。\n");
		System.out.println("G博士：");
		System.out.println("クッキーが出来ない場合で、卵2個、バター5gがそろえばオムレツを作る。\n");
		System.out.println("G博士：");
		System.out.println("卵のみの場合はゆで卵を作る。\n");
		System.out.println("G博士：");
		System.out.println("それ以外の場合は何も作らないようにするんじゃ。\n");
		System.out.println("Rさん：");
		System.out.println("それは凄そうですね。完成をお待ちしています。\n");
		System.out.println("G博士：");
		System.out.println("......出来たぞ！早速動かしてみよう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\n砂糖の量を入力してください（グラム）＞");
		String sugarNumStr = br.readLine();
		int sugarNum = Integer.parseInt(sugarNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//makeEggDishesを実行する。
		//標準出力でメニューを表示する。
		Robot robot = new Robot();
		String menu = robot.makeEggDishes(flourNum, sugarNum, eggNum, butterNum);
		if (menu != null) {
			System.out.println(menu + "\nが出来ました。");
		} else {
			System.out.println("\n何も作れません。");
		}
	}

}
