/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektarbetequiz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class FXMLSQLQuizTestResultController implements Initializable {

     @FXML
    private Label nameLabel;

    @FXML
    private Label resultTabel;

    @FXML
    private Label timeLabel;

    @FXML
    private Button doneBtn;
    
    
     @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        if (event.getSource() == doneBtn) {
            // when user clicks done
            
             Parent p = FXMLLoader.load(getClass().getResource("FXMLSQLQuizPanel.fxml"));

                Scene s = new Scene(p);
                Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                stg.setScene(s);
                stg.show();
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
