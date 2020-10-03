package parking;

public class SpaceNotAvailableException extends Exception {
    public SpaceNotAvailableException(String message) {
        super(message);
    }
}
