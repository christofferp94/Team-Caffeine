package projektarbetequiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DeleteQuestionDemo extends Application
{
	public void start(Stage mainstage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("DeleteQuestionFXML.fxml"));
		Scene scene = new Scene(root);
		mainstage.setScene(scene);
		mainstage.show();
	}
	
	public static void main(String[] start)
	{
		Application.launch(start);
	}
}
