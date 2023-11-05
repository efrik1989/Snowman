import view.Snowman;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Snowman sm = new Snowman();
        jf.add(sm);
        jf.setSize(600, 600);
        jf.setVisible(true);
    }
}
