package pop2;

import java.util.ArrayList;

public class Subject {
	private String subjectName;
	private int subjectID;
	private int gradeType;
	
	private ArrayList<Student> students;
	
	public Subject(String subjectName, int subjectID) {
		this.subjectName = subjectName;
		this.subjectID = subjectID;
		students = new ArrayList<>();
	}
	
	//수강신청
	public void register(Student student) {
		students.add(student);
	}
}
