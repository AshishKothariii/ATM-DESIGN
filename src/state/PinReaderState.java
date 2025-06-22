package state;

import Context.AtmStateContext;
import interfaces.AtmState;

public class PinReaderState implements AtmState {
    public void handle(AtmStateContext context) {
        System.out.println("Handling State PinState");
        context.setState(new AccountSelectState());  // Transition back to StateA
    }
}
