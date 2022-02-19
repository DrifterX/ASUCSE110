
public class Student {
	//Declaring instance variables
	private String firstName, lastName, fullName, asuId;
	private double grade;
	
	//Class constructor
	public Student(String firstName, String lastName, String asuId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.asuId = asuId;
		this.fullName = firstName + " " + lastName;
	}
	
	//Class getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public String getAsuID() {
		return asuId;
	}
	public double getGrade() {
		return grade;
	}
	public String toString() {
		return String.format("Student: %s, ASU Id: %s, Grade: %s",
                fullName, asuId, grade);
	}
	
	//Class setter for grade
	public void setGrade(double newGrade) {
		grade = newGrade;
	}
}
