package state;

import Context.AtmStateContext;
import interfaces.AtmState;

public class InvalidState implements AtmState {
    public void handle(AtmStateContext context){
        System.out.println("Handling State InvalidState");
        context.setState(new CardReaderState());  // Transition back to StateA
    }
}
