 import javax.swing.JButton;
 import javax.swing.JFrame;
 import java.awt.BorderLayout;

 public class TampilBorderLayout extends JFrame{
 public TampilBorderLayout() {
 // Menetapkan BorderLayout dengan rentang horisontal 5 dan rentang vertikal 10
 setLayout(new BorderLayout(5, 10));

 // Menambahkan tommbol-tombol ke dalam frame
 add(new JButton("Timur"), BorderLayout.EAST);
 add(new JButton("Selatan"), BorderLayout.SOUTH);
 add(new JButton("Barat"), BorderLayout.WEST);
 add(new JButton("Utara"), BorderLayout.NORTH);
 add(new JButton("Tengah"), BorderLayout.CENTER);
 }

 /** Metode utama */
 public static void main(String[] args) {
 TampilBorderLayout frame = new TampilBorderLayout();
 frame.setTitle("TampilBorderLayout");
 frame.setSize(300, 200);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }