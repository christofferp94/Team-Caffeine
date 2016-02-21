/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektarbetequiz;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    String dbURL = "jdbc:mysql://localhost:3306/quizdb";
    String user = "root";
    String pass = "root";

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

            } else if (!currentpasswordFld.getText().equals(LoginController.tmpPassword)) {
                message.setText("");
                error.setText("Current password does not match");

            } else if (!newPasswordFld.getText().equals(confirmPasswordFld.getText())) {
                message.setText("");
                error.setText("Password does not match");

            } else if (newPasswordFld.getText().equals(LoginController.tmpPassword)) {

                message.setText("");
                error.setText("You allready have that password!");

            } else {

                try (Connection conn = (Connection) DriverManager.getConnection(dbURL, user, pass)) {

                    String query = "UPDATE useraccount SET User_password=? WHERE User_name=?";
                    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(query);
                    statement.setString(1, newPasswordFld.getText());
                    statement.setString(2, LoginController.logginUsername);
                    statement.executeUpdate();

                } catch (SQLException e) {

                    System.out.println("Can not connect to database");
                    error.setText("Can not connect to database");
                    e.printStackTrace();
                }

                error.setText("");
                message.setText("Changed password!");

                LoginController.tmpPassword = newPasswordFld.getText();
                currentpasswordFld.clear();
                newPasswordFld.clear();
                confirmPasswordFld.clear();

            }

        } else if (event.getSource() == backBtn) {
            // When user clicks Back button 

            if (LoginController.tmpAccountstatus.equals("Student")) {

                Parent p = FXMLLoader.load(getClass().getResource("FXMLStudentStartMenu.fxml"));

                Scene s = new Scene(p);
                Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                stg.setScene(s);
                stg.show();

            } else if (LoginController.tmpAccountstatus.equals("Teacher")) {

                Parent p = FXMLLoader.load(getClass().getResource("FXMLTeacherPanel.fxml"));

                Scene s = new Scene(p);
                Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                stg.setScene(s);
                stg.show();

            } else if (LoginController.tmpAccountstatus.equals("Principal")) {

                Parent p = FXMLLoader.load(getClass().getResource("FXMLPrincipalPanel.fxml"));

                Scene s = new Scene(p);
                Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                stg.setScene(s);
                stg.show();

            } else if (LoginController.tmpAccountstatus.equals("Admin")) {

                Parent p = FXMLLoader.load(getClass().getResource("FXMLAdminPanel.fxml"));

                Scene s = new Scene(p);
                Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                stg.setScene(s);
                stg.show();

            }

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
