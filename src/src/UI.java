import javax.swing.*;

public class UI extends JFrame {
    JFrame frame =new JFrame("EX");
    JLabel disclaimer = new JLabel("This information will not be used for any unlawful activities");
    JLabel qn1 = new JLabel("Are you Employed ?");
    JRadioButton qn1Yes = new JRadioButton("Yes");
    JRadioButton qn1No = new JRadioButton("No");
    ButtonGroup  qn1Bg =new ButtonGroup();

    JLabel qn2 = new JLabel("Were do you work ?");
    JRadioButton qn2Op1 = new JRadioButton("Medic");
    JRadioButton qn2Op2 = new JRadioButton("Teacher");
    JRadioButton qn2Op3 = new JRadioButton("Farmer");
    JRadioButton qn2Op4 = new JRadioButton("Transit");
    JLabel qn3 = new JLabel("Are you a student ?");
    JLabel qn4 = new JLabel("Current leve of study?");
    JLabel qn5 = new JLabel("Current residence?");
    JLabel qn6 = new JLabel("Social media account(s)?");

}
