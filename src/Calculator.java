
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class calListner extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

public class Calculator implements ActionListener {

    Frame f1;
    Panel p1, p2;
    Color c1, c2, c3, c4, c5, c6;
    MenuItem mi1, mi2, mi3, mi4, mi5, mi6;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;
    TextField tf;
    String fv, sv, op;
    double fdv, sdv, tot;

    Calculator() {
        c1 = new Color(0, 174, 152);
        c2 = new Color(21, 21, 21);
        c3 = new Color(84, 81, 86);
        c4 = new Color(255, 255, 255);
        c5 = new Color(84, 81, 86);
        c6 = new Color(235, 129, 129);

        Font font1 = new Font("Times New Roman", Font.BOLD, 20);
        Font font2 = new Font("Times New Roman", Font.BOLD, 25);
        Font font3 = new Font("Times New Roman", Font.PLAIN, 15);
        Font font4 = new Font("Times New Roman", Font.PLAIN, 20);

        Cursor cr1 = new Cursor(Cursor.HAND_CURSOR);

        f1 = new Frame();
        f1.setBackground(c3);
        f1.setBounds(500, 200, 350, 400);
        f1.addWindowListener(new calListner());
        f1.setTitle("Chanaka Electronics Calculator");

        MenuBar mbar = new MenuBar();
        mbar.setFont(font3);
        Menu m1 = new Menu("View");
        Menu m2 = new Menu("Edit");
        Menu m3 = new Menu("Skin");

        m1.setFont(font3);
        m2.setFont(font3);
        m3.setFont(font3);

        mi1 = new MenuItem("Standard");
        mi2 = new MenuItem("Scientific");
        mi3 = new MenuItem("Copy");
        mi4 = new MenuItem("Light");
        mi5 = new MenuItem("Dark");
        mi6 = new MenuItem("New Window");

        mi1.setFont(font3);
        mi2.setFont(font3);
        mi3.setFont(font3);
        mi4.setFont(font3);
        mi5.setFont(font3);
        mi6.setFont(font3);

        m1.add(mi6);
        m1.add(mi1);
        m1.add(mi2);
        m2.add(mi3);
        m3.add(mi4);
        m3.add(mi5);

        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        f1.setMenuBar(mbar);

        p1 = new Panel();
        p2 = new Panel();
        GridLayout g1 = new GridLayout(5, 4, 4, 2);

        p2.setBackground(c3);

        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");

        b11 = new Button("=");
        b12 = new Button("+");
        b13 = new Button("-");
        b14 = new Button("X");
        b15 = new Button("/");
        b16 = new Button("AC");
        b17 = new Button(".");
        b18 = new Button("+/-");
        b19 = new Button("%");
        b20 = new Button("√");

        b0.setFont(font1);
        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);

        b11.setFont(font1);
        b12.setFont(font1);
        b13.setFont(font1);
        b14.setFont(font1);
        b15.setFont(font1);
        b16.setFont(font1);
        b17.setFont(font1);
        b18.setFont(font1);
        b19.setFont(font1);
        b20.setFont(font1);

        b0.setCursor(cr1);
        b1.setCursor(cr1);
        b2.setCursor(cr1);
        b3.setCursor(cr1);
        b4.setCursor(cr1);
        b5.setCursor(cr1);
        b6.setCursor(cr1);
        b7.setCursor(cr1);
        b8.setCursor(cr1);
        b9.setCursor(cr1);

        b11.setCursor(cr1);
        b12.setCursor(cr1);
        b13.setCursor(cr1);
        b14.setCursor(cr1);
        b15.setCursor(cr1);
        b16.setCursor(cr1);
        b17.setCursor(cr1);
        b18.setCursor(cr1);
        b19.setCursor(cr1);
        b20.setCursor(cr1);

        tf = new TextField(17);
        Font font5 = new Font("Courier New", Font.BOLD, 30);
        tf.setFont(font5);
        tf.setEditable(false);

        theme();

