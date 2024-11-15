package org.example;

public enum Weapon {

    SWORD(50, 1.2),
    AXE(80, 0.7),
    BOW(70, 1.1);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }
}
