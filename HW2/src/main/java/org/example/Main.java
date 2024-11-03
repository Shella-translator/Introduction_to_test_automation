package org.example;

import org.example.race.CompositeRace;
import org.example.race.LeafRace;
import org.example.race.Race;

public class Main {
    public static void main(String[] args) {
        CompositeRace allRaces = new CompositeRace("All Races");

        // Добавляем все расы и подрасы...

        // Светлые люди
        CompositeRace lightHumans = new CompositeRace("Light Humans");
        lightHumans.addRace(new LeafRace("Edain"));
        lightHumans.addRace(new LeafRace("Dunedain: Arnorians"));
        lightHumans.addRace(new LeafRace("Dunedain: Gondorians"));
        lightHumans.addRace(new LeafRace("Northmen: Beornings"));
        lightHumans.addRace(new LeafRace("Northmen: Dorwinions"));
        lightHumans.addRace(new LeafRace("Northmen: Lake-folk"));
        lightHumans.addRace(new LeafRace("Northmen: Bardings"));
        lightHumans.addRace(new LeafRace("Northmen: Eothéod (Rohirrim)"));

        // Темные люди
        CompositeRace darkHumans = new CompositeRace("Dark Humans");
        darkHumans.addRace(new LeafRace("Dunedain: Black Numenoreans"));
        darkHumans.addRace(new LeafRace("Dunedain: Umbar Corsairs"));
        darkHumans.addRace(new LeafRace("Easterlings"));

        // Светлые эльфы
        CompositeRace lightElves = new CompositeRace("Light Elves");
        lightElves.addRace(new LeafRace("Vanyar"));
        lightElves.addRace(new LeafRace("Noldor"));
        lightElves.addRace(new LeafRace("Teleri"));

        // Темные эльфы
        CompositeRace darkElves = new CompositeRace("Dark Elves");
        darkElves.addRace(new LeafRace("Avari"));
        darkElves.addRace(new LeafRace("Sindar"));
        darkElves.addRace(new LeafRace("Nandor"));
        darkElves.addRace(new LeafRace("Orcs"));
        darkElves.addRace(new LeafRace("Goblins"));

        // Светлые гномы
        CompositeRace lightDwarves = new CompositeRace("Light Dwarves");
        lightDwarves.addRace(new LeafRace("Longbeards"));
        lightDwarves.addRace(new LeafRace("Firebeards"));
        lightDwarves.addRace(new LeafRace("Broadbeams"));
        lightDwarves.addRace(new LeafRace("Ironfists"));
        lightDwarves.addRace(new LeafRace("Stiffbeards"));
        lightDwarves.addRace(new LeafRace("Blacklocks"));
        lightDwarves.addRace(new LeafRace("Stonefoots"));

        // Темные гномы
        CompositeRace darkDwarves = new CompositeRace("Dark Dwarves");
        darkDwarves.addRace(new LeafRace("Dwarves of Khazad-dûm"));

        // Светлые хоббиты
        CompositeRace lightHobbits = new CompositeRace("Light Hobbits");
        lightHobbits.addRace(new LeafRace("Woodland Hobbits"));
        lightHobbits.addRace(new LeafRace("Hill Hobbits"));
        lightHobbits.addRace(new LeafRace("Fallowhides"));
        lightHobbits.addRace(new LeafRace("Harfoots"));

        // Темные хоббиты
        CompositeRace darkHobbits = new CompositeRace("Dark Hobbits");
        darkHobbits.addRace(new LeafRace("Fallen Hobbits"));

        // Темные нежити
        CompositeRace darkUndead = new CompositeRace("Dark Undead");
        darkUndead.addRace(new LeafRace("Vampires"));
        darkUndead.addRace(new LeafRace("Zombies"));
        darkUndead.addRace(new LeafRace("Ghosts"));
        darkUndead.addRace(new LeafRace("Skeletons"));

        // Светлые драконы
        CompositeRace lightDragons = new CompositeRace("Light Dragons");
        lightDragons.addRace(new LeafRace("Black Dragons"));
        lightDragons.addRace(new LeafRace("Golden Dragons"));
        lightDragons.addRace(new LeafRace("Red Dragons"));
        lightDragons.addRace(new LeafRace("Green Dragons"));
        lightDragons.addRace(new LeafRace("Blue Dragons"));

        // Темные драконы
        CompositeRace darkDragons = new CompositeRace("Dark Dragons");
        darkDragons.addRace(new LeafRace("Hydras"));
        darkDragons.addRace(new LeafRace("Sea Serpents"));
        darkDragons.addRace(new LeafRace("Wyrms"));

        // Темные великаны
        CompositeRace darkGiants = new CompositeRace("Dark Giants");
        darkGiants.addRace(new LeafRace("Ogres"));
        darkGiants.addRace(new LeafRace("Trolls: Stone Trolls"));
        darkGiants.addRace(new LeafRace("Trolls: Cave Trolls"));
        darkGiants.addRace(new LeafRace("Trolls: Hill Trolls"));
        darkGiants.addRace(new LeafRace("Trolls: Snow Trolls"));
        darkGiants.addRace(new LeafRace("Cyclopes"));

        // Светлые животные
        CompositeRace lightAnimals = new CompositeRace("Light Animals");
        lightAnimals.addRace(new LeafRace("Great Eagles (Manwë's Eagles)"));

        // Темные животные
        CompositeRace darkAnimals = new CompositeRace("Dark Animals");
        darkAnimals.addRace(new LeafRace("Giant Spiders (Ungoliant's Spawn)"));
        darkAnimals.addRace(new LeafRace("Morgoth's Spiders"));

        // Светлые энты
        CompositeRace lightEnts = new CompositeRace("Light Ents");
        lightEnts.addRace(new LeafRace("Ent Wives"));
        lightEnts.addRace(new LeafRace("Huorns"));

        // Добавляем все созданные расы в основной состав
        allRaces.addRace(lightHumans);
        allRaces.addRace(darkHumans);
        allRaces.addRace(lightElves);
        allRaces.addRace(darkElves);
        allRaces.addRace(lightDwarves);
        allRaces.addRace(darkDwarves);
        allRaces.addRace(lightHobbits);
        allRaces.addRace(darkHobbits);
        allRaces.addRace(darkUndead);
        allRaces.addRace(lightDragons);
        allRaces.addRace(darkDragons);
        allRaces.addRace(darkGiants);
        allRaces.addRace(lightAnimals);
        allRaces.addRace(darkAnimals);
        allRaces.addRace(lightEnts);

        // Отображаем информацию о расах
        allRaces.displayInfo();
    }
}
