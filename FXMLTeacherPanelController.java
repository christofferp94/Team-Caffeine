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
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXMLTeacherPanelController implements Initializable {

    @FXML
    private Button studentPanelBtn;
    
    @FXML
    private Button backAdminPanelBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private Button changePasswordBtn;

    @FXML
    private Button changeEmailBtn;

    @FXML
    private Button addQuestionBtn;

    @FXML
    private Button deleteQuestionBtn;

    @FXML
    private Button modifyQuestionBtn;

    @FXML
    private Button classListBtn;

//    @FXML
//    private Button unknowBtn;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == studentPanelBtn) {
            // when Teacher press StudentPanel

            Parent p = FXMLLoader.load(getClass().getResource("FXMLStudentStartMenu.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == logoutBtn) {
            // when Teacher press Logout 

            Parent p = FXMLLoader.load(getClass().getResource("Login.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == changePasswordBtn) {
            // when teacher press change password

            Parent p = FXMLLoader.load(getClass().getResource("FXMLChangePassword.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == changeEmailBtn) {
            // when teacher press change email 

            Parent p = FXMLLoader.load(getClass().getResource("FXMLChangeEmail.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == addQuestionBtn) {
            // when teacher press add question 

//            Parent p = FXMLLoader.load(getClass().getResource("CreateNewQuestionFXML.fxml"));
//
//            Scene s = new Scene(p);
//            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//            stg.setScene(s);
//            stg.show();

        } else if (event.getSource() == deleteQuestionBtn) {
            // when teacher press deleteQuestion 
         
            Parent p = FXMLLoader.load(getClass().getResource("DeleteQuestion.fxml"));
            
            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
            
            stg.setScene(s);
            stg.show();
             
            

        } else if (event.getSource() == modifyQuestionBtn) {
            // When teacher press modify question 

            /*
            Parent p = FXMLLoader.load(getClass().getResource("FXMLXXXX.fxml"));
            
            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
            
            stg.setScene(s);
            stg.show();
             */
            JOptionPane.showMessageDialog(null, "Modify question ");

        } else if (event.getSource() == classListBtn) {
            // when teacher press classList 

            /*
            Parent p = FXMLLoader.load(getClass().getResource("FXMLXXXX.fxml"));
            
            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
            
            stg.setScene(s);
            stg.show();
             */
            JOptionPane.showMessageDialog(null, "Class List ");
        }
    }
 @FXML
    private void BackButtonAction(ActionEvent event) throws IOException {
       if (event.getSource() == backAdminPanelBtn) {
            // ADD ME !! 
            Parent p = FXMLLoader.load(getClass().getResource("FXMLAdminPanel.fxml"));
            
            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
            
            stg.setScene(s);
            stg.show();

            JOptionPane.showMessageDialog(null, "Hehehhe");

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
