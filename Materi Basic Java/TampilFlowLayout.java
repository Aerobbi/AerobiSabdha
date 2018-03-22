 import javax.swing.JLabel;
 import javax.swing.JTextField;
 import javax.swing.JFrame;
 
  import java.awt.FlowLayout;

 public class TampilFlowLayout extends JFrame {
 public TampilFlowLayout() {
 // Menetapkan FlowLayout, disejajarkan ke kiri dengan rentang horisontal 10
 // dan rentang vertikal 20 antar komponen
 setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

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
 TampilFlowLayout frame = new TampilFlowLayout();
 frame.setTitle("TampilFlowLayout");
 frame.setSize(200, 200);
 frame.setLocationRelativeTo(null); // Pusat frame
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }