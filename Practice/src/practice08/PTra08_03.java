package practice08;
/*
 * PTra08_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra08_03 {
	public static void main(String[] args) {

		// ★ 0～100のランダムな値を取得して、変数numberに代入してください

		int limitNumber = 99;
		int random = 0;
		int number = random;
		int x =0;


			random = new java.util.Random().nextInt(limitNumber);

			random += 1 ;

			number = random;

			System.out.println(number);

		// ★ 変数resultを宣言し、メソッドisEvenNumberを（変数number）で呼び出した結果を代入してください

			boolean result = isEvenNumber ( number );

			if (result) {
				System.out.println("偶数です");
			} else {
				System.out.println("奇数です");
			}
		}


	/*
	 * ★ 以下の仕様でメソッドを作成してください
	 *
	 * 戻り値		：boolean
	 * メソッド名	：isEvenNumber
	 * 引数			：int x
	 *
	 * 引数で渡された内容が偶数ならtrue、奇数ならfalseを返すメソッド
	 */

	public static boolean isEvenNumber ( int x ) {


		if ( x % 2 == 0) {
			boolean result = true ;
			return result;


		} else {
			boolean result = false ;
			return result;
		}




	}

}
