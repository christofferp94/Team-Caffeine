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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javax.swing.JOptionPane;

public class FXMLSQLQuizTestController implements Initializable {

    @FXML
    private Label questionLabel;

    @FXML
    private RadioButton questionAlternative1;

    @FXML
    private RadioButton questionAlternative2;

    @FXML
    private RadioButton questionAlternative3;

    @FXML
    private Button nextBtn;
    
    @FXML
    private Label questionCounterLabel;

    @FXML
    private Label questionCounterMaxLabel;

    @FXML
    private Label timeLeftLabel;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        if (event.getSource() == nextBtn) {
            // when user clicks next 
            JOptionPane.showMessageDialog(null, "next");

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

     
    }

}
