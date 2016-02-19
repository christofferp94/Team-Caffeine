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
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class FXMLSQLQuizRandomController implements Initializable {

    @FXML
    private Label questionLabel;

    @FXML
    private RadioButton questionalternative1;

    @FXML
    private RadioButton questionalternative2;

    @FXML
    private RadioButton questionalternative3;

    @FXML
    private Button nextBtn;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {

        if (event.getSource() == nextBtn) {
            // when user clicks next button

            JOptionPane.showMessageDialog(null, "Next");

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
