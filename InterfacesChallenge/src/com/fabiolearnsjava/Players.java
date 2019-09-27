package com.fabiolearnsjava;

import java.util.ArrayList;
import java.util.List;

public class Players implements ISaveable {

    private String playerName, weapon;
    private int hitPoints, strength;

    public Players(String playerName, int hitPoints, int strength) {
        this.playerName = playerName;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Players{" +
                "playerName='" + playerName + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.playerName);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public void read(List<String> saved) {
        if(saved != null && saved.size() > 0) {
            this.playerName = saved.get(0);
            this.hitPoints = Integer.parseInt(saved.get(1));
            this.strength = Integer.parseInt(saved.get(2));
            this.weapon = saved.get(3);
        }
    }
}
