import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleStudentForm extends JFrame implements ActionListener {
    JTextField nameField, regField;
    JRadioButton male, female;
    JComboBox<String> courseBox;
    JCheckBox sports, music, reading;
    JButton submitBtn, clearBtn;
    JTextArea outputArea;
    ButtonGroup genderGroup;

    public SimpleStudentForm() {
        setTitle("Student Registration");
        setSize(400, 400);
        setLayout(new FlowLayout());


        add(new JLabel("Name:"));
        nameField = new JTextField(15);
        add(nameField);

        add(new JLabel("Register No:"));
        regField = new JTextField(15);
        add(regField);

        add(new JLabel("Gender:"));
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        add(male); add(female);

       
        add(new JLabel("Course:"));
        String[] courses = {"BSc CS", "BCom", "BA English", "BBA"};
        courseBox = new JComboBox<>(courses);
        add(courseBox);

        add(new JLabel("Hobbies:"));
        sports = new JCheckBox("Sports");
        music = new JCheckBox("Music");
        reading = new JCheckBox("Reading");
        add(sports); add(music); add(reading);

        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        add(submitBtn); add(clearBtn);
        submitBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitBtn) {
            String name = nameField.getText();
            String reg = regField.getText();
            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not Selected");
            String course = (String) courseBox.getSelectedItem();

            String hobbies = "";
            if (sports.isSelected()) hobbies += "Sports ";
            if (music.isSelected()) hobbies += "Music ";
            if (reading.isSelected()) hobbies += "Reading ";
            if (hobbies.isEmpty()) hobbies = "None";

            outputArea.setText("Name: " + name + "\nRegister No: " + reg +
                               "\nGender: " + gender + "\nCourse: " + course +
                               "\nHobbies: " + hobbies);
        } else if (e.getSource() == clearBtn) {
            nameField.setText("");
            regField.setText("");
            genderGroup.clearSelection();
            courseBox.setSelectedIndex(0);
            sports.setSelected(false);
            music.setSelected(false);
            reading.setSelected(false);
            outputArea.setText("");
        }
    }

    public static void main(String[] args) {
        new SimpleStudentForm();
    }
}
