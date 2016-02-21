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

public class FXMLRegisterController implements Initializable {

    @FXML
    private TextField usernameFld;

    @FXML
    private PasswordField passwordFld;

    @FXML
    private PasswordField confirmPasswordFld;

    @FXML
    private TextField nameFld;

    @FXML
    private TextField lastnameFld;

    @FXML
    private TextField emailFld;

    @FXML
    private Button registerBtn;

    @FXML
    private Button backBtn;

    @FXML
    private Label message;

    @FXML
    private Label error;

    @FXML
    private TextField classFld;

    String dbURL = "jdbc:mysql://localhost:3306/quizdb";
    String user = "root";
    String pass = "root";

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        // Controll if all the fields are filld in.
        if (event.getSource() == registerBtn) {

            message.setText("");
            error.setText("");

            if (usernameFld.getText().equals("")) {
                message.setText("");
                error.setText("Please fill in username");

            } else if (passwordFld.getText().equals("")) {
                message.setText("");
                error.setText("Please fill in password");

            } else if (confirmPasswordFld.getText().equals("")) {
                message.setText("");
                error.setText("Please confirm your password");

            } else if (nameFld.getText().equals("")) {
                message.setText("");
                error.setText("Please fill in name");

            } else if (lastnameFld.getText().equals("")) {
                message.setText("");
                error.setText("Please fill in lastname");

            } else if (emailFld.getText().equals("")) {
                message.setText("");
                error.setText("Please fill in email");

            } else if (classFld.getText().equals("")) {
                message.setText("");
                error.setText("Please fill in class");

            } else if (!passwordFld.getText().equals(confirmPasswordFld.getText())) {
                message.setText("");
                error.setText("Password does not match");

                // create account
            } else {

                try (Connection conn = (Connection) DriverManager.getConnection(dbURL, user, pass)) {

                    String query = "INSERT INTO UserAccount(User_name, User_password, User_firstName , User_lastName , User_email) VALUES (?, ?, ?, ? , ? )";
                    PreparedStatement statement = (PreparedStatement) conn.prepareStatement(query);
                    statement.setString(1, usernameFld.getText());
                    statement.setString(2, passwordFld.getText());
                    statement.setString(3, nameFld.getText());
                    statement.setString(4, lastnameFld.getText());
                    statement.setString(5, emailFld.getText());
                    

                    statement.executeUpdate();

                    System.out.println("Connect with DataBase - Suceeded ");

                } catch (SQLException ex) {

                    message.setText("");
                    error.setText("Faild to connect with Database");
                    JOptionPane.showMessageDialog(null, ex.getMessage());

                }

                // User message
                error.setText("");
                message.setText("Account created");

                // Clear fields
                usernameFld.clear();
                passwordFld.clear();
                confirmPasswordFld.clear();
                nameFld.clear();
                lastnameFld.clear();
                emailFld.clear();
                classFld.clear();

            }

        } else if (event.getSource() == backBtn) {
            // Go back to Login, when user clicks Back button

            Parent p = FXMLLoader.load(getClass().getResource("Login.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        message.setText("");
        error.setText("");
        usernameFld.clear();
        passwordFld.clear();
        confirmPasswordFld.clear();
        nameFld.clear();
        lastnameFld.clear();
        emailFld.clear();
        classFld.clear();
        
    }

}