        p2.add(b16);
        p2.add(b19);
        p2.add(b20);
        p2.add(b15);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b14);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b13);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b12);
        p2.add(b18);
        p2.add(b0);
        p2.add(b17);
        p2.add(b11);

        p1.add(tf);

        p2.setLayout(g1);
        p2.setBackground(c3);

        f1.add(p1);
        f1.add(p2);

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);

        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);

        f1.setVisible(true);
    }

    public void theme() {
        f1.setBackground(c3);
        p2.setBackground(c3);

        b0.setBackground(c2);
        b1.setBackground(c2);
        b2.setBackground(c2);
        b3.setBackground(c2);
        b4.setBackground(c2);
        b5.setBackground(c2);
        b6.setBackground(c2);
        b7.setBackground(c2);
        b8.setBackground(c2);
        b9.setBackground(c2);

        b12.setBackground(c1);
        b13.setBackground(c1);
        b14.setBackground(c1);
        b15.setBackground(c1);
        b16.setBackground(c6);
        b17.setBackground(c1);
        b18.setBackground(c1);
        b19.setBackground(c1);
        b20.setBackground(c1);

        b11.setBackground(c1);

        b0.setForeground(c4);
        b1.setForeground(c4);
        b2.setForeground(c4);
        b3.setForeground(c4);
        b4.setForeground(c4);
        b5.setForeground(c4);
        b6.setForeground(c4);
        b7.setForeground(c4);
        b8.setForeground(c4);
        b9.setForeground(c4);

        tf.setBackground(c5);
        tf.setForeground(c4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(b0)) {
            tf.setText(tf.getText() + b0.getLabel());
        } else if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        } else if (o.equals(b3)) {
            tf.setText(tf.getText() + b3.getLabel());
        } else if (o.equals(b4)) {
            tf.setText(tf.getText() + b4.getLabel());
        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b17)) {
            tf.setText(tf.getText() + b17.getLabel());
        } else if (o.equals(b12)) {
            fv = tf.getText();
            tf.setText("");
            op = b12.getLabel();
        } else if (o.equals(b13)) {
            fv = tf.getText();
            tf.setText("");
            op = b13.getLabel();
        } else if (o.equals(b14)) {
            fv = tf.getText();
            tf.setText("");
            op = b14.getLabel();
        } else if (o.equals(b15)) {
            fv = tf.getText();
            tf.setText("");
            op = b15.getLabel();

        } else if (o.equals(b19)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Double.toString((fdv / 100)));

        } else if (o.equals(b11)) {
            sv = tf.getText();
            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");
            }

            if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");
            }

            if (op.equals("X")) {
                tot = fdv * sdv;
                tf.setText(tot + "");
            }

            if (op.equals("/")) {
                tot = fdv / sdv;
                tf.setText(tot + "");
            }

        } else if (o.equals(b16)) {
            tf.setText("");
            fv = "";
            sv = "";

        } else if (o.equals(b20)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Math.sqrt(fdv) + "");

        } else if (o.equals(b18)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            if (fdv > 0) {
                fv = "-" + fv;

            } else if (fdv < 0) {
                fdv = fdv * (-1);
                fv = Double.toString(fdv);
            }

            tf.setText(fv);

        } else if (o.equals(mi3)) {
            String copyText = tf.getText();
            StringSelection stSel = new StringSelection(copyText);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stSel, stSel);

        } else if (o.equals(mi4)) {
            c1 = new Color(77, 162, 213);
            c2 = new Color(237, 234, 241);
            c3 = new Color(255, 255, 255);
            c4 = new Color(0, 0, 0);
            c5 = new Color(234, 253, 253);
            c6 = new Color(235, 129, 129);
            theme();

        } else if (o.equals(mi5)) {
            c1 = new Color(0, 174, 152);
            c2 = new Color(21, 21, 21);
            c3 = new Color(84, 81, 86);
            c4 = new Color(255, 255, 255);
            c5 = new Color(84, 81, 86);
            c6 = new Color(235, 129, 129);
            theme();

        } else if (o.equals(mi6)) {
            new Calculator();
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

class CreateCal {

    public static void main(String[] args) {
        new Calculator();
    }
}
