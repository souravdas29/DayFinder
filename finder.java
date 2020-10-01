import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

class dayfinder extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button1 = new JButton("result");
    JButton button2 = new JButton("ok");
    JButton button3 = new JButton("ok");
    JButton button4 = new JButton("ok");
    JTextField textField = new JTextField(20);
    JTextField textField1 = new JTextField(20);
    JTextField textField2 = new JTextField(20);
    // int a=int.parseInt(textField.getText());
    JLabel label = new JLabel("enter the day");
    JLabel label1 = new JLabel("enter the month");
    JLabel label2 = new JLabel("enter the year");
    JLabel re = new JLabel();
    JLabel h = new JLabel("Day Finder");
    Font font = new Font("Gotham-Black", Font.PLAIN, 20);


    //ImageIcon img = new ImageIcon("C:\\Users\\SOURAV\\Desktop\\HY.png");
    //JLabel im = new JLabel("", img, JLabel.CENTER);


    public dayfinder() {
        frame.setTitle("Day Finder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.setSize(340, 450);
        frame.add(panel);

        //im.setSize(100, 100);


        panel.add(label, "\n");
        panel.add(textField);


        panel.add(label1, "\n");
        panel.add(textField1);

        panel.add(label2, "\n");
        panel.add(textField2);


        panel.add(button1);
        panel.add(re);
        panel.add(im);
        //ading action listner
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        //converting string to integer


    }

    public static void main(String args[]) {

        dayfinder fc = new dayfinder();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int i = 1;
        int k = Integer.parseInt(textField.getText());

        int m = Integer.parseInt(textField1.getText());
        int y = Integer.parseInt(textField2.getText());

        int weekday;
        if (k > 31) {
            i = 8;
            textField.setText("enter the right day");

        }
        if (m >= 13) {
            textField1.setText("enter the right month");

            i = 2;

            re.setVisible(false);
        }

        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (k <= 31) {

                textField.setText(Integer.toString(k));
            } else {
                textField.setText("enter the right day");
                i = 10;

            }
        } else if (m == 2 || m == 4 || m == 6 || m == 9 || m == 11) {
            if (k <= 30) {

                textField.setText(Integer.toString(k));
            } else {
                textField.setText("enter the right day");
                i = 10;
            }
        }


        Object source = e.getSource();
        if (source == button1) {


            int d, c, a, b, mo = 0, f;
            Scanner s = new Scanner(System.in);

            if (m == 1) {
                mo = 13;
                y--;
            } else if (m == 2) {
                mo = 14;
                y--;
            } else if (m == 3) {
                mo = 3;
            } else if (m == 4) {
                mo = 4;
            } else if (m == 5) {
                mo = 5;
            } else if (m == 6) {
                mo = 6;
            } else if (m == 7) {
                mo = 7;
            } else if (m == 8) {
                mo = 8;
            } else if (m == 9) {
                mo = 9;
            } else if (m == 10) {
                mo = 10;
            } else if (m == 11) {
                mo = 11;
            } else if (m == 12) {
                mo = 12;
            }

            int n = y;
            a = y % 10;
            y = y / 10;
            b = y % 10;
            d = b * 10 + a;

            n = n / 10;
            c = n / 10;


            f = (k + (13 * (mo + 1)) / 5 + d + (d / 4) + (c / 4) + 5 * c) % 7; // it will be moded  by 7

            switch (f) {
                case 0:
                    System.out.println(" saturday");
                    break;
                case 1:
                    System.out.println("sunday");
                    break;
                case 2:
                    System.out.println("monday");
                    break;
                case 3:
                    System.out.println("tuesday");
                    break;
                case 4:
                    System.out.println("wednessday");
                    break;
                case 5:
                    System.out.println("thrusday");
                    break;
                case 6:
                    System.out.println("friday");
                    break;


            }

        }

    }
}
