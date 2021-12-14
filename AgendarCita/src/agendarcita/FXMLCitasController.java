/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendarcita;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

/**
 *
 * @author Personal
 */
public class FXMLCitasController implements Initializable {
    
  
    @FXML
	private Label citaFecha;

    @FXML
	private DatePicker calendarioCita;   
    
    
    @FXML
	public void agendar(){
		
		
		LocalDate fechaHoy = calendarioCita.getValue();
                String myFormattedDate = fechaHoy.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
                citaFecha.setText(myFormattedDate);

	}
        
        
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
