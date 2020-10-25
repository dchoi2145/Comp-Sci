
public class Unit1Project {
	public static void main(String[] args) {
	String firstName = "David";
	String middleName = "Hanyoung";
	String lastName = "Choi";
	String birthDay = "10-07-2004";
	String lastNameLowerCase = (lastName.toLowerCase());
	System.out.println("Email: "+(lastName.toLowerCase())+(firstName.substring(0,1))+(middleName.substring(0,1))+"@sharkmail.com");
	System.out.println("Temp Password: "+(birthDay.substring(0,2)+(birthDay.substring(3,5))+birthDay.substring(6,10)));
	System.out.println("*** This temparary password is very insecure. Please change it immediately! ***");

		
	}

}
