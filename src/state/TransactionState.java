package state;

import Context.AtmStateContext;
import interfaces.AtmState;

public class TransactionState implements AtmState {
    public void handle(AtmStateContext context){
        System.out.println("Handling State TransactionSelectState");
        context.setState(new InvalidState());  // Transition back to StateA
    }
}
