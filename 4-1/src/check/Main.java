package check;

import constants.Constants;

public class Main {
	
	static private String firstName = 	"松尾";
	static private String lastName = "悠吾";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		printName(firstName,lastName);
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotPet.introduce();
		
	}
	
	private static void printName(String first , String last) {
		System.out.println("printNameメソッド → " + first + last);
	}

}
