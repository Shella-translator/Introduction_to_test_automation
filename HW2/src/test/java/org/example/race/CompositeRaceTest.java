package org.org.example.race;

import org.example.race.CompositeRace;
import org.example.race.LeafRace;
import org.example.race.Race;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompositeRaceTest {

    @Test
    void findRace_ShouldReturnNull_WhenRaceNotFound() {
        CompositeRace allRaces = new CompositeRace("All Races");
        assertNull(allRaces.findRace("Nonexistent Race"));
    }

    @Test
    void findRace_ShouldReturnRace_WhenRaceIsFound() {
        CompositeRace allRaces = new CompositeRace("All Races");
        CompositeRace lightHumans = new CompositeRace("Light Humans");
        allRaces.addRace(lightHumans);

        Race foundRace = allRaces.findRace("Light Humans");
        assertNotNull(foundRace);
        assertEquals(lightHumans, foundRace);
    }

    @Test
    void findRace_ShouldReturnLeafRace_WhenLeafRaceIsFound() {
        CompositeRace allRaces = new CompositeRace("All Races");
        CompositeRace lightHumans = new CompositeRace("Light Humans");
        LeafRace elf = new LeafRace("Elf");
        lightHumans.addRace(elf);
        allRaces.addRace(lightHumans);

        Race foundRace = allRaces.findRace("Elf");
        assertNotNull(foundRace);
        assertTrue(foundRace instanceof LeafRace);
        assertEquals(elf, foundRace);
    }

    @Test
    void findRace_ShouldReturnNull_WhenSearchingInEmptyCompositeRace() {
        CompositeRace emptyCompositeRace = new CompositeRace("Empty Composite Race");
        assertNull(emptyCompositeRace.findRace("Any Race"));
    }
}
