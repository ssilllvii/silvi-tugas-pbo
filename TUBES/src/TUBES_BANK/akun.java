package TUBES_BANK;
public interface akun {
    String getAccountNumber();      // 
    String getAccountHolderName();
    double getBalance();
    void displayAccountInfo();
    void withdraw(double amount);
    void deposit(double amount);
} 
