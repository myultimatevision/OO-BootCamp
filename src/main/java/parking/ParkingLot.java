package parking;

public class ParkingLot {
    private final int[] spaces;
    private final Informer informer;
    private int nextFreeSpacePosition;

    public ParkingLot(int noOfSpaces) {
        this.nextFreeSpacePosition = 0;
        this.spaces = new int[noOfSpaces];
        informer = null;
    }

    public ParkingLot(int noOfSpaces, Informer informer) {
        this.nextFreeSpacePosition = 0;
        this.spaces = new int[noOfSpaces];
        this.informer = informer;
    }

    private boolean isFilled() {
        return this.nextFreeSpacePosition == this.spaces.length;
    }

    public ParkingLotStatus park(int carNumber) throws SpaceNotAvailableException {
        if (this.isFilled()) {
            throw new SpaceNotAvailableException("No Space is Available");
        }

        this.spaces[this.nextFreeSpacePosition] = carNumber;
        this.nextFreeSpacePosition++;

        if (this.isFilled()) {
            this.informer.inform(ParkingLotStatus.FILLED);
        }

        return this.isFilled() ? ParkingLotStatus.FILLED : ParkingLotStatus.NOT_FILLED;
    }
}
