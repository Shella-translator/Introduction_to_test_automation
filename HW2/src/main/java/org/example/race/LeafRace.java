package org.example.race;

public class LeafRace implements Race {
    private String name;

    public LeafRace(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("Leaf Race: " + name);
    }

    @Override
    public Race findRace(String raceName) {
        // Листовые расы не могут содержать другие расы, поэтому возвращаем null
        return null;
    }

    @Override
    public String getName() {
        return name;
    }
}
