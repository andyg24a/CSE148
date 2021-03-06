package gradingActivity;

public class Student {
	private String name;
	private Grades grades;

	// overloaded constructors
	public Student(String name, Grades grades) {
		super();
		this.name = name;
		this.grades = grades;
	}

	public Student(String name, int numberOfQuestions, int numberOfQuestionsMissed, double grammar, double spelling,
			double length, double content) {
		super();
		this.name = name;
		this.grades = new Grades(numberOfQuestions, numberOfQuestionsMissed, grammar, spelling, length, content);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Grades getGrades() {
		return grades;
	}

	public void setGrades(Grades grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return "Student=" + name 
				+ grades 
				+ "\n\tScore=" + grades.getScore() 
				+ "\n\tLetterGrade=" + grades.getLetterGrade();
	}

}
