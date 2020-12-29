import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserStoreTest {

    @Test
    void addUser() {
    UserStore testUserStore = new UserStore();
            boolean testbool = testUserStore.addUser("Mariah carrey", "alliwantforchristmas", "isyou");

            assertFalse(testbool);

    }
}