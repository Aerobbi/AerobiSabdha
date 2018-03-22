 public class UjiEksepsi {
 public static void main(String[] args) {
 try {
 System.out.println(jum(new int[] {1, 2, 3, 4, 5}) );
 }
 catch (Exception ex) {
 ex.printStackTrace();
 System.out.println("\n" + ex.getMessage());
 System.out.println("\n" + ex.toString());

 System.out.println("\nInfo jejak tumpukan dari getStackTrace");
 StackTraceElement[] elemenJejak = ex.getStackTrace();
 for (int i = 0; i < elemenJejak.length; i++) {
 System.out.print("metode " + elemenJejak[i].getMethodName());
 System.out.print("(" + elemenJejak[i].getClassName() + ":");
 System.out.println(elemenJejak[i].getLineNumber() + ")");
 }
 }
 }

 private static int jum(int[] list) {
 int hasil = 0;
 for (int i = 0; i <= list.length; i++)
 hasil += list[i];
 return hasil;
 }
 }