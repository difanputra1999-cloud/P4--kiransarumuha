import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double makan, transport, belanja;
        double total;
        double pMakan, pTransport, pBelanja;

        // Input
        System.out.print("Masukkan biaya makan: ");
        makan = input.nextDouble();

        System.out.print("Masukkan biaya transport: ");
        transport = input.nextDouble();

        System.out.print("Masukkan biaya belanja: ");
        belanja = input.nextDouble();

        // Proses
        total = makan + transport + belanja;

        pMakan = makan / total * 100;
        pTransport = transport / total * 100;
        pBelanja = belanja / total * 100;

        // Output
        System.out.println("\nTotal Pengeluaran = " + total);

        System.out.println("Persentase Makan = " + pMakan + "%");
        System.out.println("Persentase Transport = " + pTransport + "%");
        System.out.println("Persentase Belanja = " + pBelanja + "%");
    }
}