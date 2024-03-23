import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
public class CutterAidFrame extends JFrame {
    public CutterAidFrame() {
        initializeUI();
    }

    private void initializeUI() {
        configureFrame();
        addMainPanel();
    }

    private void configureFrame() {
        setTitle("CutterAid");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addMainPanel() {
        JPanel mainPanel = createMainPanel();
        addPaperSize(mainPanel);
        addFinalSize(mainPanel);
        addUpness(mainPanel);
        addMidSpace(mainPanel);
        getContentPane().add(mainPanel);
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return mainPanel;
    }

    private void addPaperSize(JPanel mainPanel) {
        JLabel firstLabel = createMainLabel("Paper Size");
        mainPanel.add(firstLabel);
        mainPanel.add(Box.createVerticalStrut(1));

        JPanel firstLabelSpinnerPanel = createLabelSpinnerPanel("Width:", 0,0, 26,1);
        JPanel secondLabelSpinnerPanel = createLabelSpinnerPanel("Length:", 0, 0,26, 1);
        JPanel paperSizePanel = new JPanel();
        paperSizePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        paperSizePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        paperSizePanel.add(firstLabelSpinnerPanel);
        paperSizePanel.add(secondLabelSpinnerPanel);
        mainPanel.add(paperSizePanel);
    }

    private void addFinalSize (JPanel mainPanel) {
        JLabel secondLabel = createMainLabel("Final Size");
        mainPanel.add(secondLabel);
        mainPanel.add(Box.createVerticalStrut(1));

        JPanel firstLabelSpinnerPanel = createLabelSpinnerPanel("Width:", 0,0, 26,1);
        JPanel secondLabelSpinnerPanel = createLabelSpinnerPanel("Length:", 0, 0,26, 1);
        JPanel paperSizePanel = new JPanel();
        paperSizePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        paperSizePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        paperSizePanel.add(firstLabelSpinnerPanel);
        paperSizePanel.add(secondLabelSpinnerPanel);
        mainPanel.add(paperSizePanel);
    }

    private void addUpness (JPanel mainPanel) {
        JLabel thirdLabel = createMainLabel("Upness");
        mainPanel.add(thirdLabel);
        mainPanel.add(Box.createVerticalStrut(1));

        JPanel thirdLabelSpinnerPanel = createLabelSpinnerPanel("Up:", 0, 0, 26,1);
        JPanel finalSizePanel = new JPanel();
        finalSizePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        finalSizePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        finalSizePanel.add(thirdLabelSpinnerPanel);
        mainPanel.add(finalSizePanel);
    }

    private void addMidSpace (JPanel mainPanel) {
        JLabel fourthLabel = createMainLabel("Mid Space");
        mainPanel.add(fourthLabel);
        mainPanel.add(Box.createVerticalStrut(1));

        JPanel fourthLabelSpinnerPanel = createLabelSpinnerPanel("Width:", 0,0, 26,.125);
        JPanel fifthLabelSpinnerPanel = createLabelSpinnerPanel("Length:", 0, 0,26, .125);
        JPanel midSpacePanel = new JPanel();
        midSpacePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        midSpacePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        midSpacePanel.add(fourthLabelSpinnerPanel);
        midSpacePanel.add(fifthLabelSpinnerPanel);
        mainPanel.add(midSpacePanel);
    }

    private JLabel createMainLabel(String label) {
        JLabel mainLabel = new JLabel(label);
        Font mainLabelFont = mainLabel.getFont();
        mainLabel.setFont(mainLabelFont.deriveFont(20f));
        mainLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        return mainLabel;
    }
    private JPanel createLabelSpinnerPanel(String label, double initialValue,double min, double max, double stepSize) {
        JPanel panel = new JPanel();
        JLabel labelText = new JLabel(label);
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(initialValue, min, max, stepSize));
        panel.add(labelText);
        panel.add(spinner);
        return panel;
    }
}