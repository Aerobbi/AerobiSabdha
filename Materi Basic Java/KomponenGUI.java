import javax.swing.*;

 public class KomponenGUI {
 public static void main(String[] args) {
 // Menciptakan suatu tombol dengan teks YA
 JButton jbtYA = new JButton("YA");

 // Menciptakan suatu tombol dengan teks Batal
 JButton jbtBatal = new JButton("Batal");

 // Meciptakan suatu label dengan teks "Masukkan nama Anda: "
 JLabel jlblNama = new JLabel("Masukkan nama Anda: ");

 // Menciptakan suatu bidang teks dengan teks "Ketik nama di sini"
 JTextField jtfNama = new JTextField("Ketik nama di sini");

 // Menciptakan suatu kotak periksa dengan teks Tebal
 JCheckBox jchkTebal = new JCheckBox("Tebal");

// Menciptakan suatu kotak periksa dengan teks Miring
 JCheckBox jchkMiring = new JCheckBox("Miring");

 // Menciptakan suatu kotak radio dengan teks Merah
 JRadioButton jrbMerah = new JRadioButton("Merah");

 // Menciptakan suatu kotak radio dengan teks Kuning
 JRadioButton jrbKuning = new JRadioButton("Kuning");

 // Menciptakan suatu kotak combo dengan beberapa pilihan
 JComboBox jcboWarna = new JComboBox(new String[]{"Sangat Pintar",
 "Pintar", "Cukup", "Kurang"});

 // Menciptakan suatu panel pada komponen-komponen
 JPanel panel = new JPanel();
 panel.add(jbtYA); // Menambah tomobol YA pada panel
 panel.add(jbtBatal); // Menambah tombol Batal pada panel
 panel.add(jlblNama); // Menambah label pada label
 panel.add(jtfNama); // Menambah bidang teks pada panel
 panel.add(jchkTebal); // Menambah kotak periksa pada panel
 panel.add(jchkMiring); // Menambah kotak periksa pada panel
 panel.add(jrbMerah); // Menambah kotak radio pada panel
 panel.add(jrbKuning); // Menambah kotak radio pada panel
 panel.add(jcboWarna); // Menambah kotak combo pada panel

 JFrame frame = new JFrame(); // Menciptakan suatu frame
 frame.add(panel); // Menambah panel pada frame
 frame.setTitle("Tampilkan Komponen GUI");
 frame.setSize(450, 100);
 frame.setLocation(200, 100);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
 }