package pop2;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	private Subject majorSubject;
	
	private ArrayList<Score> scores;
	
	public Student(int studentID, String studentName, Subject majorSubjcet) {
		this.studentName = studentName;
		this.studentID = studentID;
		this.majorSubject = majorSubjcet;
		scores = new ArrayList<>();
	}
	
	//학생추가
	public void addSubjectScore(Score score) {
		scores.add(score);
	}
}
