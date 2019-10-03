package com.fabiolearnsjava;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // ArrayList<Team> teams;
        // Collections.sort(teams);
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

        Team box = new Team("Hellbois");
        Team box2 = new Team("Heavenbois");
        Team box3 = new Team("Crapbois");

        Judo kickbox = new Judo("kickbox");
        Wrestling judo = new Wrestling("judo");


        League<Box> first = new League<>("First League");
        League<Kickbox> second = new League<>("Second League");
        League<Wrestling> third = new League<>("Third League");


        first.addTeam(box, 4);
        first.addTeam(box2, 3);
        first.addTeam(box3, 1);
         // doesn't work
        first.showTeams();




    }
}
