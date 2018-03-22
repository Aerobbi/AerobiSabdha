 import javax.swing.JLabel;
 import javax.swing.JTextField;
 import javax.swing.JFrame;
 import java.awt.GridLayout;

 public class TampilGridLayout extends JFrame {
 public TampilGridLayout() {
 // Menetapkan GridLayout, 3 baris, 2 kolom dengan rentang horisontal 5
 // dan rentang vertikal 5 antar komponen
 setLayout(new GridLayout(3,2,5,5));

 // Menambahkan label dan bidang teks ke dalam frame
 add(new JLabel("Nama Pertama"));
 add(new JTextField(8));
 add(new JLabel("Inisal Nama Tengah"));
 add(new JTextField(1));
 add(new JLabel("Nama Akhir"));
 add(new JTextField(8));
 }

 /** Metode main */
 public static void main(String[] args) {
 TampilGridLayout frame = new TampilGridLayout();
 frame.setTitle("TampilGridLayout");
 frame.setSize(200, 150);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }