package Context;

import interfaces.AccountStrategy;
import interfaces.AtmState;
import state.CardReaderState;

public class AtmStateContext {
    private AtmState state;
    public AtmStateContext() {
        // Initial state
        this.state = new CardReaderState();
    }

    public void setState(AtmState state) {
        this.state = state;
    }

    public void handleState() {
        state.handle(this);
    }
}