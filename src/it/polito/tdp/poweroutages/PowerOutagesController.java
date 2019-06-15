package it.polito.tdp.poweroutages;

import it.polito.tdp.poweroutages.model.Model;
import it.polito.tdp.poweroutages.model.Nerc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PowerOutagesController {

    @FXML
    private ComboBox<Nerc> boxNerc;

    @FXML
    private TextField txtAnni;

    @FXML
    private TextField txtOre;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextArea txtResult;
    
    Model model = new Model();
    
    public void setModel(Model model) {
    	this.model=model;
    	boxNerc.getItems().addAll(model.getNercList());
    }
    @FXML
    void doCalcola(ActionEvent event) {
    	int anni=Integer.parseInt(txtAnni.getText());
    	int ore=Integer.parseInt(txtOre.getText());
    	
    	List<>model.getSoluzione(anni,ore);
    }

}
