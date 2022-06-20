package day11.task2;

public abstract class Hero implements InterfacePhysAttack{
    int health;
    int physAtt;
    double physDef;
    double magicDef;
    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt*(1-hero.physDef);
        if (hero.health - attackScore < MIN_HEALTH){
            hero.health = MIN_HEALTH;
        }else {
            hero.health -= attackScore;
        }
    }
}
