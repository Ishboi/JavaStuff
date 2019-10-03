package com.fabiolearnsjava;

import java.util.ArrayList;
import java.util.Collections;

public class League<L extends Sport> implements Comparable<L> {

    // Create a generic class to implement a league table for a sport.
    // The class should allow teams to be added to the list, and store
    // a list of teams that belong to the league.
    //
    // Your class should have a method to print out the teams in order,
    // with the team at the top of the league printed first.
    //
    // Only teams of the same type should be added to any particular
    // instance of the league class - the program should fail to compile
    // if an attempt is made to add an incompatible team.

    private String name;
    private ArrayList<Team<L>> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(Team<L> team, int rank) {
        if(teams.contains(team)) {
            System.out.println(team.getName() + " is already on this league.");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " is particiapting in this team " + this.name);
            return true;
        }
    }

    public int numTeams() {
        return this.teams.size();
    }

    public void showTeams() {
        Collections.sort(teams);
        for (Team<L> currentTeam : teams) {
            System.out.println("Team with - " + currentTeam.won + " matches won"
                    + " is " + currentTeam.getName());
        }
    }

    @Override
    public int compareTo(L o) {
        return 0;
    }

    //public int ranking()


}
