import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ArithmeticCalculator extends JFrame implements ActionListener {
    JTextField num1Field, num2Field;
    JButton addBtn, subBtn, mulBtn, divBtn;

    public ArithmeticCalculator() {
        setTitle("Swing Application");
        setSize(350, 250);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;

        // Number 1
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Number 1"), gbc);
        num1Field = new JTextField(10);
        gbc.gridx = 1;
        add(num1Field, gbc);

        // Number 2
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Number 2"), gbc);
        num2Field = new JTextField(10);
        gbc.gridx = 1;
        add(num2Field, gbc);

        // Buttons panel
        JPanel btnPanel = new JPanel();
        addBtn = new JButton("ADD");
        subBtn = new JButton("SUBTRACT");
        mulBtn = new JButton("MULTIPLY");
        divBtn = new JButton("DIVIDE");

        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);

        btnPanel.add(addBtn);
        btnPanel.add(subBtn);
        btnPanel.add(mulBtn);
        btnPanel.add(divBtn);

        gbc.gridx = 1; gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnPanel, gbc);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            double result = 0;
            String operation = "";

            if (e.getSource() == addBtn) {
                result = n1 + n2;
                operation = "Addition";
            } else if (e.getSource() == subBtn) {
                result = n1 - n2;
                operation = "Subtraction";
            } else if (e.getSource() == mulBtn) {
                result = n1 * n2;
                operation = "Multiplication";
            } else if (e.getSource() == divBtn) {
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                result = n1 / n2;
                operation = "Division";
            }

            JOptionPane.showMessageDialog(this,
                    operation + ": " + result,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new ArithmeticCalculator();
    }
}
