package views;

import javax.swing.*;

import events.AreaCilindroEvents;
import gui.AreaCilindroGui;

public class AreaCilindro extends JFrame {
	private static final long serialVersionUID = 2L;
	
	private JPanel cilindroPanel;
	private AreaCilindroGui components;
	private AreaCilindroEvents events;

    public AreaCilindro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 598, 354);
        
        inicializeGui();
        inicializeEvents();
    }
    
    private void inicializeGui() {
        components = new AreaCilindroGui();
        cilindroPanel = components.getPanel();
        setContentPane(cilindroPanel);
    }
    
    private void inicializeEvents() {
        events = new AreaCilindroEvents(components);
    }
}