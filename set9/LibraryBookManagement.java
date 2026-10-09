import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class LibraryBookManagement extends JFrame implements ActionListener {
    JTextField idField, titleField, authorField;
    JComboBox<String> categoryBox;
    JTable table;
    DefaultTableModel model;
    JButton addBtn, deleteBtn, clearBtn;

    public LibraryBookManagement() {
        setTitle("Library Book Management");
        setSize(600, 400);
        setLayout(new BorderLayout());


        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));

        inputPanel.add(new JLabel("Book ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Title:"));
        titleField = new JTextField();
        inputPanel.add(titleField);

        inputPanel.add(new JLabel("Author:"));
        authorField = new JTextField();
        inputPanel.add(authorField);

        inputPanel.add(new JLabel("Category:"));
        categoryBox = new JComboBox<>(new String[]{"Fiction", "Non-Fiction", "Science", "History", "Technology"});
        inputPanel.add(categoryBox);


        addBtn = new JButton("Add");
        deleteBtn = new JButton("Delete");
        clearBtn = new JButton("Clear");
        inputPanel.add(addBtn);
        inputPanel.add(deleteBtn);
        inputPanel.add(clearBtn);

        add(inputPanel, BorderLayout.NORTH);

        String[] columns = {"Book ID", "Title", "Author", "Category"};
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        
        addBtn.addActionListener(this);
        deleteBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            String id = idField.getText();
            String title = titleField.getText();
            String author = authorField.getText();
            String category = (String) categoryBox.getSelectedItem();

            if (id.isEmpty() || title.isEmpty() || author.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            model.addRow(new Object[]{id, title, author, category});
            JOptionPane.showMessageDialog(this, "Book Added Successfully!");
        } else if (e.getSource() == deleteBtn) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "No row selected for deletion!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                model.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Book Deleted Successfully!");
            }
        } else if (e.getSource() == clearBtn) {
            idField.setText("");
            titleField.setText("");
            authorField.setText("");
            categoryBox.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        new LibraryBookManagement();
    }
}
