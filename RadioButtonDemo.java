import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {
    JRadioButton birdBtn, catBtn, dogBtn, rabbitBtn, pigBtn;
    JLabel imageLabel;
    ButtonGroup group;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create radio buttons
        birdBtn = new JRadioButton("Bird");
        catBtn = new JRadioButton("Cat");
        dogBtn = new JRadioButton("Dog");
        rabbitBtn = new JRadioButton("Rabbit");
        pigBtn = new JRadioButton("Pig");

        // Group radio buttons
        group = new ButtonGroup();
        group.add(birdBtn);
        group.add(catBtn);
        group.add(dogBtn);
        group.add(rabbitBtn);
        group.add(pigBtn);

        // Add action listeners
        birdBtn.addActionListener(this);
        catBtn.addActionListener(this);
        dogBtn.addActionListener(this);
        rabbitBtn.addActionListener(this);
        pigBtn.addActionListener(this);

        // Add radio buttons to frame
        add(birdBtn);
        add(catBtn);
        add(dogBtn);
        add(rabbitBtn);
        add(pigBtn);

        // Label to show the image
        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(250, 250)); 
        add(imageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pet = "";
        String imgPath = "";

        if (e.getSource() == birdBtn) {
            pet = "Bird";
            imgPath = "images/bird.png";
        } else if (e.getSource() == catBtn) {
            pet = "Cat";
            imgPath = "images/cat.png";
        } else if (e.getSource() == dogBtn) {
            pet = "Dog";
            imgPath = "images/dog.png";
        } else if (e.getSource() == rabbitBtn) {
            pet = "Rabbit";
            imgPath = "images/rabbit.png";
        } else if (e.getSource() == pigBtn) {
            pet = "Pig";
            imgPath = "images/pig.png";
        }

        // Load and scale the image
        ImageIcon icon = new ImageIcon(imgPath);
        Image scaledImage = icon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(scaledImage));

        // Show selected pet
        JOptionPane.showMessageDialog(this, "You selected: " + pet);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}
