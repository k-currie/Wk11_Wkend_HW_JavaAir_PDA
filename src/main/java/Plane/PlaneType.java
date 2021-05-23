package Plane;

public enum PlaneType {

    BOEING747(800, 8),
    AIRBUEA380(1000, 10);

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
