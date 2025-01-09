package org.example;

public enum Weapon {
    SWORD,
    GUN,
    BOW;

    private int damage;
    private double attackSpeed;

   public int getDamage() {
       return damage;
   }

   public double getAttackSpeed() {
       return attackSpeed;
   }
}
