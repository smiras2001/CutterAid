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
        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        // Paper size label panel
        JPanel initPanel = new JPanel();
        initPanel.setLayout(new BoxLayout(initPanel, BoxLayout.Y_AXIS));
        JLabel initLabel = new JLabel("Paper Size");
        Font initLabelFont = initLabel.getFont();
        initLabel.setFont(initLabelFont.deriveFont(20f));
        initLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        initPanel.add(initLabel);
        initPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(initPanel);
        // Paper size label/spinner panel
        JPanel firstLabelSpinnerPanel = new JPanel();
        firstLabelSpinnerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        firstLabelSpinnerPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        // Paper size width label/spinner
        JLabel firstLabel = new JLabel("Width:");
        JSpinner firstSpinner = new JSpinner(new SpinnerNumberModel(0,0,26,1));
        firstLabelSpinnerPanel.add(firstLabel);
        firstLabelSpinnerPanel.add(firstSpinner);
        firstLabelSpinnerPanel.add(Box.createHorizontalStrut(10));
        // Paper size length label/spinner
        JLabel secondLabel = new JLabel("Length");
        JSpinner secondSpinner = new JSpinner(new SpinnerNumberModel(0,0,26,1));
        firstLabelSpinnerPanel.add(secondLabel);
        firstLabelSpinnerPanel.add(secondSpinner);
        mainPanel.add(firstLabelSpinnerPanel);
        //Final size label
        JPanel finalPanel = new JPanel();
        finalPanel.setLayout(new BoxLayout(finalPanel, BoxLayout.Y_AXIS));
        JLabel finalLabel = new JLabel("Final size");
        Font finalLabelFont = finalLabel.getFont();
        finalLabel.setFont(finalLabelFont.deriveFont(20f));
        finalLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.add(finalLabel);
        mainPanel.add(Box.createVerticalStrut(1));
        getContentPane().add(mainPanel);


    }
}