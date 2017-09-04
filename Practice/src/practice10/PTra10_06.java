package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Arrays;

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


		int kyori1 = 0;
		int kyori2 = 0;
		int kyori3 = 0;

		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

//		Car 1

		while ( kyori1 <= distance ) {

			int run = car1.run();

			kyori1 += run;

//			System.out.println( kyori1 );
//			System.out.println( count1 );

			count1++;

			if (run == -1) {

				System.out.println( "目的地に到達できませんでした");
				break;
			}

		}

		if (kyori1 >= distance) {

			System.out.println( "目的地にまで" + count1 + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです");

		}

//		Car 2

		while ( kyori2 <= distance ) {

			int run = car2.run();

			kyori2 += run;

//			System.out.println( kyori2 );
//			System.out.println( count2 );

			count2++;

			if (run == -1) {

				System.out.println( "目的地に到達できませんでした");
				break;
			}

		}

		if (kyori2 >= distance) {

			System.out.println( "目的地にまで" + count2 + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
		}

//		Car3

		while ( kyori3 <= distance ) {

			int run = car3.run();

			kyori3 += run;

//			System.out.println( kyori3 );
//			System.out.println( count3 );

			count3++;

			if (run == -1) {

				System.out.println( "目的地に到達できませんでした");
				break;
			}

		}

		if (kyori3 >= distance) {

			System.out.println( "目的地にまで" + count3 + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです");


			}

		int[] array = new int[]{count1,count2,count3};
        Arrays.sort(array);
        for(int i = 0;i < array.length;i++) {
        	System.out.println( i + 1 + "位" + "" + array[i] +"時間" );
        	}
        }
}


