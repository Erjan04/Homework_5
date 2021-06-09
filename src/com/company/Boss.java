package com.company;

public class Boss {

    private int bosshealth;
    private int bossDamage;
    private int bossDefenceType;

    public int getBosshealth() {
        return bosshealth;
    }

    public int getBossDamage() {
        return bossDamage;
    }

    public void setBossDamage(int bossDamage) {
        this.bossDamage = bossDamage;
    }

    public int getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(int bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }

    public void setBosshealth(int bosshealth) {
        this.bosshealth = bosshealth;



    }
    public void bossChangeDefence(){
        System.out.println(bossDefenceType + 20);
    }
}
