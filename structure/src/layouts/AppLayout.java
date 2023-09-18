package layouts;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AppLayout extends JFrame{
    private JPanel panel;
    
    private JButton switchToAreaCilindroButton;
    private JButton switchToCalculatorButton;

    public AppLayout() {
        panel = new JPanel();
    	createGui();
    }
    
    private void createGui() {
    	switchToAreaCilindroButton = new JButton("Ir a AreaCilindro");
    	switchToAreaCilindroButton.setBounds(23, 273, 160, 15);
    	panel.add(switchToAreaCilindroButton);
    	
        switchToCalculatorButton = new JButton("Ir a Calculator");
        switchToCalculatorButton.setBounds(256, 273, 167, 15);
        panel.add(switchToCalculatorButton);
    }
    
    public JPanel getPanel() {
		return panel;
	}
    
    public JButton getSwitchToAreaCilindroButton() {
		return switchToAreaCilindroButton;
	}
    
    public JButton getSwitchToCalculatorButton() {
		return switchToCalculatorButton;
	}
}
