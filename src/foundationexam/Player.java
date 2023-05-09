package com.gfa.exam;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int account;
    private List<Bet> bets;

    public Player(String name, int account) {
        this.name = name;
        this.account = account;
        this.bets = new ArrayList<>();
    }
    public void makeBet(Contestant contestant, int amount) {
        Bet bet = new Bet(amount, Player.this, contestant);
        if (account >= amount) {
            bets.add(bet);
            account -= amount;
        }
    }
    public void addMoney(int amount) {
        if (amount > 0) {
            account += amount;
        }
    }

    public String getName() {
        return name;
    }

    public List<Bet> getBets() {
        return bets;
    }
}
