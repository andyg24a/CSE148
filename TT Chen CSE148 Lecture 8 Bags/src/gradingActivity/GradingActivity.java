package gradingActivity;

public class GradingActivity {
	private double score;

	public GradingActivity(double score) {
		super();
		this.score = score;
	}
	
	public GradingActivity(){
		super();
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	public char getLetterGrade(){
		if(score >= 90){
			return 'A';
		} else if(score >= 80){
			return 'B';
		} else if(score >= 70){
			return 'C';
		} else if(score >= 60) {
			return 'D';
		} else {
			return 'F';
		}
	}
}
