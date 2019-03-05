package me.dominikoso.bow.model;

public class Base {
    private Coordinates coordinates;
    private Integer hp;
    private String id;
    private Entity newUnit;
    private String owner;

    //region Getters and Setters

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Entity getNewUnit() {
        return newUnit;
    }

    public void setNewUnit(Entity newUnit) {
        this.newUnit = newUnit;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //endregion
}
