/**
 * 第7章 武士のお仕事
 *
 * 問題11 instanceof演算子
 *
 * instanceof演算子を利用する。
 *
 * 侍クラスの配列に（藩士、浪人）をランダムに入れ、
 * それぞれの人数を表示してください。
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれの人数を表示してみます。
 *
 * 藩士：3人
 *
 * 浪人：2人
 *
 */

package lesson07.challenge11;

//ここにSamuraiクラスを記述
abstract class Samurai {
	abstract void work();
}

//ここにRetainerクラスを記述
class Retainer extends Samurai {
	void work() {
	}
}

//ここにRoninクラスを記述
class Ronin extends Samurai {
	void work() {
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("5人の侍を配列に詰めます。\n");

		//ここに適切な処理を記述
		Samurai[] samuraiArray = new Samurai[5];
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 10) % 2;
			if (num == 0) {
				samuraiArray[i] = new Retainer();
			} else {
				samuraiArray[i] = new Ronin();
			}
		}

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれの人数を表示してみます。\n");

		int retainerCount = 0;
		int roninCount = 0;

		//ここに適切な処理を記述
		for (int i = 0; i < 5; i++) {
			if (samuraiArray[i] instanceof Retainer) {
				retainerCount++;
			} else {
				roninCount++;
			}
		}

		System.out.println("藩士：" + retainerCount + "人");
		System.out.println("\n浪人：" + roninCount + "人");
	}
}
