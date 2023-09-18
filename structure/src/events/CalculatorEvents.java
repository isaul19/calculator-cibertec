package events;

import utils.CalculatorUtils;
import utils.Errors;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.CalculatorGui;

public class CalculatorEvents {
    private CalculatorGui components;

    public CalculatorEvents(CalculatorGui components) {
        this.components = components; 
        createEvents(); 
    }

    private void createEvents() {
    	// Se añaden los eventos a los respectivos componentes por referencia
    	// (El componente necesita un getter)
    	
    	components.getBtnCalculate().addActionListener(new ActionListener() {
    		
            public void actionPerformed(ActionEvent e) {
            	String student = components.getInputName().getText();
            	String note1Text = components.getInputNote1().getText();
            	String note2Text = components.getInputNote2().getText();
            	String note3Text = components.getInputNote3().getText();
            	
            	if (!CalculatorUtils.isValidStudent(student)) {
            		Errors.showError("Ingresa un nombre de estudiante válido.");
            		return;
            	}
            	
                if (!CalculatorUtils.isValidNote(note1Text) || !CalculatorUtils.isValidNote(note2Text) || !CalculatorUtils.isValidNote(note3Text)) {
                    Errors.showError("Ingresa notas válidas entre 0 y 20");
                    return;
                }

            	// una vez que verifiquemos los datos procesamos a las operaciones
            	double note1 = Double.parseDouble(note1Text);
            	double note2 = Double.parseDouble(note2Text);
            	double note3 = Double.parseDouble(note3Text);
            	double average = (note1 + note2 + note3) / 3;
            	double minNote = 10.5;
            	
            	String result = average <= minNote ? "No pasó la materia" : "Si pasó la materia";
            	
            	components.getLabelAverage().setText("Promedio: " + average);
            	components.getLabelResult().setText("Resultado: El alumno " + student + " " + result);
            }
        });
    }
}
