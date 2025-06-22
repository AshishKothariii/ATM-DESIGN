package interfaces;

public interface AtmStateManager {
    void setState(AtmState state);
    void handleState(AtmState state);
}
