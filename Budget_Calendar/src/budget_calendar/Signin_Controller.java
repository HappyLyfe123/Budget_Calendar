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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author Thia
 */
public class Signin_Controller implements Initializable{
    
    @FXML 
    Label error_label;
    @FXML
    TextField email_address_textFild;
    @FXML
    PasswordField password_passwordfield;
    
    private String email_address, password;
    
    @FXML
    private void signinBTNClick(ActionEvent event) throws IOException{
        email_address = email_address_textFild.getText();
        password = password_passwordfield.getText();
        
        if(Budget_Calendar.logIn(email_address, password)){
            Parent calendar_view_parent = FXMLLoader.load(getClass().getResource("Calendar_View.fxml"));
            Scene calendar_view_scence = new Scene(calendar_view_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.close();
            app_stage.setScene(calendar_view_scence);
            app_stage.setTitle("Calendar");
            app_stage.show();
        }
        else{
            error_label.setVisible(true);
        }
    }
    
    @FXML
    private void createAccountLabelClick(MouseEvent event) throws IOException{
        Parent create_account_label_parent = FXMLLoader.load(getClass().getResource("Create_Account.fxml"));
        Scene create_account_label_scence = new Scene(create_account_label_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.close();
        app_stage.setScene(create_account_label_scence);
        app_stage.setTitle("Create Account");
        app_stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
