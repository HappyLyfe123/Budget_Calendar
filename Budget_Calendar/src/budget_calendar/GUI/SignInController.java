package budget_calendar.GUI;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thia
 */
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;

public class SignInController {
    @FXML private TextField user_email_text_box;
    @FXML private PasswordField user_password;
    @FXML private Label create_account;
    @FXML private Label forgot_password;
    @FXML private Label invalid_logIn_error;
    
    @FXML
    private void signInBTNPress(ActionEvent event){
        //user_email_text_box.getText()
        invalid_logIn_error.setVisible(true);
    } 
}
