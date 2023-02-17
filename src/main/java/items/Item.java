package items;

public abstract class Item {

    protected String name;

    protected Slot slot;


    private int requiredLevel;

    public int getRequiredLevel() {
        return requiredLevel;
    }
    public void setRequiredLevel(int requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public Slot getSlot() {
        return slot;
    }
    public String getName() {
        return name;
    }
}
