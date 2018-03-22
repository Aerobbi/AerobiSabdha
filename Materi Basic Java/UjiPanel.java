 import java.awt.*;
 import javax.swing.*;

 public class UjiPanel extends JFrame {
 public UjiPanel() {
 // Menciptakan panel p1 untuk tombol dan menetapkan GridLayout
 JPanel p1 = new JPanel();
 p1.setLayout(new GridLayout(4, 3));

 // Menambahkan tombol kepada panel
 for (int i = 1; i <= 9; i++) {
 p1.add(new JButton("" + i));
 }

 p1.add(new JButton("" + 0));
 p1.add(new JButton("Mulai"));
 p1.add(new JButton("Berhenti"));

 // Menciptakan panel p2 untuk memuat suatu bidang teks dan p1
 JPanel p2 = new JPanel(new BorderLayout());
 p2.add(new JTextField("Waktu ditampilkan di sini"),
 BorderLayout.NORTH);
 p2.add(p1, BorderLayout.CENTER);

 // Menambahkan konten ke dalam frame
 add(p2, BorderLayout.EAST);
 add(new JButton("Makanan ditempatkan di sini"),
 BorderLayout.CENTER);
 }

 /** Metode utama */
 public static void main(String[] args) {
 UjiPanel frame = new UjiPanel();
 frame.setTitle("Tampak Depan Oven Microwave");
 frame.setSize(400, 250);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }