package practice07;
/*
 * PTra07_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Arrays;

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ PTra07_05.javaで作成したランダム値が入った配列arrayを作成してください

		System.out.println("配列の中身を小さい順に並び替えます");

		int[] array = new int[5];

		Arrays.sort(array);

		for (int i = 0; i < array.length; i++) {


		int limitNumber = 100000;
		int random = 0;


			random = new java.util.Random().nextInt(limitNumber);

			array[i] = random;




		// ★ 配列arrayの中身を、昇順(数値が小→大になるように)に並び替えてください
		// 並び替えにはArrays.sort(array);を使用してくださいb。


	        Arrays.sort(array);
	        for(int t = 0;t < array.length;t++)
	        	System.out.println(array[t]);




		}



	}
 }

