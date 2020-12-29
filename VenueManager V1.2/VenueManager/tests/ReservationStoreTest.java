import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationStoreTest {

    @Test
    void addReservation() {
        ReservationStore testReservationStore = new ReservationStore();
        Reservation testReserver = new Reservation("Band1", "Uden", null, null, "2018-10-10T21:00:00", "2018-10-10-T22:00:00");

        boolean return1 = testReservationStore.addReservation(testReserver);


        assertFalse(return1);
    }
}