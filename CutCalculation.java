import javax.swing.*;

public class CutCalculation extends CutterAidFrame {
    public static void printCutCalculation (JSpinner initWidth, JSpinner initLength, JSpinner finalWidth,
                                            JSpinner finalLength, JSpinner upness, JSpinner midWidth,
                                            JSpinner midLength, JTextArea outputTextArea) {

        double iw = (double) initWidth.getValue();
        double il = (double) initLength.getValue();
        double fw = (double) finalWidth.getValue();
        double fl = (double) finalLength.getValue();
        double up = (double) upness.getValue();
        double mw = (double) midWidth.getValue();
        double ml = (double) midLength.getValue();
        boolean hasNoMid = (mw == 0 || ml == 0);

        if (hasNoMid) {
            if (iw == fl) {
                double c1 = il / 2;
                outputTextArea.append("1st cut: " + c1 + "\n");
            }
            else if (il == fl) {
                double c1 = iw / 2;
                outputTextArea.append("1st cut " + c1 + "\n");
            }
            else {
                double c1 = iw - (iw - fw) / 2;
                double c2 = il - (il - fl) / 2;
                double c3 = c1 - (iw - fw) / 2;
                double c4 = c2 - (il - fl) / 2;
                outputTextArea.append("1st cut: " + c1 + "\n" + "2nd cut: " + c2 + "\n" + "3rd cut: " + c3 + "\n" +
                                      "4th cut: " + c4 + "\n");
            }
        }
    }
}
