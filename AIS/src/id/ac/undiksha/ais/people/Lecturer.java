package id.ac.undiksha.ais.people;

public class Lecturer {
  
	private String name;
	private String lecturerId;
	private boolean gender;
	private String address;
	private String birthDate;
	private String faculty;
	private String departement;
	private String studyProgram;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLecturerId() {
		return lecturerId;
	}
	public void setLecturerId(String lecturerId) {
		this.lecturerId = lecturerId;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getStudyProgram() {
		return studyProgram;
	}
	public void setStudyProgram(String studyProgram) {
		this.studyProgram = studyProgram;
	}
	
	public void printAll() {
		System.out.println(this.name);
		System.out.println(this.lecturerId);
		System.out.println(this.birthDate);
		if (this.gender)
			System.out.println("Male");
		else
			System.out.println("Female");
		System.out.println(this.address);
		System.out.println(this.departement);
		System.out.println(this.faculty);
		System.out.println(this.studyProgram);
	}
	
	
	
}
