import java.util.ArrayList;

/* This class is build to store and work with the equipment object. See the equipment object itself for more info about
an equipment object.
 */

public class Warehouse {    //declaration of fields which we will use throughout this class.
    final private ArrayList<Equipment> mainStorage;
    final private ArrayList<Equipment> searchResults;

    private boolean check;

    public Warehouse() {    //In this constructor we initialize our fields. We dont have any external parameters here.
        mainStorage = new ArrayList<>();
        searchResults = new ArrayList<>();
        check = false;
    }
            // The AddEquipment method is used to create an Equipment object which is then stored in the mainStorage ArrayList of this object.
    public void addEquipment(Equipment newEquipment) {
        mainStorage.add(newEquipment);
            }

            // The getInventory method is used to return the mainStorage ArrayList. This makes it possible for the application to check the inventory.
    public ArrayList<Equipment> getInventory() {
        return mainStorage;
            }

            /*The searchInventory method is used to search within the inventory, and uses a keyword parameter to do so. The method returns the search results
            in a ArrayList specifically design for this purpose. */
    public ArrayList<Equipment> searchInventory(String keyword) {
        searchResults.clear();
        for (Equipment toSearch: mainStorage) {
            if (toSearch.getEquipmentName().contains(keyword)) {
                searchResults.add(toSearch);
            }
        }   return searchResults;
    }
            /* The deleteEquipment method deletes a specific piece of equipment from the ArrayList. To do so, the method user the ID parameter. By using
            an ID parameter, the chances of deleting the wrong object are significantly smaller. */
    public boolean deleteEquipment(int id) {
        for (int i = 0; i < mainStorage.size(); i++) {
            Equipment toCheck = mainStorage.get(i);
            if (toCheck.getEquipmentNumber() == id) {
                check = true;
                mainStorage.remove(i);
            }
        }    return check;}

}

/* To-do:
TODO: Check debugger comment
 */

