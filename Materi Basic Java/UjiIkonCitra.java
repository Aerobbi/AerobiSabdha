 import javax.swing.*;
 import java.awt.*;

 public class UjiIkonCitra extends JFrame {
 private ImageIcon ikonOpera = new ImageIcon("Gambar/opera.gif");
 private ImageIcon ikonFirefox = new ImageIcon("Gambar/firefox.gif");
 private ImageIcon ikonLogo = new ImageIcon("Gambar/Logo.gif");
 private ImageIcon ikonAlert = new ImageIcon("Gambar/alert.gif");

 public UjiIkonCitra() {
 setLayout(new GridLayout(1, 4, 5, 5));
 add(new JLabel(ikonOpera));
 add(new JLabel(ikonFirefox));
 add(new JButton(ikonLogo));
 add(new JButton(ikonAlert));
 }

 /** Metode utama */
 public static void main(String[] args) {
 UjiIkonCitra frame = new UjiIkonCitra();
 frame.setTitle("UjiIkonCitra");
 frame.setSize(200, 200);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }