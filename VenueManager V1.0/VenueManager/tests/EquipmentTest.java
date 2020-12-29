import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquipmentTest {

    @Test
    void getEquipmentName() {
        Equipment testEquipment = new Equipment("Heritage", 10, 20, 20000, "a purple hero!");
        assertEquals("Heritage", testEquipment.getEquipmentName());
    }

    @Test
    void getEquipmentNumber() {
        Equipment testEquipment = new Equipment("Heritage", 11, 20, 20000, "a purple hero!");
        assertEquals(11, testEquipment.getEquipmentNumber());
    }
}