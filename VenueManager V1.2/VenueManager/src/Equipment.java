
public class Equipment {        //declaration of fields which we will use throughout this class.
    final private String equipmentName;
    final private int equipmentId;
    final private int equipmentAmount;
    //private double equipmentRentalPrice;
    final private double equipmentBuyPrice;
    final private String equipmentComment;

                                //Initialising the class fields with the help of the constructor parameters.
    public Equipment(String equipmentName, int equipmentId, int equipmentAmount, double equipmentBuyPrice, String equipmentComment) {
        this.equipmentName = equipmentName;
        this.equipmentId = equipmentId;
        this.equipmentAmount = equipmentAmount;
        //this.equipmentRentalPrice = equipmentRentalPrice;
        this.equipmentBuyPrice = equipmentBuyPrice;
        this.equipmentComment = equipmentComment;

    }
                                // The getter getEquipmentName is needed for our search method in the warehouse.
    public String getEquipmentName() {
        return equipmentName;
    }
                                // The getter getEquipmentId is needed for our deletion method in the warehouse.
    public int getEquipmentNumber() {
        return equipmentId;
    }

                                /* The toString method is overridden and used to return an overview string to
                                the warehouse, which then can be returned to the main class.
                                 */
    @Override
public String toString() {
    String equipmentSummary = "Name: " + equipmentName;
    equipmentSummary += "\nID: " + equipmentId;
    equipmentSummary += "\nAmount: " + equipmentAmount;
    //equipmentSummary += "\nRentalPrice per day: " + equipmentRentalPrice;
    equipmentSummary += "\nInfo: " + equipmentComment;
    equipmentSummary += "\n----------------------------\n\n";
    return  equipmentSummary;
}
}

/* To-do:
TODO: Create setter for equipmentAmount. 26-12: Do we need this if we bluid objects per piece?
TODO: Create method to calculate rentalPrice, which will eventually use the (yet to construct) class "Offer". 26-12: seperate class?
TODO: fix debugger comments
 */