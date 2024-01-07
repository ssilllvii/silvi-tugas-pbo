package TUBES_BANK;
public class akun_bank implements akun{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public akun_bank(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter and Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Interface methods
    public void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + getAccountNumber());
        System.out.println("Nama Pemilik: " + getAccountHolderName());
        System.out.println("Saldo: " + getBalance());
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Penarikan berhasil. Saldo sekarang: " + getBalance());
        } else {
            System.out.println("Jumlah penarikan tidak valid atau saldo tidak mencukupi.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Setor tunai berhasil. Saldo sekarang: " + getBalance());
        } else {
            System.out.println("Jumlah setor tunai tidak valid.");
        }
    }
}
