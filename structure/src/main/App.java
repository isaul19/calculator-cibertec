package main;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import events.AppEvents;
import layouts.AppLayout;
import views.AreaCilindro;
import views.Calculator;

public class App extends JFrame{
    private static final long serialVersionUID = 1L;
	private JPanel cardPanel;
    private CardLayout cardLayout;

    private AppLayout layout;
    private AppEvents events;
    
    private AreaCilindro areaCilindroView;
    private Calculator calculatorView;

    public App() {
    	setSize(600, 450);
    	views();
    	inicializeGui();
    	inicializeEvents();
    	
    	setLocationRelativeTo(null);
    }
    
    private void views() {
    	 cardLayout = new CardLayout();
         cardPanel = new JPanel(cardLayout);

         areaCilindroView = new AreaCilindro();
         calculatorView = new Calculator();

         cardPanel.add(areaCilindroView.getContentPane(), "AreaCilindro");
         cardPanel.add(calculatorView.getContentPane(), "Calculator");

         getContentPane().add(cardPanel);
    }
    
    private void inicializeGui() {
        layout = new AppLayout();
        getContentPane().add(layout.getPanel(), BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void inicializeEvents() {
    	events = new AppEvents(layout, cardLayout, cardPanel);
    }

    public void start() {
    	setVisible(true);
    }
}
