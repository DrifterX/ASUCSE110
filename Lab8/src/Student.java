
public class Student {
	//Declaring instance variables
	private String firstName, lastName, fullName, asuId;
	private double grade = -1.0;
	private int timesUpdated, timesAccessed;
	
	//Class constructor
	public Student(String firstName, String lastName, String asuId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.asuId = asuId;
		this.fullName = firstName + " " + lastName;
	}
	
	public Student(String fullName, String asuId, double grade) {
		this.fullName = fullName;
		this.asuId = asuId; 
		this.grade = grade;
	}
	
	public Student() {}
	
	
	
	//Class getters
	public String getFirstName() {
		timesAccessed++;
		return firstName;
	}
	public String getLastName() {
		timesAccessed++;
		return lastName;
	}
	public String getFullname() {
		timesAccessed++;
		return fullName;
	}
	public String getAsuID() {
		timesAccessed++;
		return asuId;
	}
	public double getGrade() {
		timesAccessed++;
		return grade;
	}
	public int getNumOfUpdates() {
		timesAccessed++;
		return timesUpdated;
	}
	public int getNumOfAccessed() {
		timesAccessed++;
		return timesAccessed;
	}
	
	
	//Class setter for grade
	public void setGrade(double newGrade) {
		this.grade = newGrade;
		timesUpdated++;
	}
	
	public void setName(String name) {
		this.fullName = name;
		timesUpdated++;
	}
	
	public void setId(String asuId) {
		this.asuId = asuId;
		timesUpdated++;
	}
	
	//Helper functions like toString() and equals()
	public String toString() {
		return String.format("[Name: %s, ASU Id: %s, Grade: %s]",
                fullName, asuId, grade);
	}
	public boolean equals(Student kid) {
		if(kid.getFullname() != null && kid.getFullname().equalsIgnoreCase(fullName)) {
			return true;
		}
		else if(kid.getAsuID() != null && kid.getAsuID().equals(asuId)) {
			return true;
		}
		
		return false;
	}
}
