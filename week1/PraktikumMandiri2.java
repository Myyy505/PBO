package week1;

public class PraktikumMandiri2 {

   public static void main(String[] args) {
      float phi = 22f/7f; 

      
      int dlingkaran = 10;
      float kelilingLingkaran = phi * dlingkaran;
      System.out.println("Lingkaran");
      System.out.println("Phi       : " + phi);
      System.out.println("Diameter  : " + dlingkaran);
      System.out.println("Keliling (Phi * Diameter)  : " + kelilingLingkaran);
      System.out.println("\n");

      
      int alas = 6;
      int tinggiSegitiga = 8;
      float luasSegitiga = (1f / 2f) * alas * tinggiSegitiga;
      System.out.println("Segitiga");
      System.out.println("Alas      : " + alas);
      System.out.println("Tinggi    : " + tinggiSegitiga);
      System.out.println("Luas (1/2 * Alas * Tinggi)  : " + luasSegitiga);
      System.out.println("\n");

      int dTabung = 5;
      int tTabung = 10;
      float volumeTabung = (1f / 4f) * phi * dTabung * dTabung * tTabung;
      System.out.println("Tabung");
      System.out.println("Diameter  : " + dTabung);
      System.out.println("Tinggi    : " + tTabung);
      System.out.println("Volume (1/4 * Phi * D^2 * Tinggi)  : " + volumeTabung);
   }
}