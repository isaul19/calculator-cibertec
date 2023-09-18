package gui;

import javax.swing.*;

public class CalculatorGui {

    private JPanel panel;
    
    private JTextField inputName;
    private JTextField inputNote1;
    private JTextField inputNote2;
    private JTextField inputNote3;
    private JButton btnCalculate;
    private JLabel labelAverage;
    private JLabel labelResult;

    public CalculatorGui() {
        panel = new JPanel();
        panel.setLayout(null);
        
        createGui();
    }
    
    private void createGui() {
        JLabel labelTitle = new JLabel("Calcular Promedio");
        labelTitle.setBounds(226, 12, 145, 15);
        panel.add(labelTitle);
        
        JLabel labelName = new JLabel("Nombre");
        labelName.setBounds(22, 66, 70, 15);
        panel.add(labelName);
        
        inputName = new JTextField();
        inputName.setBounds(110, 64, 319, 19);
        panel.add(inputName);
        inputName.setColumns(10);
        
        JLabel labelNote1 = new JLabel("Nota 1:");
        labelNote1.setBounds(22, 120, 70, 15);
        panel.add(labelNote1);
        
        inputNote1 = new JTextField();
        inputNote1.setBounds(86, 120, 82, 19);
        panel.add(inputNote1);
        inputNote1.setColumns(10);
        
        JLabel labelNote2 = new JLabel("Nota 2:");
        labelNote2.setBounds(211, 120, 70, 15);
        panel.add(labelNote2);
        
        inputNote2 = new JTextField();
        inputNote2.setBounds(285, 118, 82, 19);
        panel.add(inputNote2);
        inputNote2.setColumns(10);
        
        JLabel labelNote3 = new JLabel("Nota 3:");
        labelNote3.setBounds(414, 120, 70, 15);
        panel.add(labelNote3);
        
        inputNote3 = new JTextField();
        inputNote3.setBounds(489, 118, 82, 19);
        panel.add(inputNote3);
        inputNote3.setColumns(10);
        
        btnCalculate = new JButton("Calcular");
        btnCalculate.setBounds(454, 184, 117, 25);
        panel.add(btnCalculate);
        
        labelResult = new JLabel("Resultado:");
        labelResult.setBounds(22, 289, 561, 15);
        panel.add(labelResult);
        
        labelAverage = new JLabel("Promedio:");
        labelAverage.setBounds(22, 251, 561, 15);
        panel.add(labelAverage);
    }

    public JPanel getPanel() {
        return panel;
    }
    
    public JButton getBtnCalculate() {
		return btnCalculate;
	}
    
    public JTextField getInputName() {
		return inputName;
	}
    
    public JTextField getInputNote1() {
		return inputNote1;
	}
    
    public JTextField getInputNote2() {
		return inputNote2;
	}
    
    public JTextField getInputNote3() {
		return inputNote3;
	}
    
    public JLabel getLabelAverage() {
		return labelAverage;
	}
    
    public JLabel getLabelResult() {
		return labelResult;
	}
}
