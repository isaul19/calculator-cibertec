package views;

import javax.swing.*;

import components.CalculatorComponents;
import events.CalculatorEvents;

public class Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JPanel calculatorPanel;
	private CalculatorComponents components;
	private CalculatorEvents events;

    public Calculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 598, 354);
        
        inicializeComponents();
        inicializeEvents();
    }
    
    private void inicializeComponents() {
        components = new CalculatorComponents();
        calculatorPanel = components.getPanel();
        setContentPane(calculatorPanel);
    }
    
    private void inicializeEvents() {
        events = new CalculatorEvents(components);
    }

    public void start() {
        setVisible(true);
    }
}