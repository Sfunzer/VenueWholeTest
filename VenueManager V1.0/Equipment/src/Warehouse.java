import java.util.ArrayList;

public class Warehouse {
    final private ArrayList<Equipment> mainStorage;
    private ArrayList<Equipment> searchResults;
    private boolean check;

    public Warehouse() {
        mainStorage = new ArrayList<>();
        searchResults = new ArrayList<>();
        check = false;
    }

      public void addEquipment(Equipment newEquipment) {
        mainStorage.add(newEquipment);
    }

    public ArrayList<Equipment> getInventory() {
        return mainStorage;

        // zichtbaar maken van materialen met mogelijkheid tot zoeken.

    }

    public ArrayList<Equipment> searchInventory(String keyword) {

        searchResults.clear();
        for (Equipment toSearch: mainStorage) {
            if (toSearch.getEquipmentName().contains(keyword)) {
                searchResults.add(toSearch);
            }
        }   return searchResults;
    }

    public boolean deleteEquipment(int id) {

        for (int i = 0; i < mainStorage.size(); i++) {
            Equipment toCheck = mainStorage.get(i);

            if (toCheck.getEquipmentNumber() == id) {
                check = true;
                mainStorage.remove(i);
            }
        }    return check;}

}



