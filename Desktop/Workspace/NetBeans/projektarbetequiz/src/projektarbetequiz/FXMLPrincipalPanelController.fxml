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
import javax.swing.JOptionPane;

public class FXMLPrincipalPanelController implements Initializable {

    @FXML
    private Button teacherPanelBtn;

    @FXML
    private Button studentPanelBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private Button searchBtn;

    @FXML
    private Label idLabel;

    @FXML
    private Label usernameLabel;

    @FXML
    private Label firstnameLabel;

    @FXML
    private Label lastnameLabel;

    @FXML
    private Label classLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Button changePasswordBtn;

    @FXML
    private Button changeEmail;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == teacherPanelBtn) {
            // when user clicks on teacherPanel 

            Parent p = FXMLLoader.load(getClass().getResource("FXMLTeacherPanel.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == studentPanelBtn) {
            // when user clicks on studenPanel 

            Parent p = FXMLLoader.load(getClass().getResource("FXMLStudentStartMenu.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == logoutBtn) {
            // when user clicks log out

            Parent p = FXMLLoader.load(getClass().getResource("Login.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == searchBtn) {
            //when user clicks search ID 

            JOptionPane.showMessageDialog(null, "Search Bnt");

        } else if (event.getSource() == changePasswordBtn) {
            // when user clicks on change password

            Parent p = FXMLLoader.load(getClass().getResource("FXMLChangePassword.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == changeEmail) {
            // when user clicks on change email 

            Parent p = FXMLLoader.load(getClass().getResource("FXMLChangeEmail.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
