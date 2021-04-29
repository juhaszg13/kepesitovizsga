package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit {
    private int hitPoints = 100;
    private int attack = 10;
    private boolean isShield=true;


    public Swordsman(boolean isShield) {
        this.isShield = isShield;
    }

    @Override
    int doDamage() {

        return attack;

    }

    @Override
    void sufferDamage(int demage) {
        if (shield) {
            asShield=false;
        }
        if(shield==false){

        }


    }


    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isShield() {
        return shield;
    }
}
