import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {

    private JLabel Name;
    private JTextField textName;
    private JLabel DOB;
    private JTextField textDOB;
    private JButton btnOK;
    private JButton btnclear;
    private JLabel TPnum;
    private JTextField texttel;
    private JTextField textout;
    private JPanel FORM;

    Form() {
        add(FORM);
        setVisible(true);
        setTitle("Form");
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnOK.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textName.getText();
                String DOB = textDOB.getText();
                String Tel = texttel.getText();
                if (name.isEmpty() || DOB.isEmpty() || Tel.isEmpty()) {
                    textout.setText("Please fill the all fields");
                }
                textout.setText("Hi "+name+", Your DOB is "+DOB+", Your TP number is "+Tel);
            }
        });

        btnclear.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textName.setText("");
                textDOB.setText("");
                texttel.setText("");
                textout.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Form f = new Form();
    }
}


