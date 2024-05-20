package pluralsight;

public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String address, int condition, int squareFoot, int lotSize, String description, String dateAcquired, double originalCost) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double valuePerSquareFoot;
        switch (condition) {
            case 1:
                valuePerSquareFoot = 180.0;
                break;
            case 2:
                valuePerSquareFoot = 130.0;
                break;
            case 3:
                valuePerSquareFoot = 90.0;
                break;
            case 4:
            default:
                valuePerSquareFoot = 80.0;
                break;
        }
        return (valuePerSquareFoot * squareFoot) + (0.25 * lotSize);
    }
}
