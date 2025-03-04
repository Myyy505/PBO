package week1;

public class Tugas2 {
    public static void main(String[] args) {
        // Persegi
        int sisi = 5;
        System.out.println("Persegi ");
        System.out.println("Luas Persegi: " + (sisi * sisi));
        System.out.println("Keliling Persegi: " + (4 * sisi));

        // Segitiga
        int alas = 6, tinggi = 8, a = 8, b = 6, c = 7;
        System.out.println("\nSegitiga ");
        System.out.println("Luas Segitiga: " + (alas * tinggi / 2 ));
        System.out.println("Keliling Segitiga: " + (a + b + c));

        // Lingkaran
        int r = 4;
        float phi = 3.14f;
        float luasLingkaran = phi * r * r;
        float kelilingLingkaran = 2 * phi * r;
        System.out.println("\nLingkaran ");
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        // Kubus
        int sisiKubus = 4;
        System.out.println("\nKubus ");
        System.out.println("Luas Permukaan Kubus: " + (6 * sisiKubus * sisiKubus));
        System.out.println("Keliling Kubus: " + (12 * sisiKubus));
    }
}
