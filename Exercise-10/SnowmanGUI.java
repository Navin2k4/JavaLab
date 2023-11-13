package com.mycompany.snowmangui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class SnowmanGUI extends JPanel {

    private int snowmanX = 50;
    private int snowmanY = 150;

    public SnowmanGUI() {
        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        leftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveSnowman(-10, 0);
            }
        });

        rightButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveSnowman(10, 0);
            }
        });

        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveSnowman(0, -10);
            }
        });

        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                moveSnowman(0, 10);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);
        buttonPanel.add(upButton);
        buttonPanel.add(downButton);

        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void moveSnowman(int deltaX, int deltaY) {
        snowmanX += deltaX;
        snowmanY += deltaY;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double body = new Ellipse2D.Double(snowmanX, snowmanY, 100, 100);
        g2d.setColor(Color.WHITE);
        g2d.fill(body);
        Ellipse2D.Double head = new Ellipse2D.Double(snowmanX + 25, snowmanY - 50, 50, 50);
        g2d.fill(head);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snowman GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new SnowmanGUI());
        frame.setVisible(true);
    }
}
