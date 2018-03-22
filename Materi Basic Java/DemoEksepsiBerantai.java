 public class DemoEksepsiBerantai {
 public static void main(String[] args) {
 try {
 metode1();
 }
 catch (Exception ex) {
 ex.printStackTrace();
 }
 }

 public static void metode1() throws Exception {
 try {
 metode2();
 }
 catch (Exception ex) {
 throw new Exception("Informasi baru dari metode1", ex);
 }
 }

 public static void metode2() throws Exception {
 throw new Exception("Informasi baru dari metode2");
 }
 }