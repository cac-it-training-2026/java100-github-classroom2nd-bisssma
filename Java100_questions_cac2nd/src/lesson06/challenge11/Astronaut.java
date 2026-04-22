/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題11 Stringクラス③（indexOf）
 *
 * 宇宙船が次の目的地γ星に到着しました。
 * γ星は不思議な星です。γ星人たちは
 * 名前に数字が入っているものを珍重しています。
 * 例えば、「アリナミン5」は大事にしていますが
 * 「アリナミンEX」は大事にしていません。
 *
 * γ星人クラスGammalianを新たに作成してください。
 * GammalianはString型フィールドitem、boolean型フィールドisGood
 * を持ち、メソッドsetItem()で登録します。setItem()は文字列中に
 * 数字が含まれていれば、isGoodをtrueにした後にitemに登録し、
 * 含まれていなければ、isGoodをfalseにした後に登録します。
 *
 * <実行例1>
 *
 * γ星人にアイテムを渡してください＞TanquerayNo.10
 *
 * γ星人：
 * こんな良いものをもらっていいガンマか！
 * ゆっくりしていくガンマ。
 *
 * <実行例2>
 *
 * γ星人にアイテムを渡してください＞orange
 *
 * γ星人：
 * ...ありがとガンマ。
 * ぶぶ漬けでもいかがガンマか？
 *
 */

package lesson06.challenge11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにGammalianクラスを記述する
class Gammalian {
	String item;
	boolean isGood;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		boolean isHit = false;// 数字が見つかったかどうかを判定する
		for (int i = 0; i < 10; i++) {
			String target = Integer.toString(i);// ①数字のi(0, 1, 2...)を文字列("0", "1", "2"...)に変換
			if (item.indexOf(target) != -1) {// 見つかった場合はその位置（0以上）が返り、見つからなかった場合は-1が返ってくる
				isHit = true;
				break;// 1つでも数字が見つかればOKなので、残りの数字は探さず終了
			}
		}
		if (isHit) {
			this.isGood = true;
		} else {
			this.isGood = false;
		}

		this.item = item;
	}

	public boolean getIsGood() {
		return isGood;
	}

	public void setIsGood(boolean isGood) {
		this.isGood = isGood;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("γ星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Gammalian gammalian = new Gammalian();
		gammalian.setItem(present);

		boolean isGood = false;//定義しておかなきゃいけないルール

		//ここに適切な処理を記述する
		isGood = gammalian.getIsGood();

		System.out.println("\nγ星人：");
		if (isGood) {
			System.out.println("こんな良いものをもらっていいガンマか！");
			System.out.println("ゆっくりしていくガンマ。");
		} else {
			System.out.println("...ありがとガンマ。");
			System.out.println("ぶぶ漬けでもいかがガンマか？");
		}
	}
}
