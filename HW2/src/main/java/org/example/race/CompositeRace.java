package org.example.race;

import java.util.ArrayList;
import java.util.List;

public class CompositeRace implements Race {
    private String name;
    private List<Race> races = new ArrayList<>();

    public CompositeRace(String name) {
        this.name = name;
    }

    public void addRace(Race race) {
        races.add(race);
    }

    @Override
    public void displayInfo() {
        System.out.println("Composite Race: " + name);
        for (Race race : races) {
            race.displayInfo();
        }
    }

    @Override
    public Race findRace(String raceName) {
        for (Race race : races) {
            if (race instanceof LeafRace && race.getName().equals(raceName)) {
                return race;
            } else if (race instanceof CompositeRace) {
                Race found = ((CompositeRace) race).findRace(raceName);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
