package parking;

public class ParkingLots {
    private final ParkingLot[] parkingLots;

    public ParkingLots(ParkingLot[] parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingLotStatus parkCar(int i) {
        return ParkingLotStatus.NOT_FILLED;
    }
}
