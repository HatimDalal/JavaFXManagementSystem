/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class ItemsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TableView<ModelTable> table;
    @FXML
    private TableColumn<ModelTable,String> col_Items;
    @FXML
    private TableColumn<ModelTable,String> col_Available;
    
   
    ObservableList<ModelTable> oblist = FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            Connection con = DBConnector.getConnection();
            ResultSet rs = con.createStatement().executeQuery("select * from inventory");
            while(rs.next())
            {
                oblist.add(new ModelTable(rs.getString("items"),rs.getString("itemsava")));
            }
            
        }
            catch (SQLException ex) {
            Logger.getLogger(ItemsController.class.getName()).log(Level.SEVERE, null, ex);
        }
            col_Items.setCellValueFactory(new PropertyValueFactory<>("items"));
            col_Available.setCellValueFactory(new PropertyValueFactory<>("available"));
            
            table.setItems(oblist);
        
    }    
    
}
