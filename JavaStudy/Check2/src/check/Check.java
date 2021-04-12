package check;

public class Check {
	/**
	 * 【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
	 *  firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
	 *  なお、変数のアクセス修飾子は「private」とする。
	 */
	private String firstName = "Yamato";
	private String lastName = "Iwasawa";

	public static void main(String[] args) {
		
	}
	/**
	*【Check.java】にてfirstNameとlastNameを引数で受け取って、
	* 連結して表示させるメソッド「printName」を作成しなさい。
	* 作成した関数のアクセス修飾子は「private」とする。
	*/
	private static void printName(String firstName, String lastName) {
		String printName = firstName + lastName;
		System.out.println(printName);
	}
}
