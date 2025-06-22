package state;

import Context.AtmStateContext;
import interfaces.AtmState;

public class CardReaderState implements AtmState {
    public void handle(AtmStateContext context) {
        System.out.println("Please Enter your 12 digit card number");

        context.setState(new PinReaderState());  // Transition to StateB
    }
}