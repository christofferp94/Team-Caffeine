package projektarbetequiz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DeleteQuestionController implements Initializable
{
	@FXML
	private Button deleteBtn;
        
	@FXML
	private Button back;
	@FXML
	private TableView<Question> questionTable;
	@FXML
	private TableColumn<Question, String> questionIDCol;
	@FXML
	private TableColumn<Question, String> questionCol;
	@FXML
	private ObservableList<Question> questionList = FXCollections.observableArrayList();
	private Question question;
	
	String url = "jdbc:mysql://localhost:3306/QuizDB";
	String user = "root";
	String pwd = "root";
	
	@FXML
	private void loadQuestions()
	{
		try(Connection conn = DriverManager.getConnection(url, user, pwd))
		{
			String query = "SELECT QuestionID, Question FROM Question";
			Statement stmt = conn.createStatement();
			ResultSet result = stmt.executeQuery(query);
			while(result.next())
			{
				String QID = result.getString("QuestionID");
				String quest = result.getString("Question");
				question = new Question(QID, quest);
				questionList.add(question);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null, "Error connecting to database: " + ex.getMessage());
		}
	}
	
	@SuppressWarnings("unused")
	@FXML
	private void deleteQuestion()
	{
		try(Connection conn = DriverManager.getConnection(url, user, pwd))
		{
			Question selectedQuestion = questionTable.getSelectionModel().getSelectedItem();
			String questionToBeDeletedID = selectedQuestion.getQuestionID();
			String questionToBeDeleted = selectedQuestion.getQuestion();
			if(selectedQuestion != null)
			{
				questionList.remove(selectedQuestion);
				
				String query = "DELETE FROM Answers WHERE AnswerID=?";
				PreparedStatement statement = conn.prepareStatement(query);
				statement.setString(1, questionToBeDeletedID);
				statement.executeUpdate();
				
				query = "DELETE FROM Question WHERE Question=?";
				statement = conn.prepareStatement(query);
				statement.setString(1, questionToBeDeleted);
				statement.executeUpdate();
			}
			else 
			{
                            
				JOptionPane.showMessageDialog(null, "Error removing question!");
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null, "Error connecting to database: " + ex.getMessage());
		}
             
    }
        
    @FXML
        private void BackButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == back) {
            
            Parent p = FXMLLoader.load(getClass().getResource("FXMLAdminPanel.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();
                
	}
}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{
		loadQuestions();
		questionIDCol.setCellValueFactory(new PropertyValueFactory<Question, String> ("questionID"));
		questionCol.setCellValueFactory(new PropertyValueFactory<Question, String> ("question"));
		questionTable.setItems(questionList);
	}
	
}
