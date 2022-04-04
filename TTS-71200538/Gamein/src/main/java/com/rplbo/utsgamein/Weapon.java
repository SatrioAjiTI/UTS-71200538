package com.rplbo.utsgamein;

public class Weapon {
    private String name;
    private int hitDamage;
    private int durability;
    private boolean isDisable = false;

    public Weapon(String name, int hitDamage, int durability){
        this.name = name;
        this.hitDamage = hitDamage;
        this.durability=durability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitDamage() {
        return hitDamage;
    }

    public void setHitDamage(int hitDamage) {
        this.hitDamage = hitDamage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public boolean getIsDisable() {
        return isDisable;
    }

    public void setIsDisable(boolean isDisable) {
        this.isDisable = isDisable;
    }
}
