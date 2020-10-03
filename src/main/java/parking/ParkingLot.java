package parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int[] spaces;
    private final List<Informer> informers;
    private int nextFreeSpacePosition;

    public ParkingLot(int noOfSpaces) {
        this.nextFreeSpacePosition = 0;
        this.spaces = new int[noOfSpaces];
        informers = new ArrayList<>();
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
            for (Informer informer : this.informers) {
               informer.inform(ParkingLotStatus.FILLED);
            }
        }

        return this.isFilled() ? ParkingLotStatus.FILLED : ParkingLotStatus.NOT_FILLED;
    }

    public void addInformer(Informer informer) {
        this.informers.add(informer);
    }
}
