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

/**
 * FXML Controller class
 *
 * @author R
 */
public class FXMLAdminPanelController implements Initializable {

    @FXML
    private Label idlabel;

    @FXML
    private TextField usernameFld;

    @FXML
    private TextField passwordFld;

    @FXML
    private TextField emailFld;

    @FXML
    private TextField nameFld;

    @FXML
    private TextField lastnameFld;

    @FXML
    private TextField statusFld;

    @FXML
    private Button saveBtn;

    @FXML
    private TextField searchFld;

    @FXML
    private Button searchBtn;

    @FXML
    private Button registerQuestionBtn;

    @FXML
    private Button registerUserBtn;

    @FXML
    private Button regularUserBtn;

    @FXML
    private Label message;

    @FXML
    private Label error;

    @FXML
    private Button logoutBtn;

    @FXML
    private Button deleteQuestionBtn;

    @FXML
    private Button teacherBtn;

    @FXML
    private Button principalBtn;
    
    @FXML
    private Button editQuestionBtn;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        message.setText("");
        error.setText("");

        if (event.getSource() == searchBtn) {
            JOptionPane.showMessageDialog(null, "Search");

        } else if (event.getSource() == saveBtn) {
            JOptionPane.showMessageDialog(null, "Save");

        } else if (event.getSource() == registerQuestionBtn) {

            JOptionPane.showMessageDialog(null, "Register Question");

        } else if (event.getSource() == registerUserBtn) {
            JOptionPane.showMessageDialog(null, "Register user");

        } else if (event.getSource() == regularUserBtn) {
            JOptionPane.showMessageDialog(null, "Regular user");

        } else if (event.getSource() == deleteQuestionBtn ) {
            JOptionPane.showMessageDialog(null, "Delete Question");
            
        } else if (event.getSource() == teacherBtn) {
            JOptionPane.showMessageDialog(null, "Teacher Panel Button");
            
        } else if (event.getSource() == principalBtn) {
            JOptionPane.showMessageDialog(null, "Principal Panel Button");
            
        } else if (event.getSource() == editQuestionBtn) {
            JOptionPane.showMessageDialog(null, "Edit Question Button");
            
        } else if (event.getSource() == logoutBtn) {

            Parent p = FXMLLoader.load(getClass().getResource("Login.fxml"));

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
