/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget_calendar;

import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Thia
 */
public class Signin_Controller implements Initializable{
    
    @FXML 
    Label error_label;
    
    @FXML
    private void signinBTNClick(ActionEvent event) throws IOException{
        error_label.setVisible(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
