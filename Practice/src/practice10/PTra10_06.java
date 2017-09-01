package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ★ carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * ★ 各carインスタンスのrunメソッドを実行して、200km先の目的地に到達した順位を出力してください
		 */


		Car car1 = new Car();
		car1.serialNo = 10000;
		car1.color = "Red";
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.serialNo = 20000;
		car2.color = "Blue";
		car2.gasoline = 75;

		Car car3 = new Car();
		car3.serialNo = 30000;
		car3.color = "Green";
		car3.gasoline = 100;

		final int distance = 200;


		int kyori = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		

		while ( kyori <= distance ) {

			int run = car1.run();

			kyori += run;

			count1++;

			if (run == -1) {

				System.out.println( "目的地に到達できませんでした");
				break;
			}

		}

		if (kyori >= distance) {

			System.out.println( "目的地にまで" + count1 + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです");

		}

		while ( kyori <= distance ) {

			int run = car2.run();

			kyori += run;

			count2++;

			if (run == -1) {

				System.out.println( "目的地に到達できませんでした");
				break;
			}

		}

		if (kyori >= distance) {

			System.out.println( "目的地にまで" + count2 + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
		}

		while ( kyori <= distance ) {

			int run = car3.run();

			kyori += run;

			count3++;

			if (run == -1) {

				System.out.println( "目的地に到達できませんでした");
				break;
			}

		}

		if (kyori >= distance) {

			System.out.println( "目的地にまで" + count3 + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです");


			}
		}
	}

