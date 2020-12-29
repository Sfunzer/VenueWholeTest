import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    void getInventory() {
        Warehouse testHouse = new Warehouse();
        Equipment testEquipment = new Equipment("Heritage", 10, 20, 20000, "a purple hero!");
        testHouse.addEquipment(testEquipment);

        ArrayList<Equipment> getTest = testHouse.getInventory();

        Equipment testReturn = getTest.get(0);
        assertEquals("Heritage", testReturn.getEquipmentName());
            }

    @Test
    void searchInventory() {
        Warehouse testHouse = new Warehouse();
        Equipment testEquipment = new Equipment("Heritage", 10, 20, 20000, "a purple hero!");
        testHouse.addEquipment(testEquipment);
        }


    @Test
    void deleteEquipment() {
        Warehouse testHouse = new Warehouse();
        Equipment testEquipment = new Equipment("Heritage", 10, 20, 20000, "a purple hero!");
        testHouse.addEquipment(testEquipment);

        assertFalse(testHouse.deleteEquipment(12));
    }
}