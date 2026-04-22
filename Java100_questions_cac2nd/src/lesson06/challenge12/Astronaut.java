/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {
	String item;

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		// ① 末尾の文字とその位置を特定する
		int lastIndex = item.length() - 1;// 一番最後のインデックス
		char lastch = item.charAt(lastIndex);// 一番最後の1文字を取り出す

		// ② 数字なら英語の文字列に変換する（privateメソッドを呼び出し)
		String changeStr = changeLastChar(lastch);

		if (changeStr != null) {
			// ③ Stringを加工可能なStringBufferに変換する
			StringBuffer sb = new StringBuffer(item);
			// replace(開始位置, 終了位置の直前, 置き換える文字)
			sb.replace(lastIndex, lastIndex + 1, changeStr);

			this.item = new String(sb);// ④加工が終わったので、再びStringに戻して保存する
		} else {
			this.item = item;// 数字じゃなかったらそのまま保存
		}
	}

	private String changeLastChar(char ch) {
		String changeStr = null;
		switch (ch) {
		case '0':
			changeStr = "zero";
			break;
		case '1':
			changeStr = "one";
			break;
		case '2':
			changeStr = "two";
			break;
		case '3':
			changeStr = "three";
			break;
		case '4':
			changeStr = "four";
			break;
		case '5':
			changeStr = "five";
			break;
		case '6':
			changeStr = "six";
			break;
		case '7':
			changeStr = "seven";
			break;
		case '8':
			changeStr = "eight";
			break;
		case '9':
			changeStr = "nine";
			break;
		default:// 数字以外ならnullのまま
			break;
		}
		return changeStr;
	}

}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);

		String item = null;

		//ここに適切な処理を記述する
		item = omegalian.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
