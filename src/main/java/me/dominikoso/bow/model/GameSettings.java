package me.dominikoso.bow.model;

public class GameSettings {
    private Entity archer;
    private Entity warrior;
    private Entity horse;
    private Entity worker;
    private Integer miningPerTurn;
    private Integer numberOfResources;

    //region Getters And Setters
    public Entity getArcher() {
        return archer;
    }

    public void setArcher(Entity archer) {
        this.archer = archer;
    }

    public Entity getWarrior() {
        return warrior;
    }

    public void setWarrior(Entity warrior) {
        this.warrior = warrior;
    }

    public Entity getHorse() {
        return horse;
    }

    public void setHorse(Entity horse) {
        this.horse = horse;
    }

    public Entity getWorker() {
        return worker;
    }

    public void setWorker(Entity worker) {
        this.worker = worker;
    }

    public Integer getMiningPerTurn() {
        return miningPerTurn;
    }

    public void setMiningPerTurn(Integer miningPerTurn) {
        this.miningPerTurn = miningPerTurn;
    }

    public Integer getNumberOfResources() {
        return numberOfResources;
    }

    public void setNumberOfResources(Integer numberOfResources) {
        this.numberOfResources = numberOfResources;
    }
    //endregion
}
