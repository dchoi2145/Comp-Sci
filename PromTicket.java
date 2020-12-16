
public class PromTicket {
	
	private String Name;
	private int StudentID;
	private String Grade;
	private int group;
	private int cost;
	private String characters;
	private String password;
	

	

	public PromTicket(String Student, int ID, String year, int people, int price){
		
		Name = Student;
		StudentID = ID;
		Grade = year; 
		group = people;
		cost = price;
		characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		password = "";
		
		
	}
	
	public void findName() {
		System.out.println("What is your full name?");
		System.out.println(Name);
	}
	
	public void findID() {
		System.out.println("What is your StudentID?");
		System.out.println(StudentID);
	}
	
	public void findGrade(){
		
		System.out.println("What grade are you in?");
		
		if (Grade == "freshman" || Grade == "Freshman") {
			
			Grade = "freshman";
		}
		
		else if(Grade == "sophmore" || Grade == "Sophmore") {
			
			Grade = "sophmore";
		}
		
		else if(Grade == "junior" || Grade == "Junior") {
			
			Grade = "junior";
		}
		
		else if(Grade == "senior" || Grade == "Senior") {
			
			Grade = "senior";
		}
		
		else{
			
			Grade = "The grade is spelled incorrectly. Please try again.";
		}
		
		if (Grade == "freshman" || Grade == "sophmore" || Grade == "junior" || Grade == "senior" || Grade == "The grade is spelled incorrectly. Please try again.") {
			
			System.out.println(Grade);
		}
	} 
	
	public void findGroup() {
		System.out.println("How many people are in your group");
		
		if (group == 1) {
			
			group = 1;
		}
		
		else if(group ==2) {
			
			group = 2;
		}
		
		else if(group == 3) {
			
			group = 3;
		}
		
		else if(group == 4) {
			
			group = 4;
		}
	
		
		System.out.println(group);
	}
	
	public String findCharacters() {
		
		int a = characters.length();
		int b = (int)(a * Math.random());
		return characters.substring(b, b+1);
	}
	
	public void makeCode(int length) {
		
		System.out.println("Your code is:");
		
		for( int a = 0; a < length - 2; a++) {
			password = password + findCharacters();
		}
		
		System.out.println(password);
	}
	
	public void findCost() {
		
		System.out.println("Admission Price:");
		
		if (Grade == "senior" && group == 1) {
			
			cost = 40;
		}
		
		else if(Grade == "senior" && group == 2) {
			
			cost = 60;
		}
		
		else if(Grade == "senior" && group == 3) {
			
			cost = 100;
		}
		
		else if(Grade == "senior" && group == 4) {
			
			cost = 100;
		}
		
		else if(Grade == "junior" && group == 1) {
			
			cost = 45;
		}
		
		else if(Grade == "junior" && group == 2) {
			
			cost = 68;
		}
		
		else if(Grade == "junior" && group == 3) {
			
			cost = 113;
		}
		
		else if(Grade == "junior" && group == 4) {
			
			cost = 113;
		}
		
		else if(Grade == "sophmore" && group == 1) {
			
			cost = 55;
		}
		
		else if(Grade == "sophmore" && group == 2) {
			
			cost = 83;
		}
		
		else if(Grade == "sophmore" && group == 3) {
			
			cost = 138;
		}
		
		else if(Grade == "sophmore" && group == 4) {
			
			cost = 138;
		}
		
		else if(Grade == "freshman" && group == 1) {
			
			cost = 65;
		}
		
		else if(Grade == "freshman" && group == 2) {
			 
			cost = 98;
		}  
		
		else if(Grade == "freshman" && group == 3) {
			
			cost = 163;
		}
		
		else if(Grade == "freshman" && group == 4) {
			
			cost = 163;
		}
		
		System.out.println("$" + cost);
	}
	
	public void printMessage(){
		
		System.out.println(Name + " purchased a " + Grade + " group ticket for $" + cost + ". The confirmation number for this sale is " + password);
	}
	
	public void printAll() {
		
		findName();
		findID();
		findGrade();
		findGroup();
		findCost();
		makeCode(8);
		printMessage();
	}
}