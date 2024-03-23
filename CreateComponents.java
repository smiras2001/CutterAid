import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CreateComponents {
    public static JPanel createMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return mainPanel;
    }

    public static JLabel createMainLabel(String label) {
        JLabel mainLabel = new JLabel(label);
        Font mainLabelFont = mainLabel.getFont();
        mainLabel.setFont(mainLabelFont.deriveFont(20f));
        mainLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        return mainLabel;
    }

    public static JPanel createLabelSpinnerPanel(String label, double initialValue,double min, double max, double stepSize) {
        JPanel panel = new JPanel();
        JLabel labelText = new JLabel(label);
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(initialValue, min, max, stepSize));
        panel.add(labelText);
        panel.add(spinner);
        return panel;
    }

    public static JButton createButton(String buttonText) {
        JButton button = new JButton(buttonText);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Submitted");
            }
        });
        return button;
    }
}