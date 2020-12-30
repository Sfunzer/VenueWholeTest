import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserStoreTest {

    @Test
    void addUser() {
    UserStore testUserStore = new UserStore();
    User testUser = new User("Mariah Carrey", "alliwantforchristmas");
    String pwTestString = "isyou";
            boolean testbool = testUserStore.addUser(testUser, pwTestString);

                    //testUserStore.addUser("Mariah carrey", "alliwantforchristmas", "isyou");

            assertFalse(testbool);

    }
}