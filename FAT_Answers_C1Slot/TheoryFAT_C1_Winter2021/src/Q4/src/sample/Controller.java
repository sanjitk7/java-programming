package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button buttSub;
    @FXML
    RadioButton p1;
    RadioButton p2;
    RadioButton p3;

    @FXML
    CheckBox t1;
    CheckBox t2;
    CheckBox t3;

    @FXML
    TextField pies;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
            System.out.println("intialize");

        } catch (Exception e){
            System.out.println(e);
        }
    }

    public void handleSubmit(ActionEvent a){
        try{
            float price = Float.parseFloat(pies.getText());
            System.out.println("printed");
            if (t1.isSelected()){
                price +=10;
            }
            if (t2.isSelected()){
                price +=10;
            }
            if (t3.isSelected()) {
                price += 10;
            }
            System.out.println("The Amount : "+ price);

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
