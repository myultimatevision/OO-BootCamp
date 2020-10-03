package parking;

public class ParkingLot {
    private final int[] spaces;
    private int nextFreeSpacePosition;

    public ParkingLot(int noOFSpaces) {
        this.nextFreeSpacePosition = 0;
        this.spaces = new int[noOFSpaces];
    }

    public int park(int carNumber) throws SpaceNotAvailableException {
        if (nextFreeSpacePosition == spaces.length) {
            throw new SpaceNotAvailableException("No Space is Available");
        }

        this.spaces[nextFreeSpacePosition] = carNumber;

        return nextFreeSpacePosition++;
    }
}
