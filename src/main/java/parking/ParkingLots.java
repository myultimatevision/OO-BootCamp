package parking;

public class ParkingLots {
    private final ParkingLot [] parkingLots;

    public ParkingLots(ParkingLot[] parkingLots) {
        this.parkingLots=parkingLots;
    }

    public ParkingStatus parkCar(int i) {
        return ParkingStatus.NOT_FILLED;
    }
}
