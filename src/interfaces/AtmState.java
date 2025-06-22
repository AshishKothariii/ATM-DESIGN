package interfaces;

import Context.AtmStateContext;

public interface AtmState {
    void handle(AtmStateContext context);
}