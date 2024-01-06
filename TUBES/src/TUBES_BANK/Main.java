package TUBES_BANK;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        akun_bank akunBank = new Akun_Bank_Premium("11111111", "Silvi Nurcahyaningsih", 100000);

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tampilkan Info Akun");
            System.out.println("2. Tarik Saldo");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih fitur: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    akunBank.displayAccountInfo();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah penarikan: ");
                    double penarikan = scanner.nextDouble();
                    akunBank.withdraw(penarikan);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah setoran: ");
                    double setoran = scanner.nextDouble();
                    akunBank.deposit(setoran);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi kami.");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
