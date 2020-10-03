package parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParkingLotsTest {
    @Test
    void shouldParkTheCarInTheOneOfTheParkingLot() {
        ParkingLot parkingLot1 = new ParkingLot(10);
        ParkingLot parkingLot2 = new ParkingLot(10);
        ParkingLots parkingLots = new ParkingLots(new ParkingLot[]{parkingLot1,parkingLot2});

        assertEquals(ParkingStatus.NOT_FILLED,parkingLots.parkCar(1234));
    }
}
