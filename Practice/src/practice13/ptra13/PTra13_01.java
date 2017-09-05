/*
 * PTra13_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;


public class PTra13_01 extends practice13.common.Animal{

	/*
	 * ★ PTra13_01クラスはcommon.Animalクラスを継承してください
	 */

	public static void main(String[] args) {

		// ★ PTra13_01をインスタンス化をしてください

		PTra13_01 thirteen = new PTra13_01();


		// ★ PTra13_01の持つsetterを実行してください（引数："人"）

		thirteen.setName("人");

		System.out.println(thirteen.getName());

		// ★ PTra13_01の持つインスタンスメソッドrunとbreathを実行してしてください

		thirteen.run();
		thirteen.breath();

	}
}
