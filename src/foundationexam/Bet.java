package com.gfa.exam;

import java.util.Random;

public class Bet {
    private int betId;
    private int amount;
    private Player player;
    private Contestant contestant;

    public Bet(int amount, Player player, Contestant contestant) {
        this.amount = amount;
        this.player = player;
        this.contestant = contestant;
        Random random = new Random();
        this.betId = random.nextInt(9999 - 1000 ) + 1000;
    }

    public int getBetId() {
        return betId;
    }

    public int getAmount() {
        return amount;
    }

    public Player getPlayer() {
        return player;
    }

    public Contestant getContestant() {
        return contestant;
    }
}
