package com.fabiolearnsjava;

import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable {

    private String monsterName;
    private int hitPoints, strength;

    public Monsters(String monsterName, int strength, int hitPoints) {
        this.monsterName = monsterName;
        this.strength = strength;
        this.hitPoints = hitPoints;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "monsterName='" + monsterName + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.monsterName);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> saved) {
        if(saved != null && saved.size() > 0) {
            this.monsterName = saved.get(0);
            this.hitPoints = Integer.parseInt(saved.get(1));
            this.strength = Integer.parseInt(saved.get(2));
        }
    }
}
