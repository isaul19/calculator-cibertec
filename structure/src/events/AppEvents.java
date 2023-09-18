package events;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import layouts.AppLayout;

public class AppEvents {
    private AppLayout components;
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public AppEvents(AppLayout components, CardLayout cardLayout, JPanel cardPanel) {
        this.components = components; 
        this.cardLayout = cardLayout;
        this.cardPanel = cardPanel;
        createEvents(); 
    }

    private void createEvents() {
        components.getSwitchToAreaCilindroButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "AreaCilindro"); // Cambiar a la vista "AreaCilindro"
            }
        });

        components.getSwitchToCalculatorButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Calculator"); // Cambiar a la vista "Calculator"
            }
        });
    }
}
