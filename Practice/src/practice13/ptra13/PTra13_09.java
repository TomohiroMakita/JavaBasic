/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください

		Employee shain1 = new Employee();

		shain1.userNm = NAMEDATA[0];
		shain1.mail = MAILDATA[0];
		shain1.password = PASSDATA[0];
		shain1.setDepartmentNm(QUATERDATA[0][0]);

		int department1 = Integer.parseInt(QUATERDATA[1][1]);

		shain1.setDepartmentCnt(department1);


		Employee shain2 = new Employee();

		shain2.userNm = NAMEDATA[1];
		shain2.mail = MAILDATA[1];
		shain2.password = PASSDATA[1];
		shain2.setDepartmentNm(QUATERDATA[0][1]);

		int department2 = Integer.parseInt(QUATERDATA[1][2]);

		shain2.setDepartmentCnt(department2);


		Employee shain3 = new Employee();

		shain3.userNm = NAMEDATA[2];
		shain3.mail = MAILDATA[2];
		shain3.password = PASSDATA[2];
		shain3.setDepartmentNm(QUATERDATA[0][2]);

		int department3 = Integer.parseInt(QUATERDATA[1][2]);

		shain3.setDepartmentCnt(department3);


	}
}
