package assigment4;


public class StudentService {
	public Student createStudent(String[] studentInfo) {
		Student student = new Student(studentInfo[0], studentInfo[1], studentInfo[2], studentInfo[3]);
		return student;
	}
	 public String[] parseText(String input) {
		 String[] stringArray = input.split(",");
			return stringArray;
	 }
	
}
