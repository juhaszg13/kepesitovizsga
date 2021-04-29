package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit {
    private int hitPoints = 150;
    private int attack = 20;
    private int countDamage = 0;

    @Override
    int doDamage() {
        int count = 0;
        if (countDamage == 0) {
            countDamage++;
            return attack * 3;

        } else {
            return attack;
        }
    }

    @Override
    void sufferDamage(int demage) {
        hitPoints -= demage / 2;
    }


    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttack() {
        return attack;
    }

}
