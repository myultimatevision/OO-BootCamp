package parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void shouldParkTheCarWhenThereIsASpaceInParkingLot() throws SpaceNotAvailableException {
        ParkingLot parkingLot = new ParkingLot(10);

        parkingLot.park(1234);
        parkingLot.park(1235);

        assertEquals(2, parkingLot.park(1235));
    }

    @Test
    void shouldNotParkTheCarWhenThereIsNoSPace() throws SpaceNotAvailableException {
        ParkingLot parkingLot = new ParkingLot(2);

        parkingLot.park(1234);
        parkingLot.park(1235);

        assertThrows(SpaceNotAvailableException.class, () -> parkingLot.park(2345));
    }

    @Test
    void shouldGiveTrueWhenTheParkingLotIsFilled() throws SpaceNotAvailableException {
        ParkingLot parkingLot = new ParkingLot(2);

        parkingLot.park(1234);
        parkingLot.park(1235);

        assertTrue(parkingLot.isFilled());
    }

    @Test
    void shouldGiveFalseWhenTheParkingLotIsNotFilled() throws SpaceNotAvailableException {
        ParkingLot parkingLot = new ParkingLot(3);

        parkingLot.park(1234);
        parkingLot.park(1235);

        assertFalse(parkingLot.isFilled());
    }
}
