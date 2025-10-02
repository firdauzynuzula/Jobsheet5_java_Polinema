import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        System.out.println("Hotspot kampus");
        String pengguna = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan inputan berupa dosen atau mahasiswa: ");
        pengguna = sc.nextLine();
        
        if (pengguna.equals("dosen")) {
            System.out.println("Akses WiFi diberikan dosen");
        } else if (pengguna.equals("mahasiswa")) {
            int sks;
            System.out.print("Masukkan jumlah sks: ");
            sks = sc.nextInt();
            sc.close();
            
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan mahasiswa aktif");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        }
        else {
            System.out.println("Akses ditolak");
        }
    }
}
