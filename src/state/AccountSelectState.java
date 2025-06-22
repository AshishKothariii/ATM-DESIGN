package state;

import Context.AtmStateContext;
import interfaces.AtmState;

public class AccountSelectState implements AtmState {
    public void handle(AtmStateContext context){
        System.out.println("Handling State AccountSelectState");
        context.setState(new TransactionState());  // Transition back to StateA
    }
}
