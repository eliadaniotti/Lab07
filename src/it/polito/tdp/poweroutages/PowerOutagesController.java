package it.polito.tdp.poweroutages;

import java.util.List;

import java.net.URL;
import java.util.ResourceBundle;
import it.polito.tdp.poweroutages.model.Model;
import it.polito.tdp.poweroutages.model.Nerc;
import it.polito.tdp.poweroutages.model.PowerOutages;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PowerOutagesController {
	
	private Model model;
	
	
    
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
    
    
    public void setModel(Model model) {
    	this.model=model;
    	boxNerc.getItems().addAll(model.getNercList());
    }
    @FXML
    void doCalcola(ActionEvent event) {
    	int anni=Integer.parseInt(txtAnni.getText());
    	int ore=Integer.parseInt(txtOre.getText());
    	
    	List<PowerOutages> soluzione = model.getSoluzione(anni,ore);
    }
    
    @FXML
    void initialize() {
        assert boxNerc != null : "fx:id=\"boxNerc\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert txtAnni != null : "fx:id=\"txtAnni\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert txtOre != null : "fx:id=\"txtOre\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'PowerOutages.fxml'.";

    }

}
