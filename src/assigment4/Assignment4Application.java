package assigment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Assignment4Application {

	public static void main(String[] args) throws IOException {
		StudentService studentService = new StudentService();
		String[] studentInfo = null;
		String line = "";
		StudentFileRegEx studentFileRegEx = new StudentFileRegEx();
		BufferedReader reader1 = null;
		BufferedReader reader2 = null;
		BufferedReader reader3 = null;
		BufferedWriter writer1 = null;
		BufferedWriter writer2 = null;
		BufferedWriter writer3 = null;
		ArrayList<Student> compStudents = new ArrayList<Student>();
		ArrayList<Student> apmthStudents = new ArrayList<Student>();
		ArrayList<Student> statStudents = new ArrayList<Student>();

		try {
			reader1 = new BufferedReader(new FileReader("student-master-list.csv"));
			writer1 = new BufferedWriter(new FileWriter("course1.csv"));
			writer1.write("Student ID, Student Name, Course, Grade\n");

			while ((line = reader1.readLine()) != null) {
				studentInfo = studentService.parseText(line);

				if (studentFileRegEx.compSciMatch(studentInfo[2])) {
					compStudents.add(studentService.createStudent(studentInfo));
				}

			}

			compStudents.sort(new StudentGradeComparator());

			for (Student compStudent : compStudents) {

				writer1.write(compStudent.getId() + ", " + compStudent.getName() + ", " + compStudent.getCourse() + ", "
						+ compStudent.getGrade() + "\n");
			}

		} finally {
			if (reader1 != null)
				reader1.close();
			if (writer1 != null)
				writer1.close();
		}
		try {
			reader2 = new BufferedReader(new FileReader("student-master-list.csv"));
			writer2 = new BufferedWriter(new FileWriter("course2.csv"));
			writer2.write("Student ID, Student Name, Course, Grade\n");
			while ((line = reader2.readLine()) != null) {
				studentInfo = studentService.parseText(line);

				if (studentFileRegEx.apmthMatch(studentInfo[2])) {
					apmthStudents.add(studentService.createStudent(studentInfo));
				}

			}

			apmthStudents.sort(new StudentGradeComparator());
			;
			for (Student apmthStudent : apmthStudents) {

				writer2.write(apmthStudent.getId() + ", " + apmthStudent.getName() + ", " + apmthStudent.getCourse()
						+ ", " + apmthStudent.getGrade() + "\n");
			}

		} finally {
			if (reader2 != null)
				reader2.close();
			if (writer2 != null)
				writer2.close();
		}
		try {
			reader3 = new BufferedReader(new FileReader("student-master-list.csv"));
			writer3 = new BufferedWriter(new FileWriter("course3.csv"));
			writer3.write("Student ID, Student Name, Course, Grade\n");
			while ((line = reader3.readLine()) != null) {
				studentInfo = studentService.parseText(line);

				if (studentFileRegEx.statMatch(studentInfo[2])) {
					statStudents.add(studentService.createStudent(studentInfo));
				}

			}
			statStudents.sort(new StudentGradeComparator());
			;
			for (Student statStudent : statStudents) {

				writer3.write(statStudent.getId() + ", " + statStudent.getName() + ", " + statStudent.getCourse() + ", "
						+ statStudent.getGrade() + "\n");
			}

		} finally {
			if (reader3 != null)
				reader3.close();
			if (writer3 != null)
				writer3.close();
		}

	}

}
