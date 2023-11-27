import javax.swing.*;
import java.awt.event.*;

public class CourseRegistrationForm extends JFrame implements ActionListener {
    JLabel nameLabel, addressLabel, phoneLabel, genderLabel, departmentLabel, courseLabel;
    JTextField nameField, addressField, phoneField;
    JComboBox<String> genderBox, departmentBox, courseBox;
    JButton submitButton;
    String[] gender = {"Male", "Female"};
    String[] dept = {"CSE", "ECE", "EEE", "Mech", "Civil"};
    String[] course = {"C", "C++", "JAVA", "PYTHON"};

    public CourseRegistrationForm() {
        setTitle("Course Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 80, 20);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(120, 20, 200, 20);
        add(nameField);

        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 50, 80, 20);
        add(addressLabel);
        addressField = new JTextField();
        addressField.setBounds(120, 50, 200, 20);
        add(addressField);

        phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(20, 80, 80, 20);
        add(phoneLabel);
        phoneField = new JTextField();
        phoneField.setBounds(120, 80, 200, 20);
        add(phoneField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 110, 80, 20);
        add(genderLabel);
        genderBox = new JComboBox<>(gender);
        genderBox.setBounds(120, 110, 100, 20);
        add(genderBox);

        departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(20, 140, 80, 20);
        add(departmentLabel);
        departmentBox = new JComboBox<>(dept);
        departmentBox.setBounds(120, 140, 100, 20);
        add(departmentBox);

        courseLabel = new JLabel("Course:");
        courseLabel.setBounds(20, 170, 80, 20);
        add(courseLabel);
        courseBox = new JComboBox<>(course);
        courseBox.setBounds(120, 170, 100, 20);
        add(courseBox);

        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 210, 100, 30);
        add(submitButton);
        submitButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String selectedCourse = (String) courseBox.getSelectedItem();
        JOptionPane.showMessageDialog(this, name + ", you have successfully enrolled in " + selectedCourse);
    }

    public static void main(String[] args) {
        new CourseRegistrationForm();
    }
}
