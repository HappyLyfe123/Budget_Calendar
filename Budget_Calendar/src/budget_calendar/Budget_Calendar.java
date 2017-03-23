/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budget_calendar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Thia
 */
public class Budget_Calendar extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SignIn_Page.fxml"));    
        Scene scene = new Scene(root);
        stage.setTitle("D.O.T INC.");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static boolean logIn(String email, String password){
        boolean is_Correct = false;
        //  Database credentials
        String USER = "dot";
        String PASS = "123";
        String DBNAME = "CECS343DB";

    // user credentials

    // JDBC driver name and database URL
        final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
        String DB_URL = "jdbc:derby://localhost:1527/";

        String sql;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        DB_URL = DB_URL + DBNAME + ";user="+ USER + ";password=" + PASS;
        Connection conn = null; //initialize the connection
        ResultSet rs;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL);
            
            // login
            sql = "SELECT * FROM users WHERE email=?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,email);
            rs = pstmt.executeQuery();
            rs.next();
            String userPasswordFromDB = rs.getString("password");
            
            if (password.equals(userPasswordFromDB)) {
                conn.close();
                is_Correct =  true;
            }
            else {
                conn.close();
                is_Correct = false;
            }
            
        } catch (SQLException se) {
            //Handle errors for JDBC
            //se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        return is_Correct;
    }
    
    public static void createAccountDB(String first_name, String last_name, String email_address, String password){
        
    }
    
    public static void setIncomeToDB(int income_amount){
        
    }
}
