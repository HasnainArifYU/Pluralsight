package pluralsight;

public abstract class Asset {

    protected String description;
    protected String dateAcquired;
    protected double originalCost;

    public Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public abstract double getValue();
}
