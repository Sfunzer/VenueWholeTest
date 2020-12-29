import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationStoreTest {

    @Test
    void addReservation() {
        ReservationStore testReservationStore = new ReservationStore();
        boolean return1 = testReservationStore.addReservation("Band1", "Uden", null, null, "1980-03-10T21:00:00", "1980-03-10T22:00:00");
        boolean return2 = testReservationStore.addReservation("Band1", "Uden", null, null, "1980-03-10T21:00:00", "1980-03-10T22:00:00");

        assertFalse(return1);
        assertTrue(return2);
    }
}