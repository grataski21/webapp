package PetAdoptionForm;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

/**
 * Login Screen using JPanel to ask for name of the potential adoptee.
 * Only members of the class list array are allowed to access this form.
 * The default password for all adoptees is admin
 */
public class Login extends JFrame implements ActionListener {
    JPanel panel;
    JLabel user_label, password_label, message;
    JTextField Name_text;
    JPasswordField password_text;
    JButton submit, cancel;

    //Allowed Adoptees in a simple text array.

    public String classList[] = {"Grant", "Jenn", "Sydney", "Professor"};
    Login() {
        // Adoptee Name Label
        user_label = new JLabel();
        user_label.setText("Name :");
        Name_text = new JTextField();

        // Password Label
        password_label = new JLabel();
        password_label.setText("Password :");
        password_text = new JPasswordField();

        // Submit
        submit = new JButton("SUBMIT");
        cancel = new JButton("Cancel");

        //layout of the login form
        panel = new JPanel(new GridLayout(3, 1));
        panel.addNotify();
        panel.add(user_label);
        panel.add(Name_text);
        panel.add(password_label);
        panel.add(password_text);
        message = new JLabel();
        panel.add(message);
        panel.add(submit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding the listeners to components, setting JPanel window details.
        submit.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("Pet Adoption Form Log in");
        setSize(230,150);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
          }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String student = Name_text.getText();
        String password = password_text.getText();
        if (Arrays.asList(classList).contains(student.trim()) && password.trim().equals("admin")){
            PetAdoptionForm f = new PetAdoptionForm();
        }
        else {
            message.setText("Unknown Name");
        }
    }
}