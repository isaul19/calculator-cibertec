package main;

import javax.swing.*;

import views.AreaCilindro;
import views.Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Old_app extends JFrame {
    private JPanel cardPanel;
    private CardLayout cardLayout;

    public Old_app() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Crea las vistas que deseas mostrar
        AreaCilindro areaCilindroView = new AreaCilindro();
        Calculator calculatorView = new Calculator();

        // Agrega las vistas al CardLayout
        cardPanel.add(areaCilindroView.getContentPane(), "AreaCilindro");
        cardPanel.add(calculatorView.getContentPane(), "Calculator");

        // Agrega el CardLayout al contenedor principal
        getContentPane().add(cardPanel);

        // Botón para cambiar a la vista "AreaCilindro"
        JButton switchToAreaCilindroButton = new JButton("Ir a AreaCilindro");
        switchToAreaCilindroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "AreaCilindro"); // Cambia a la vista "AreaCilindro"
            }
        });

        // Botón para cambiar a la vista "Calculator"
        JButton switchToCalculatorButton = new JButton("Ir a Calculator");
        switchToCalculatorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Calculator"); // Cambia a la vista "Calculator"
            }
        });

        // Agrega los botones en la parte inferior de la ventana
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(switchToAreaCilindroButton);
        buttonPanel.add(switchToCalculatorButton);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    public void start() {
    	setVisible(true);
    }

}