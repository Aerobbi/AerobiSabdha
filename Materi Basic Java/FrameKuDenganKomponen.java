 import javax.swing.*;

 public class FrameKuDenganKomponen {
 public static void main(String[] args) {
 JFrame frame = new JFrame("FrameKuDenganKomponen"); // Menciptakan suatu frame
 
 // Menambahkan suatu tombol dalam frame
 JButton jbtOK = new JButton("OK");
 frame.add(jbtOK);
 
 frame.setSize(400, 300); // Menetapkan ukutan frame
 frame.setLocationRelativeTo(null); // Pusat suatu frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true); // Menampilkan frame
 }
 }