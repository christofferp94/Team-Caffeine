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
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;



public class FXMLChangePasswordController implements Initializable {

    @FXML
    private PasswordField currentpasswordFld;

    @FXML
    private PasswordField newPasswordFld;

    @FXML
    private PasswordField confirmPasswordFld;

    @FXML
    private Button saveBtn;

    @FXML
    private Button backBtn;

    @FXML
    private Label message;

    @FXML
    private Label error;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if (event.getSource() == saveBtn) {

            if (currentpasswordFld.getText().equals("")) {
                message.setText("");
                error.setText("Please fill in current password!");

            } else if (newPasswordFld.getText().equals("")) {
                message.setText("");
                error.setText("Please fill in new password");

            } else if (confirmPasswordFld.getText().equals("")) {
                message.setText("");
                error.setText("Please confirm password");

            } else if (!newPasswordFld.getText().equals(confirmPasswordFld.getText())) {
                message.setText("");
                error.setText("Password does not match");

            } else {

                error.setText("");
                message.setText("Password changed");

            }

        } else if (event.getSource() == backBtn) {
            // When user clicks Back button 
            
             Parent p = FXMLLoader.load(getClass().getResource("FXMLStudentStartMenu.fxml"));

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
