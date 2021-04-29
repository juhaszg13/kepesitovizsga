package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {
    private int hitPoints = 50;
    private int attack = 20;


    @Override
    int doDamage() {
        return attack;
    }

    @Override
    void sufferDamage(int demage) {
        hitPoints-=demage;
    }


    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttack() {
        return attack;
    }


}
