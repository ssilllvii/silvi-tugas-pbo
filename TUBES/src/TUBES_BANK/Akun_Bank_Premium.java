package TUBES_BANK;
public class Akun_Bank_Premium extends akun_bank {
    public Akun_Bank_Premium(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        // Akun premium dapat melakukan penarikan bahkan jika saldo tidak mencukupi (sampai negatif)
        setBalance(getBalance() - amount);
        System.out.println("Penarikan berhasil. Saldo sekarang: " + getBalance());
    }

    @Override
    public void deposit(double amount) {
        // Akun premium dapat tambahan bonus 1% dari jumlah setoran
        double bonus = amount * 0.01;
        setBalance(getBalance() + amount + bonus);
        System.out.println("Setoran berhasil. Bonus 1% telah ditambahkan. Saldo sekarang: " + getBalance());
    }
}
