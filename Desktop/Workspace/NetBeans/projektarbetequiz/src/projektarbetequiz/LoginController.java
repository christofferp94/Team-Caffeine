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


public class LoginController implements Initializable {

    @FXML
    private TextField usernameFld;

    @FXML
    private TextField passwordFld;

    @FXML
    private Button loginBtn;

    @FXML
    private Button registerBtn;

    @FXML
    private Label error;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if (event.getSource() == loginBtn) {

            if (usernameFld.getText().equals("") && (passwordFld.getText().equals(""))) {
                error.setText("Please fill in username & password");

            } else if (usernameFld.getText().equals("")) {
                error.setText("Please fill in username");

            } else if (passwordFld.getText().equals("")) {
                error.setText("Please fill in password");

            } else {
// SKRIV IN DITT FXML FIL HÄR SÅ ATT DU KAN CONNECTA TILL DEN!!! 
                
                Parent p = FXMLLoader.load(getClass().getResource("FXMLPrincipalPanel.fxml"));

                Scene s = new Scene(p);
                Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                stg.setScene(s);
                stg.show();

            }

        } else if (event.getSource() == registerBtn) {

            Parent p = FXMLLoader.load(getClass().getResource("FXMLRegister.fxml"));

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
