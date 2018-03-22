 import javax.swing.JFrame;

 public class FrameKu {
 public static void main(String[] args) {
 JFrame frame = new JFrame("FrameKu"); // Menciptakan suatu frame
 frame.setSize(400, 300); // Menetapkan ukutan frame
 frame.setLocationRelativeTo(null); // Pusat suatu frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true); // Menampilkan frame
 }
 }