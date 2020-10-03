package parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
    @Test
    void shouldGiveParkingStatusNotFilledWhenThereIsMoreSpaceLeftInParkingLot() throws SpaceNotAvailableException {
        ParkingLot parkingLot = new ParkingLot(10);

        parkingLot.park(1234);
        parkingLot.park(1235);

        assertEquals(ParkingLotStatus.NOT_FILLED, parkingLot.park(1235));
    }

    @Test
    void shouldNotParkTheCarWhenThereIsNoSPace() throws SpaceNotAvailableException {
        ParkingLot parkingLot = new ParkingLot(2);

        parkingLot.park(1234);
        parkingLot.park(1235);

        assertThrows(SpaceNotAvailableException.class, () -> parkingLot.park(2345));
    }

    @Test
    void shouldGiveParkingStatusFilledWhenThereIsNoMoreSpaceLeftInParkingLot() throws SpaceNotAvailableException {
        ParkingLot parkingLot = new ParkingLot(2);

        parkingLot.park(1234);

        assertEquals(ParkingLotStatus.FILLED,parkingLot.park(1235));
    }

    @Test
    void shouldAddInformersAndInformWhenParkingLotIsFull() throws SpaceNotAvailableException {
        Informer informer1 = (parkingStatus) -> {
            assertEquals(ParkingLotStatus.FILLED, parkingStatus);
        };

        Informer informer2 = (parkingStatus) -> {
            assertEquals(ParkingLotStatus.FILLED, parkingStatus);
        };

        ParkingLot parkingLot = new ParkingLot(2);
        parkingLot.addInformer(informer1);
        parkingLot.addInformer(informer2);

        parkingLot.park(1234);
        parkingLot.park(1234);
    }
}
