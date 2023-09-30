package org.example;

public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        int bonus = (int) service.calculate(2000,false);
        System.out.println(bonus);

    }
}