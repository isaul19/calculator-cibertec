package main;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import events.AppEvents;
import layouts.AppLayout;
import views.AreaCilindroView;
import views.CalculatorView;

public class App extends JFrame{
    private static final long serialVersionUID = 1L;
	private JPanel cardPanel;
    private CardLayout cardLayout;

    private AppLayout layout;
    private AppEvents events;
    
    private AreaCilindroView areaCilindroView;
    private CalculatorView calculatorView;

    public App() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setLocationRelativeTo(null);
    	setSize(600, 450);
    	
    	views();
    	inicializeLayout();
    	inicializeEvents();
    	
    }
    
    private void views() {
    	 cardLayout = new CardLayout();
         cardPanel = new JPanel(cardLayout);

         areaCilindroView = new AreaCilindroView();
         calculatorView = new CalculatorView();

         cardPanel.add(areaCilindroView.getContentPane(), "AreaCilindro");
         cardPanel.add(calculatorView.getContentPane(), "Calculator");

         getContentPane().add(cardPanel);
    }
    
    private void inicializeLayout() {
        layout = new AppLayout();
        getContentPane().add(layout.getPanel(), BorderLayout.SOUTH);
    }
    
    private void inicializeEvents() {
    	events = new AppEvents(layout, cardLayout, cardPanel);
    }

    public void start() {
    	setVisible(true);
    }
}
