/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ① ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ArrayListを作成して、Playerインスタンスを格納してください
		 */

		ArrayList<Player> array = new ArrayList<Player>();

		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();

				String[] soccer = line.split(",", -1);

				Player player = new Player();

				player.setPosition(soccer[0]);
				player.setName(soccer[1]);
				player.setCountry(soccer[2]);
				player.setTeam(soccer[3]);

				array.add(player);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		Collections.shuffle(array);

		int gk = 0;
		int df = 0;
		int mf = 0;
		int fw = 0;


		for (Player player : array) {
			if (player.getPosition().equals("GK")) {
				if (gk < 1) {
					System.out.println(player.toString());
					gk++;
				}
			}

			if (player.getPosition().equals("DF")) {
				if (df < 4) {
					System.out.println(player.toString());
					df++;
				}
			}

			if (player.getPosition().equals("MF")) {
				if (mf < 4) {
					System.out.println(player.toString());
					mf++;
				}
			}

			if (player.getPosition().equals("FW")) {
				if (fw < 2) {
					System.out.println(player.toString());
					fw++;
				}
			}
		}


	}
}
