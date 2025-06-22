package interfaces;

public interface AccountStrategy {
   void processTransaction(TransactionCommand command);
}
