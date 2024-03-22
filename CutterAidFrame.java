import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
public class CutterAidFrame extends JFrame {
    public CutterAidFrame() {
        String[] labels = {"Width", "Length"};
        setTitle("CutterAid");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JButton button = new JButton("Submit");

        gbc.insets = new Insets(5,5,5,5);
        for (int i = 0; i < 2; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.weightx = 0;
            gbc.gridwidth = 1;
            JLabel label = new JLabel(labels[i] + ":");
            panel.add(label, gbc);

            gbc.gridx = 1;
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.weightx = 1;
            JSpinner spinner = new JSpinner();
            spinner.setPreferredSize(new Dimension(35, 20));
            panel.add(spinner, gbc);
        }
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.insets = new Insets(10,10,10,10);
        panel.add(button, gbc);
        getContentPane().add(panel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Submitted");
            }
        });
    }
}