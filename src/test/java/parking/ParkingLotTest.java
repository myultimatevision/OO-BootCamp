package parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParkingLotTest {
    @Test
    void shouldParkTheCarWhenThereIsASpaceInParkingLot() throws SpaceNotAvailableException {
        ParkingLot parkingLot = new ParkingLot(8);

        assertEquals(0, parkingLot.park(1234));
    }

    @Test
    void shouldNotParkTheCarWhenThereIsNoSPace() {
        ParkingLot parkingLot = new ParkingLot(0);

        assertThrows(SpaceNotAvailableException.class, () -> parkingLot.park(2345));
    }
}
