import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

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
        setSize(350, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addMainPanel() {
        JPanel mainPanel = CreateComponents.createMainPanel();
        addPaperSize(mainPanel);
        addFinalSize(mainPanel);
        addUpness(mainPanel);
        addMidSpace(mainPanel);
        addSubmitButton(mainPanel);
        addTextArea(mainPanel);
        getContentPane().add(mainPanel);
    }

    private void addPaperSize(JPanel mainPanel) {
        JLabel firstLabel = CreateComponents.createMainLabel("Paper Size");
        mainPanel.add(firstLabel);
        mainPanel.add(Box.createVerticalStrut(1));

        JPanel firstLabelSpinnerPanel = CreateComponents.createLabelSpinnerPanel("Width:", 11,0, 26,1);
        JPanel secondLabelSpinnerPanel = CreateComponents.createLabelSpinnerPanel("Length:", 17, 0,26, 1);
        JPanel paperSizePanel = new JPanel();
        paperSizePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        paperSizePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        paperSizePanel.add(firstLabelSpinnerPanel);
        paperSizePanel.add(secondLabelSpinnerPanel);
        mainPanel.add(paperSizePanel);
    }

    private void addFinalSize (JPanel mainPanel) {
        JLabel secondLabel = CreateComponents.createMainLabel("Final Size");
        mainPanel.add(secondLabel);
        mainPanel.add(Box.createVerticalStrut(1));

        JPanel firstLabelSpinnerPanel = CreateComponents.createLabelSpinnerPanel("Width:", 0,0, 26,1);
        JPanel secondLabelSpinnerPanel = CreateComponents.createLabelSpinnerPanel("Length:", 0, 0,26, 1);
        JPanel paperSizePanel = new JPanel();
        paperSizePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        paperSizePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        paperSizePanel.add(firstLabelSpinnerPanel);
        paperSizePanel.add(secondLabelSpinnerPanel);
        mainPanel.add(paperSizePanel);
    }

    private void addUpness (JPanel mainPanel) {
        JLabel thirdLabel = CreateComponents.createMainLabel("Upness");
        mainPanel.add(thirdLabel);
        mainPanel.add(Box.createVerticalStrut(1));

        JPanel thirdLabelSpinnerPanel = CreateComponents.createLabelSpinnerPanel("Up:", 1, 0, 26,1);
        JPanel finalSizePanel = new JPanel();
        finalSizePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        finalSizePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        finalSizePanel.add(thirdLabelSpinnerPanel);
        mainPanel.add(finalSizePanel);
    }

    private void addMidSpace (JPanel mainPanel) {
        JLabel fourthLabel = CreateComponents.createMainLabel("Mid Space");
        mainPanel.add(fourthLabel);
        mainPanel.add(Box.createVerticalStrut(1));

        JPanel fourthLabelSpinnerPanel = CreateComponents.createLabelSpinnerPanel("Width:", 0,0, .75,.125);
        JPanel fifthLabelSpinnerPanel = CreateComponents.createLabelSpinnerPanel("Length:", 0, 0,.75, .125);
        JPanel midSpacePanel = new JPanel();
        midSpacePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        midSpacePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        midSpacePanel.add(fourthLabelSpinnerPanel);
        midSpacePanel.add(fifthLabelSpinnerPanel);
        mainPanel.add(midSpacePanel);
    }

    private void addSubmitButton (JPanel mainPanel) {
        JButton submitButton = CreateComponents.createButton("Submit");
        mainPanel.add(submitButton);
    }

    private void addTextArea (JPanel mainPanel) {
        JTextArea textArea = CreateComponents.createTextArea();
        mainPanel.add(Box.createVerticalStrut(15));
        mainPanel.add(textArea);
    }
}