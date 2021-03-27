package application;

public class Questions {
	String question;
	String choice1;
	String choice2;
	String choice3;
	String choice4;
	String answer;
	
	public Questions(String question, String choice1, String choice2, String choice3, String choice4, String answer){
		this.question = question;
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.choice4 = choice4;
		this.answer = answer;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getChoice1() {
		return choice1;
	}
	
	public String getChoice2() {
		return choice2;
	}
	
	public String getChoice3() {
		return choice3;
	}
	
	public String getChoice4() {
		return choice4;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setQuestion(String q) {
		this.question = q;
	}
	
	public void setChoice1(String c) {
		this.choice1 = c;
	}
	
	public void setChoice2(String c) {
		this.choice2 = c;
	}
	
	public void setChoice3(String c) {
		this.choice3 = c;
	}
	
	public void setChoice4(String c) {
		this.choice4 = c;
	}
	
	public void setAnswer(String a) {
		this.answer = a;
	}
}
