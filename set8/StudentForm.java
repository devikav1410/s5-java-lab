import java.awt.*;
import java.awt.event.*;

public class StudentForm extends Frame implements ActionListener {

    TextField name;
    Choice course;
    Button submit, clear;

    StudentForm() {

        setTitle("Student Registration");
        setSize(400, 300);
        setLayout(new FlowLayout());

        
        add(new Label("Name:"));
        name = new TextField(20);
        add(name);

        
        add(new Label("Course:"));
        course = new Choice();
        course.add("BSc Computer Science");
        course.add("BCA");
        course.add("BTech");
        add(course);

        submit = new Button("Submit");
        clear = new Button("Clear");

        add(submit);
        add(clear);

        submit.addActionListener(this);
        clear.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submit) {
            System.out.println("Name: " + name.getText());
            System.out.println("Course: " + course.getSelectedItem());
        }

        if (e.getSource() == clear) {
            name.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
