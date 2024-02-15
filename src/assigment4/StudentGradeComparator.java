package assigment4;

import java.util.Comparator;

public class StudentGradeComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		return student2.getGradeInt().compareTo(student1.getGradeInt());
	}

}
