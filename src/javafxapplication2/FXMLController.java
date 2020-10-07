/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
    }
    public void items0()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("items.fxml"));
        try {
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Items");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void items1()
    {
        try
        {
            FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("UpdateInv.fxml"));
                Parent root1 = (Parent) fXMLLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Updater");
                stage.setScene(new Scene(root1));
                stage.show();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    
    //Ordering System Calling
    public void order1()
    {
        try
        {
            FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("TakeOrder.fxml"));
                Parent root1 = (Parent) fXMLLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Placing Order");
                stage.setScene(new Scene(root1));
                stage.show();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
    
    
    public void exit1()
    {
        try 
        {
            System.exit(0);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    
}
