package com.company;

public class Main {

    public static void main(String[] args) {

    Hero artur = new Hero();
    artur.heroHealth = 250;
    artur.heroDamage = 30;
    artur.heroSuperPower = 100;
        System.out.println("Здоровья Артура:" + artur.heroHealth);
        System.out.println("Урон Артура:" + artur.heroDamage);
        System.out.println("Урон от суперспособности Артура:" + artur.heroSuperPower);

        Boss boss = new Boss();
        boss.setBosshealth(700);
        boss.setBossDamage(60);
        boss.setBossDefenceType(50);

        System.out.println("");

        System.out.println(("Здоровья Босса:" + boss.getBosshealth()));
        System.out.println(("Урон Босса:" + boss.getBossDamage()));
        System.out.println(("Защита Босса:" + boss.getBossDefenceType()));

        System.out.println("Тип защиты:");boss.bossChangeDefence();




    }
}
