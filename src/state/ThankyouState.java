package state;

import Context.AtmStateContext;
import interfaces.AtmState;

public class ThankyouState implements AtmState {
    public void handle(AtmStateContext context){
        System.out.println("Handling State ThankyouState");
        context.setState(new CardReaderState());  // Transition back to StateA
    }
}
