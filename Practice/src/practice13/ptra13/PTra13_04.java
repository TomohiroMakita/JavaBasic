/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください

		Hero brave = new Hero();
		Slime slime = new Slime();

		brave.setName("勇者");
		slime.setName("スライム");


		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */

		while( true ) {


			int damage = brave.attack();

			boolean isSlimeDead = slime.damage(damage);

			if ( isSlimeDead ) {

				System.out.println( brave.getName() + "は" + slime.getName() + "との戦闘に勝利した");

				break;

			}




			int damage1 = slime.attack();

			boolean isBraveDead =brave.damage(damage1);

			if ( isBraveDead ) {

				System.out.println( slime.getName() + "は" + brave.getName() + "との戦闘に勝利した");


				break;
			}

		}


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」


	}
}
