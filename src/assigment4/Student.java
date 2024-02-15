package assigment4;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String course;
	private String grade;
	private Integer gradeInt;

	public Student(String id, String name, String course, String grade) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.grade = grade;
		this.gradeInt = Integer.parseInt(grade);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setGradeInt(String grade) {
		this.gradeInt = Integer.parseInt(grade);

	}

	public Integer getGradeInt() {
		return gradeInt;
	}

	@Override
	public int compareTo(Student that) {
		if (this.gradeInt.compareTo(that.gradeInt) == 0) {
			return this.name.compareTo(that.name);
		} else {
			return that.gradeInt.compareTo(this.gradeInt);
		}
	}

}
