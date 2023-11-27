import java.awt.event.*;
import javax.swing.*;
public class MilesToKm extends JFrame implements ActionListener{
    JLabel mi, km;
    JTextArea a1, a2;
    JButton button;
    MilesToKm() {
        mi = new JLabel("Miles : ");
        km = new JLabel("Kilometers : ");
        mi.setBounds(20, 40, 60, 20);
        km.setBounds(20, 80, 90, 20);
        a1 = new JTextArea();
        a1.setBounds(100, 40, 60, 20);
        a2 = new JTextArea();
        a2.setBounds(100, 80, 60, 20);
        a2.setEditable(false);
        button = new JButton("Convert");
        button.setBounds(70, 120, 90, 30);
        add(mi);
        add(km);
        add(a1);
        add(a2);
        add(button);
        button.addActionListener(this);
        setSize(250, 200); 
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        Double miles = Double.parseDouble(a1.getText());
        Double kilometer = miles * 1.609;
        a2.setText(kilometer.toString());
    }
    public static void main(String[] args) {
        new MilesToKm();
    }
}
