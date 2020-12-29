
public class Equipment {

    final private String equipmentName;
    final private int equipmentId;
    private int equipmentAmount;
    private double equipmentRentalPrice;
    final private double equipmentBuyPrice;
    private String equipmentComment;


    public Equipment(String equipmentName, int equipmentId, int equipmentAmount, double equipmentBuyPrice, String equipmentComment) {
        this.equipmentName = equipmentName;
        this.equipmentId = equipmentId;
        this.equipmentAmount = equipmentAmount;
        //this.equipmentRentalPrice = equipmentRentalPrice;
        this.equipmentBuyPrice = equipmentBuyPrice;
        this.equipmentComment = equipmentComment;

    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public int getEquipmentNumber() {
        return equipmentId;
    }

    @Override
public String toString() {
    String equipmentSummary = "Name: " + equipmentName;
    equipmentSummary += "\nID: " + equipmentId;
    equipmentSummary += "\nAmount: " + equipmentAmount;
    equipmentSummary += "\nRentalPrice per day: " + equipmentRentalPrice;
    equipmentSummary += "\nInfo: " + equipmentComment;
    equipmentSummary += "\n----------------------------\n\n";
    return  equipmentSummary;
}
}

/* to-do:
setter voor amount.
methode voor het maken en aanpassen rentalprice met uiteindelijke link naar offer.

 */