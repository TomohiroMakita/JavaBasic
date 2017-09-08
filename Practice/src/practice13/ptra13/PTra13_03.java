/*
 * PTra13_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Slime;

public class PTra13_03 {

	/*
	 * ★ common.Characterクラスを継承した、common.Slimeクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（10, 5, 2）
	 */

	public static void main(String[] args) {
		// ★ common.Slimeクラスをインスンタンス化してください

		Slime slime = new Slime();


		// ★ common.Slimeインスタンスのnameに"スライム"を設定して下さい

		slime.setName("スライム");


		// ★ common.Slimeインスタンスのキャラクター情報を表示してください

		System.out.println(slime.showParameter());

	}
}
