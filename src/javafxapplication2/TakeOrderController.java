package javafxapplication2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class TakeOrderController implements Initializable {

            @FXML
            private TextField item;
            @FXML
            private TextField workername;
            @FXML
            private DatePicker dateorder;
            @FXML
            private  TextField cliname;
            @FXML
            Button submit;
            
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*try {
            // TODO
            Connection con = DBConnector.getConnection();
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(TakeOrderController.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    
    //On Click of Button(Enter)
        public void onbutton(ActionEvent event)
        {
                try {
                    //ModelTableOrder entry = new ModelTableOrder(item.getText(), workername.getText(), Date.valueOf(dateorder.getValue()), cliname.getText());
                    Connection con = DBConnector.getConnection();
                    String query = "insert into orders value('"+item.getText()+"','"+workername.getText()+"','"+Date.valueOf(dateorder.getValue())+"','"+cliname.getText()+"')";
                    Statement st = con.createStatement();
                    st.executeUpdate(query);
                } 
                catch (SQLException ex) 
                {
                    Logger.getLogger(TakeOrderController.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    
}
