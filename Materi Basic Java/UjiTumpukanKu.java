public class UjiTumpukanKu {
  public static void main(String[] args) {
    TumpukanKu tumpukan = new TumpukanKu();

    for (int i = 0; i < 10; i++)
      tumpukan.dorong(i);

    while (!tumpukan.apaKosong())
      System.out.print(tumpukan.hapus() + " ");
  }
}
