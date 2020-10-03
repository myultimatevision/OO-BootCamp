package parking;

public class ParkingLot {
    private final int[] spaces;
    private int nextFreeSpacePosition;

    public ParkingLot(int noOfSpaces) {
        this.nextFreeSpacePosition = 0;
        this.spaces = new int[noOfSpaces];
    }

    public boolean isFilled() {
        return this.nextFreeSpacePosition == this.spaces.length;
    }

    public int park(int carNumber) throws SpaceNotAvailableException {
        if (this.isFilled()) {
            throw new SpaceNotAvailableException("No Space is Available");
        }

        this.spaces[this.nextFreeSpacePosition] = carNumber;
        return this.nextFreeSpacePosition++;
    }
}
