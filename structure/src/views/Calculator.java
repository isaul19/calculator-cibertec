package views;

import javax.swing.*;

import events.CalculatorEvents;
import gui.CalculatorGui;

public class Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel calculatorPanel;
	private CalculatorGui components;
	private CalculatorEvents events;

    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 598, 354);
        
        inicializeGui();
        inicializeEvents();
    }
    
    private void inicializeGui() {
        components = new CalculatorGui();
        calculatorPanel = components.getPanel();
        setContentPane(calculatorPanel);
    }
    
    private void inicializeEvents() {
        events = new CalculatorEvents(components);
    }
}