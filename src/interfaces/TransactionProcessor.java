package interfaces;

public interface TransactionProcessor {
  void withdraw(double amount);
  void deposit(double amount);
  void info();
}
