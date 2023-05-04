package com.gfa.exam.fishtank;

public class Main {
    public static void main(String[] args) {
        Clownfish clownFish = new Clownfish("Albert", "Blue", "Yellow");
        Tang tang = new Tang("Lucy", "Red", true);
        Kong kong = new Kong("BigDaddy", "Green");

        Aquarium aquarium = new Aquarium();
        aquarium.addFish(clownFish);
        aquarium.addFish(tang);
        aquarium.addFish(kong);

        System.out.println(clownFish.getStatus());
        System.out.println(tang.getStatus());
        System.out.println(kong.getStatus());

        System.out.println(aquarium.getStatus());
        aquarium.feed();
        aquarium.feed();
        aquarium.feed();
        aquarium.feed();
        System.out.println(aquarium.getStatus());
        aquarium.feed();
        aquarium.feed();
        aquarium.feed();
        System.out.println(aquarium.getStatus());
        aquarium.removeBigFish();
        System.out.println(aquarium.getStatus());
        aquarium.feed();
        aquarium.feed();
        aquarium.feed();
        System.out.println(aquarium.getStatus());
        aquarium.removeBigFish();
        System.out.println(aquarium.getStatus());
    }
}
