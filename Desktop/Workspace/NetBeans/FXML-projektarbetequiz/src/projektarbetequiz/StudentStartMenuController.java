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

public class StudentStartMenuController implements Initializable {

    @FXML
    private Button statsBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private Button changePasswordBtn;

    @FXML
    private Button changeEmailBtn;

    @FXML
    private Label welcomeLabel;

    @FXML
    private Button startSQLBtn;

    @FXML
    private Button unknow1Btn;

    @FXML
    private Button unknow2Btn;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == statsBtn) {
            // When user clicks on QuizButton
            JOptionPane.showMessageDialog(null, "stats btn");

        } else if (event.getSource() == changePasswordBtn) {
            // when user clicks on change password

            Parent p = FXMLLoader.load(getClass().getResource("FXMLChangePassword.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == statsBtn) {
            // When user clicks on StatsButton
            JOptionPane.showMessageDialog(null, "Stats ");

        } else if (event.getSource() == changeEmailBtn) {
            // When user clicks on Change Email button

            Parent p = FXMLLoader.load(getClass().getResource("FXMLChangeEmail.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == startSQLBtn) {
            // When user clicks on Go to SQL quiz button

            Parent p = FXMLLoader.load(getClass().getResource("FXMLSQLQuizPanel.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == unknow1Btn) {
            // When user clicks on Go to unknownbtn 

            JOptionPane.showMessageDialog(null, "Coming Soon1");

        } else if (event.getSource() == unknow2Btn) {
            // When user click on Go to unknown2btn

            JOptionPane.showMessageDialog(null, "Coming soon2");

        } else if (event.getSource() == logoutBtn) {
            // When user clicks on LogoutButton

            Parent p = FXMLLoader.load(getClass().getResource("Login.fxml"));

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
