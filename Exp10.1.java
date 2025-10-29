package pkgs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration {

    public static void main(String[] args) {
        new RegisterFrame();
    }
}

class RegisterFrame extends JFrame implements ActionListener {
    JTextField nameField;
    JRadioButton maleBtn, femaleBtn;
    JCheckBox appleBox, samsungBox, redmiBox, oneplusBox;
    JComboBox<String> colorBox;
    JButton saveBtn;

    RegisterFrame() {
        setTitle("Register");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        // Name
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);
        nameField = new JTextField(15);
        gbc.gridx = 1;
        add(nameField, gbc);

        // Gender
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Gender:"), gbc);
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleBtn);
        genderGroup.add(femaleBtn);

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);
        gbc.gridx = 1;
        add(genderPanel, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Model:"), gbc);
        appleBox = new JCheckBox("Apple");
        samsungBox = new JCheckBox("Samsung");
        redmiBox = new JCheckBox("Redmi");
        oneplusBox = new JCheckBox("OnePlus");

        JPanel modelPanel = new JPanel();
        modelPanel.add(appleBox);
        modelPanel.add(samsungBox);
        modelPanel.add(redmiBox);
        modelPanel.add(oneplusBox);
        gbc.gridx = 1;
        add(modelPanel, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("Color:"), gbc);
        String[] colors = {"Black", "White", "Blue", "Red"};
        colorBox = new JComboBox<>(colors);
        gbc.gridx = 1;
        add(colorBox, gbc);

        // Save button
        saveBtn = new JButton("Save");
        saveBtn.addActionListener(this);
        gbc.gridx = 1; gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        add(saveBtn, gbc);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String gender = maleBtn.isSelected() ? "Male" : femaleBtn.isSelected() ? "Female" : "Not Selected";
        String models = "";
        if (appleBox.isSelected()) models += "Apple, ";
        if (samsungBox.isSelected()) models += "Samsung, ";
        if (redmiBox.isSelected()) models += "Redmi, ";
        if (oneplusBox.isSelected()) models += "OnePlus, ";
        if (models.endsWith(", ")) models = models.substring(0, models.length() - 2);
        String color = (String) colorBox.getSelectedItem();

        new DisplayFrame(name, gender, models, color);
    }
}

class DisplayFrame extends JFrame {
    DisplayFrame(String name, String gender, String models, String color) {
        setTitle("Display");
        setSize(350, 250);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Icon
        JLabel iconLabel = new JLabel();
        iconLabel.setIcon(UIManager.getIcon("OptionPane.informationIcon"));
        iconLabel.setHorizontalAlignment(JLabel.CENTER);

        // Text display
        JTextArea displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Serif", Font.PLAIN, 16));
        displayArea.setText("Name: " + name + "\nGender: " + gender +
                "\nModel: " + models + "\nColor: " + color);

        add(iconLabel, BorderLayout.NORTH);
        add(displayArea, BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}

