package check;

import constants.Constants;


public class Check{
	/**
	 * 【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
	 *  firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
	 *  なお、変数のアクセス修飾子は「private」とする。
	 */
	private String firstName = "大和";
	private String lastName = "岩澤";

	public static void main(String[] args) {
		printName("大和", "岩澤");
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
	};
	/**
	*【Check.java】にてfirstNameとlastNameを引数で受け取って、
	* 連結して表示させるメソッド「printName」を作成しなさい。
	* 作成した関数のアクセス修飾子は「private」とする。
	*/
	private static void printName(String firstName, String lastName) {
		String printName = lastName + firstName;
		System.out.println("printNameメソッド→" + printName);
	}
}
