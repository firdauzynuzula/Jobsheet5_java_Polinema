import java.util.Scanner;


public class NestedIf {

    public static void main(String[] args) {
        int diskon;
        Scanner input = new Scanner(System.in);
        System.err.println("=== Program Diskon ===");
        double harga = input.nextDouble();
        input.close();
        String kategori = "Silver";
        if (kategori == "Silver") {
            if (harga > 50000) {
                diskon = 5000;
            } else {
                diskon = 2000;
            }
        } else {
            if (harga > 50000) {
                diskon = 7000;
            } else {
                diskon = 3000;
            }
        }
        System.out.println("Diskon = " + diskon);


        int a = 1;
        int c = 34;
        if (10 > a && c!=4 && c<40) {
            System.out.println("Benar");
        }else {
            System.out.println("Salah");
        }
    }
}
