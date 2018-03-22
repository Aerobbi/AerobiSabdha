 import java.awt.*;
 import javax.swing.*;
 import javax.swing.border.*;

 public class TestFiturUmumSwing extends JFrame {
 public TestFiturUmumSwing() {
 // Menciptakan suatu panel untuk mengelompokkan tiga tombol
 JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
 JButton jbtLeft = new JButton("Kiri");
 JButton jbtCenter = new JButton("Tengah");
 JButton jbtRight = new JButton("Kanan");
 jbtLeft.setBackground(Color.WHITE);
 jbtCenter.setForeground(Color.GREEN);
 jbtRight.setToolTipText("Ini adalah Tombol Kanan");
 p1.add(jbtLeft);
 p1.add(jbtCenter);
 p1.add(jbtRight);
 p1.setBorder(new TitledBorder("Tiga Tombol"));
 // Menciptakan suatu font dan suatu tepi bergaris
 Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
 Border lineBorder = new LineBorder(Color.BLACK, 2);

 // Menciptakan suatu panel untuk mengelompokkan dua label
 JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
 JLabel jlblRed = new JLabel("Merah");
 JLabel jlblOrange = new JLabel("Oranye");
 jlblRed.setForeground(Color.RED);
 jlblOrange.setForeground(Color.ORANGE);
 jlblRed.setFont(largeFont);
 jlblOrange.setFont(largeFont);
 jlblRed.setBorder(lineBorder);
 jlblOrange.setBorder(lineBorder);
 p2.add(jlblRed);
 p2.add(jlblOrange);
 p2.setBorder(new TitledBorder("Dua Label"));

 // Menambahkan dua panel ke dalam frame
 setLayout(new GridLayout(2, 1, 5, 5));
 add(p1);
 add(p2);
 }

 public static void main(String[] args) {
 // Menciptakan suatu frame dan menetapkan propertinya
 JFrame frame = new TestFiturUmumSwing();
 frame.setTitle("TestFiturUmumSwing");
  frame.setSize(300, 150);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }

