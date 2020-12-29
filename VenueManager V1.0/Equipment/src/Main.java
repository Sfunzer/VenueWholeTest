
public class Main {

    public static void main(String[] args) {
	// write your code here

        Warehouse effenaarWarehouse = new Warehouse(); //creation of a new Warehouse facility within the application.

        //adding some stuff to the warehouse.
        Equipment ssl200 = new Equipment("SSL L200", 1, 4,0,"36 faders)");
        effenaarWarehouse.addEquipment(ssl200);

        Equipment ssl100 = new Equipment("SSL L100", 2, 25, 0, "Svens Favorite");
        effenaarWarehouse.addEquipment(ssl100);

        Equipment avioUSB = new Equipment("Dante Avio USB", 3, 350, 95, "needs PoE");
        effenaarWarehouse.addEquipment(avioUSB);



        Equipment sb3224 = new Equipment("SSL SB32.24", 4, 9, 250000, "without LK37 System");
        effenaarWarehouse.addEquipment(sb3224);

        //first visual representation of our warehouse.
        for (Object show : effenaarWarehouse.getInventory()) {
            System.out.println(show.toString());
        }

        //using the searchfunction to find a specific brand or type of equipment.
        System.out.println("Now let's test our search function:\n");

        for (Object show : effenaarWarehouse.searchInventory("Avio")) {
            System.out.println(show.toString());
        }

        //deleting a piece of equipment from the warehouse.
        System.out.println("Now let's see what our list does, and delelete the L100:\n");
        System.out.println("Deletion is: " + effenaarWarehouse.deleteEquipment(2));

        for (Object show : effenaarWarehouse.getInventory()) {
            System.out.println(show.toString());
        }

    }
}
