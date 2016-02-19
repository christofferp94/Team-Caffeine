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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class LoginController implements Initializable {

    @FXML
    private TextField usernameFld;

    @FXML
    private PasswordField passwordFld;

    @FXML
    private Button loginBtn;

    @FXML
    private Button registerBtn;

    @FXML
    private Label error;

    // Static strings 
    static String logginUsername;
    static String tmpPassword;
    static String tmpAccountstatus;

    String dbURL = "jdbc:mysql://localhost:3306/quizdb";
    String user = "root";
    String pass = "XXXXX";

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

                // Login Database 
                try (Connection conn = (Connection) DriverManager.getConnection(dbURL, user, pass)) {

                    String query = "SELECT User_name, User_password,User_status FROM useraccount WHERE user_name =?";
                    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(query);
                    statement.setString(1, usernameFld.getText());
                    ResultSet result = statement.executeQuery();
                    while (result.next()) {

                        // Add info to string. tmp = Temporary
                        logginUsername = result.getString("User_name");
                        tmpPassword = result.getString("User_password");
                        tmpAccountstatus = result.getString("User_status");
                        System.out.println("Connect with DataBase - Suceeded ");

                    }

                } catch (SQLException e) {
                    error.setText("Can not connect to database");
                    e.printStackTrace();
                }

                if (!usernameFld.getText().equals(logginUsername)) {
                    // if username does not match the username user typed in
                    error.setText("Wrong username/password");

                } else if (!passwordFld.getText().equals(tmpPassword)) {

                    error.setText("Wrong username/password");

                } else if (tmpAccountstatus.equals("Student")) {

                    usernameFld.clear();
                    passwordFld.clear();

                    Parent p = FXMLLoader.load(getClass().getResource("FXMLStudentStartMenu.fxml"));

                    Scene s = new Scene(p);
                    Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    stg.setScene(s);
                    stg.show();

                } else if (tmpAccountstatus.equals("Teacher")) {

                    usernameFld.clear();
                    passwordFld.clear();

                    Parent p = FXMLLoader.load(getClass().getResource("FXMLTeacherPanel.fxml"));

                    Scene s = new Scene(p);
                    Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    stg.setScene(s);
                    stg.show();

                } else if (tmpAccountstatus.equals("Principal")) {

                    usernameFld.clear();
                    passwordFld.clear();

                    Parent p = FXMLLoader.load(getClass().getResource("FXMLPrincipalPanel.fxml"));

                    Scene s = new Scene(p);
                    Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    stg.setScene(s);
                    stg.show();

                } else if (tmpAccountstatus.equals("Admin")) {

                    usernameFld.clear();
                    passwordFld.clear();

                    Parent p = FXMLLoader.load(getClass().getResource("FXMLAdminPanel.fxml"));

                    Scene s = new Scene(p);
                    Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    stg.setScene(s);
                    stg.show();
                }

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
