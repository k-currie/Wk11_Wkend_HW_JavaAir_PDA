package Plane;

public enum PlaneType {

    BOEING747(25000, 366),
    AIRBUEA380(60000, 853);

    private final int weight;
    private final int capacity;

    PlaneType(int weight, int capacity){
        this.weight = weight;
        this.capacity = capacity;
    }

    //GETTERS//
    public int getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

}
