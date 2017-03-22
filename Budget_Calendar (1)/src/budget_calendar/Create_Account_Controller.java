/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget_calendar;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Thia
 */
public class Create_Account_Controller {
    
    @FXML
    TextField first_name_textfield;
    @FXML
    TextField last_name_textfield;
    @FXML
    TextField emial_text_field;
    @FXML
    PasswordField password_passwordfield;
    @FXML
    PasswordField re_password_passwordfield;
    
    private String first_name, last_name, email_address, password, re_password;
    
    @FXML
    private void cancelBTNClick(ActionEvent event) throws IOException{
        Parent signin_page_parent = FXMLLoader.load(getClass().getResource("SignIn_Page.fxml"));
        Scene signin_page_scence = new Scene(signin_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.close();
        app_stage.setScene(signin_page_scence);
        app_stage.setTitle("Sign In Page");
        app_stage.show();
    }
    
    @FXML
    private void submitBTNClick(ActionEvent event) throws IOException{
        first_name = first_name_textfield.getText();
        last_name = last_name_textfield.getText();
        email_address = emial_text_field.getText();
        password = password_passwordfield.getText();
        re_password = re_password_passwordfield.getText();
    }
}
