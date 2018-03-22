import javax.swing.JOptionPane;
public class SentinelValueUsingConfirmationDialog {
	public static void main(String[] args) {
int option = JOptionPane.YES_OPTION;
while (option == JOptionPane.YES_OPTION) {
System.out.println("Loop Continue");
option = JOptionPane.showConfirmDialog(null, "Lanjut?");
}
	}
}