/**
 * 第7章 武士のお仕事
 *
 * 問題7  toString()メソッドの利用
 *
 * toString()メソッドを適切にオーバーライドする。
 *
 * 問題4で作成した藩士クラスと問題5で作成した浪人クラスで
 * それぞれtoString()メソッドをオーバーライドし、<実行例>
 * と同じ結果になるように適切な処理記述しなさい。
 * （※Samuraiクラスにフィールドprotected String nameを追記）
 * （※藩士、浪人ともに名前はコンストラクタで設定する）
 * （※System.out.printlnを利用する）
 *
 * <実行例>
 * 藩士クラスのtoString()メソッドを確認します。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 *
 * 浪人クラスのtoString()メソッドを確認します。
 *
 * 拙者は武州○△□村の浪人、テスト兵衛ともうす。
 *
 */

package lesson07.challenge07;

class Samurai {

	//ここにフィールドnameを記述
	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

//ここにRetainerクラスを記述
class Retainer extends Samurai {

	public Retainer(String name) {
		this.name = name;
	}

	void getPaid() {
		System.out.println("給料をもらうよ～。");
	}

	void work() {
		System.out.println("年貢を取り立てるよ～。");
	}

	@Override
	public String toString() {
		return "拙者は○△□藩士、" + name + "ともうす。";
	}
}

//ここにRoninクラスを記述
class Ronin extends Samurai {

	public Ronin(String name) {
		this.name = name;
	}

	void covered() {
		System.out.println("傘張りするよ～。");
	}

	void work() {
		System.out.println("傘張るよ～。");
	}

	@Override
	public String toString() {
		return "拙者は武州○△□村の浪人、" + name + "ともうす。";
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士クラスのtoString()メソッドを確認します。\n");

		//ここに適切な処理を記述
		Retainer retainer = new Retainer("テスト太郎");
		System.out.println(retainer);
		// ↑内部的にはこれと同じ動きをしている
		//System.out.println(retainer.toString());

		System.out.println("\n浪人クラスのtoString()メソッドを確認します。\n");

		//ここに適切な処理を記述
		Ronin ronin = new Ronin("テスト兵衛");
		System.out.println(ronin);

	}
}
