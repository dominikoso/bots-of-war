package me.dominikoso.bow.model;

import java.util.ArrayList;

public class Player {
    private Boolean active;
    private Base base;
    private Integer gold;
    private Integer id;
    private String owner;
    private Entity[] units;

    //region Getters and Setters

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Entity[] getUnits() {
        return units;
    }

    public void setUnits(Entity[] units) {
        this.units = units;
    }

    //endregion
}
