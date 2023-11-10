import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.event.*;

public class Backgroundchange extends JFrame implements ActionListener {
    
    JLabel l1;
    JTextArea area;
    JRadioButton b1,b2;
    Backgroundchange(){
        l1 = new JLabel("Enter the text here");
        l1.setBounds(100,100,100,100);
        area = new JTextArea(100,100);
        area.setBounds(200,200,200,200);
        b1 = new JRadioButton("Button1");
        b1.setBounds(200,400,50,50);
        b2 = new JRadioButton("Button2");
        b2.setBounds(200,400,50,50);
        add(l1);
        add(area);
        setLayout(null);
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){

    }
    
    public static void main(String[] args) {
        new Backgroundchange();
    }
}
