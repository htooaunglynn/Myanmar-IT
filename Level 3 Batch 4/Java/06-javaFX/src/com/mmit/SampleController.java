package com.mmit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML // fx:id="cboPosition"
    private ComboBox<?> cboPosition; // Value injected by FXMLLoader

    @FXML // fx:id="chkCS"
    private CheckBox chkCS; // Value injected by FXMLLoader

    @FXML // fx:id="chkJS"
    private CheckBox chkJS; // Value injected by FXMLLoader

    @FXML // fx:id="chkJava"
    private CheckBox chkJava; // Value injected by FXMLLoader

    @FXML // fx:id="rdoFemale"
    private RadioButton rdoFemale; // Value injected by FXMLLoader

    @FXML // fx:id="rdoMale"
    private RadioButton rdoMale; // Value injected by FXMLLoader

    @FXML // fx:id="tmrBirthday"
    private DatePicker tmrBirthday; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextArea txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private PasswordField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtSalary"
    private TextField txtSalary; // Value injected by FXMLLoader

    @FXML
    void btnRegisterClick(ActionEvent event) {
    	String name = txtName.getText();
    	
    	System.out.println("Name : " + name);
    }
    

    @FXML
    void btnLoginClick(ActionEvent event) {
    	String name = txtName.getText();
    	
    	System.out.println("Name : " + name);
    }

}
