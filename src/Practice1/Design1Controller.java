/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author intel
 */
public class Design1Controller implements Initializable {

    @FXML
    private Button goNextSceneButton;
    @FXML
    private Label view1Title;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField AgeTextField;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private Button submitButton;

    
    ObservableList<Person> list =FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
    }    

    @FXML
    private void goToNextScene(ActionEvent event) {
    }

    @FXML
    private void savePersonObject(ActionEvent event) {
        
        Person p = new Person(this.nameTextField.getText(),this.AgeTextField.getText(),this.colorPicker.getValue());
        
        list.add(p);
        System.out.println(list);
    }
    
}
