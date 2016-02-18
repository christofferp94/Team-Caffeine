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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class FXMLChangeEmailController implements Initializable {

    @FXML
    private Label currentEmailLabel;

    @FXML
    private TextField newEmailFld;

    @FXML
    private Button DoneBtn;

    @FXML
    private Button backBtn;

    @FXML
    private Label error;

    @FXML
    private Label message;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == DoneBtn) {

            if (newEmailFld.getText().equals("")) {
                message.setText("");
                error.setText("Please fill in email");
           
            } else if (newEmailFld.getText().equals(currentEmailLabel.getText())) {

                message.setText("");
                error.setText("You allready have that email");

            } else {
               // Sätta in DP !! query 
                error.setText("");
                message.setText("Email changed");
                newEmailFld.clear();

            }

        } else if (event.getSource() == backBtn) {

             Parent p = FXMLLoader.load(getClass().getResource("FXMLStudentStartMenu.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        
       // Hide labels and clear field
        newEmailFld.clear();
        message.setText("");
        error.setText("");

    }

}
