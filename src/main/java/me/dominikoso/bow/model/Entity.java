package me.dominikoso.bow.model;

public class Entity {

    private String id;
    private Coordinates coordinates;
    private String owner;
    private Integer hp;
    private String name;
    private Integer rangeOfAttack;
    private Integer actionPoints;
    private Integer damage;
    private Integer cost;
    private Boolean entrench;
    //region Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRangeOfAttack() {
        return rangeOfAttack;
    }

    public void setRangeOfAttack(Integer rangeOfAttack) {
        this.rangeOfAttack = rangeOfAttack;
    }

    public Integer getActionPoints() {
        return actionPoints;
    }

    public void setActionPoints(Integer actionPoints) {
        this.actionPoints = actionPoints;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Boolean getEntrench() {
        return entrench;
    }

    public void setEntrench(Boolean entrench) {
        this.entrench = entrench;
    }
    //endregion
}
