import java.util.Scanner;
public class ifCetakKRS11 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("-----Cetak KRS Siakad-----");
    System.out.println("Apakah UKT sudah lunas? (True/False): ");
    boolean uktLunas = sc.nextBoolean();

    String Hasil = uktLunas ? "Pembayaran UKT terverifikasi \nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
    System.out.println(Hasil);
        sc.close();
    }
}
