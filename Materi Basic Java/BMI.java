 public class BMI {
 private String nama;
 private int usia;
 private double berat; // dalam pound
 private double tinggi; // dalam inci
 public static final double KILOGRAM_PER_POUND = 0.45359237;
 public static final double METER_PER_INCI = 0.0254;

 public BMI(String nama, int usia, double berat, double tinggi) {
 this.nama = nama;
 this.usia = usia;
 this.berat = berat;
 this.tinggi = tinggi;
 }

 public BMI(String nama, double berat, double tinggi) {
 this(nama, 20, berat, tinggi);
 }

 public double dapatBMI() {
 double bmi = berat * KILOGRAM_PER_POUND /
 ((tinggi * METER_PER_INCI) * (tinggi * METER_PER_INCI));
 return Math.round(bmi * 100) / 100.0;
 }

 public String dapatStatus() {
 double bmi = dapatBMI();
 if (bmi < 16)
 return "sangat kurus";
 else if (bmi < 18)
 return "kurus";
 else if (bmi < 24)
 return "normal";
 else if (bmi < 29)
 return "gemuk";
 else if (bmi < 35)
 return "sangat gemuk";
 else
 return "terlalu gemuk";
 }

 public String dapatNama() {
 return nama;
 }

 public int dapatUsia() {
 return usia;
 }

 public double dapatBerat() {
 return berat;
 }

 public double dapatTinggi() {
 return tinggi;
 }
  }