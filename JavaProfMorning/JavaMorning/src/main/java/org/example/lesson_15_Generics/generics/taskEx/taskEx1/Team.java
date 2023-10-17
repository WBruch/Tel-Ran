package org.example.lesson_15_Generics.generics.taskEx.taskEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();
    private static final Random RANDOM = new Random(); // private static final - CAPS

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T newParticipant) {
        participants.add(newParticipant);
        System.out.println("New participant was added to the team: " + name);
    }
    // obj.play(team)
    public void play(Team<T> team) {
        String winner;
        int r = RANDOM.nextInt(2);
        if (r == 0) {
            winner = this.name;
        } else {
            winner = team.name;
        }
        System.out.println("WINNER NAME: " + winner);
    }

}
