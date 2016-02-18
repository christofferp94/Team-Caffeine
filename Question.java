package projektarbetequiz;

import javafx.beans.property.SimpleStringProperty;

public class Question
{
	private SimpleStringProperty question;
	private SimpleStringProperty questionID;
	
	public Question(String qID, String q)
	{
		this.questionID = new SimpleStringProperty(qID);
		this.question = new SimpleStringProperty(q);
	}
	
	public void setQuestionID(String ID)
	{
		this.questionID.set(ID);
	}
	
	public void setQuestion(String q)
	{
		this.question.set(q);
	}
	
	public String getQuestion()
	{
		return this.question.get();
	}
	
	public String getQuestionID()
	{
		return this.questionID.get();
	}
}
