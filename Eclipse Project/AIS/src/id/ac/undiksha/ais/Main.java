package id.ac.undiksha.ais;

import id.ac.undiksha.ais.people.Student;
import id.ac.undiksha.ais.people.Lecturer;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student1 = new Student();
		
		student1.setStudentId("12345");
		student1.setName("Ani");
		student1.setBirthDate("1 January 2000");
		student1.setGender(false);
		student1.setSmtr(6);
		student1.setAddress("Singaraja");
		
		student1.printAll();
		
	     System.out.println();
	     
		Lecturer lecturer1 = new Lecturer();
		
		lecturer1.setLecturerId("54321");
		lecturer1.setName("Ana");
		lecturer1.setBirthDate("2 January 2000");
		lecturer1.setGender(false);
		lecturer1.setAddress("Lovina");
		lecturer1.setDepartement("Social");
		lecturer1.setFaculty("Faculty Technic");
		lecturer1.setStudyProgram("Computer Networking");
		
		lecturer1.printAll();

		
		
	}
	
}
