package gui;

import javax.swing.*;

public class AreaCilindroGui {

    private JPanel panel;
    
	private JTextField inputRadio;
	private JTextField inputAltura;
	private JTextArea inputRespuesta;
	private JButton botonProcesar;
	private JButton botonBorrar;
	
    public AreaCilindroGui() {
        panel = new JPanel();
        panel.setLayout(null);
        
        createGui();
    }
    
    private void createGui() {
		JLabel labelRadio = new JLabel("Radio");
		labelRadio.setBounds(12, 17, 63, 15);
		panel.add(labelRadio);
		
		inputRadio = new JTextField();
		inputRadio.setBounds(67, 15, 114, 19);
		panel.add(inputRadio);
		inputRadio.setColumns(10);
		
		JLabel labelAltura = new JLabel("Altura");
		labelAltura.setBounds(12, 54, 70, 15);
		panel.add(labelAltura);
		
		inputAltura = new JTextField();
		inputAltura.setBounds(67, 52, 114, 19);
		panel.add(inputAltura);
		inputRadio.setColumns(10);
		
		inputRespuesta = new JTextArea();
		inputRespuesta.setEditable(false);
		inputRespuesta.setBounds(32, 108, 536, 224);
		panel.add(inputRespuesta);
		
    	botonProcesar = new JButton("Procesar");
		botonProcesar.setBounds(469, 12, 117, 25);
		panel.add(botonProcesar);
		
		botonBorrar = new JButton("Borrar");
		botonBorrar.setBounds(469, 49, 117, 25);
		panel.add(botonBorrar);
		
    }
    
    public JPanel getPanel() {
		return panel;
	}
    
    public JTextField getInputRadio() {
		return inputRadio;
	}
    
    public JTextField getInputAltura() {
		return inputAltura;
	}
    
    public JTextArea getInputRespuesta() {
		return inputRespuesta;
	}
    
    public JButton getBotonProcesar() {
		return botonProcesar;
	}
    
    public JButton getBotonBorrar() {
		return botonBorrar;
	}

}
