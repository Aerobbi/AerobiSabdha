 public class GunakanKelasBMI {
 public static void main(String[] args) {
 BMI bmi1 = new BMI("Krista Simanungkalit", 18, 145, 70);
 System.out.println("BMI untuk "+ bmi1.dapatNama() + " adalah "
 + bmi1.dapatBMI() + " "+ bmi1.dapatStatus());

 BMI bmi2 = new BMI("Tobat Sinaga", 215, 70);
 System.out.println("BMI untuk "+ bmi2.dapatNama() + " adalah "
 + bmi2.dapatBMI() + " "+ bmi2.dapatStatus());
 }
 }