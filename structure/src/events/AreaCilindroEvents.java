package events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.AreaCilindroGui;
import utils.Numbers;
import utils.Errors;

public class AreaCilindroEvents {
    private AreaCilindroGui components;

    public AreaCilindroEvents(AreaCilindroGui components) {
        this.components = components; 
        createEvents(); 
    }

    private void createEvents() {
    	// Se añaden los eventos a los respectivos componentes por referencia
    	// (El componente necesita un getter)
    	
    	components.getBotonProcesar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				double pi = 3.1416;
				String radioText = components.getInputRadio().getText();
				String alturaText = components.getInputAltura().getText();
				
				System.out.println(radioText);
				System.out.println(alturaText);
				
				if(!Numbers.isDouble(radioText) || !Numbers.isDouble(alturaText)) {
					Errors.showError("El radio y la altura deben ser números");
					return;
				}
				
				double radio = Double.parseDouble(radioText);
				double altura = Double.parseDouble(alturaText);
				
				double areaBase = pi * (radio * radio);
				double areaLateral = 2 * pi * radio * altura;
				double areaTotal = 2 * areaBase + areaLateral;
				
				StringBuilder result = new StringBuilder();
				result.append("PROPIEDADES GEOMETRICAS DEL CILINDRO\n");
				result.append("AREA BASE: " + areaBase + "\n");
				result.append("AREA LATERAL: " + areaLateral + "\n");
				result.append("AREA TOTAL: " + areaTotal);
				
				components.getInputRespuesta().setText(result.toString());
            }
        });
    	
    	components.getBotonBorrar().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				components.getInputRadio().setText("");
				components.getInputAltura().setText("");
				components.getInputRespuesta().setText("");
            }
        });
    }
}
