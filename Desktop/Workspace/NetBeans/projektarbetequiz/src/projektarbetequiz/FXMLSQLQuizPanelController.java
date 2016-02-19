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

public class FXMLSQLQuizPanelController implements Initializable {

    @FXML
    private Label randomQuestionLabel;

    @FXML
    private Label testQuestionLabel;

    @FXML
    private Label randomTimeLabel;

    @FXML
    private Label testTimeLabel;

    @FXML
    private Button startRandomBtn;

    @FXML
    private Button startTestBtn;

    @FXML
    private Button backBtn;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == startRandomBtn) {
// if user clicks on Start random test 

            Parent p = FXMLLoader.load(getClass().getResource("FXMLSQLQuizRandom.fxml"));

            Scene s = new Scene(p);
            Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stg.setScene(s);
            stg.show();

        } else if (event.getSource() == startTestBtn) {
            // if user clicks on Start Test button 

            JOptionPane.showMessageDialog(null, "Start TEST");

        } else if (event.getSource() == backBtn) {
            // if user click on Back button 

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
