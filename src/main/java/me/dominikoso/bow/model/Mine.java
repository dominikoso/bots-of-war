package me.dominikoso.bow.model;

public class Mine {
    private Coordinates coordinates;
    private Integer goldLeft;
    private String id;
    private Integer miningPerWorker;
    private String owner;
    private Integer workersNumber;

    //region Getters and setters

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getGoldLeft() {
        return goldLeft;
    }

    public void setGoldLeft(Integer goldLeft) {
        this.goldLeft = goldLeft;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMiningPerWorker() {
        return miningPerWorker;
    }

    public void setMiningPerWorker(Integer miningPerWorker) {
        this.miningPerWorker = miningPerWorker;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getWorkersNumber() {
        return workersNumber;
    }

    public void setWorkersNumber(Integer workersNumber) {
        this.workersNumber = workersNumber;
    }

    //endregion
}
