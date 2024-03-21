import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
public class CutterAidFrame extends JFrame {
    public CutterAidFrame() {

        setTitle("CutterAid");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JButton button = new JButton("Submit");

        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(5,5,5,5);
        for (int i = 0; i < 4; i++) {
            JSpinner spinner = new JSpinner();
            gbc.gridy = i;
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