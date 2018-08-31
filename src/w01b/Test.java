package w01b;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private Test() {

        // Create each of the superheroes
        Aquaman aquaman = new Aquaman("Aquaman");
        Superman superman = new Superman("Superman");
        Batman batman = new Batman("Batman");
        Birdman birdman = new Birdman("Birdman");
        WonderWoman wonderWoman = new WonderWoman("Wonder Woman");

        // Create a collection and populate it with all the superhero objects and iterate over the collection and call the saveTheWorld() method.
        List<Superhero> superHeroes = new ArrayList<>();

        superHeroes.add(aquaman);
        superHeroes.add(superman);
        superHeroes.add(batman);
        superHeroes.add(birdman);
        superHeroes.add(wonderWoman);

        // iterate via "for loop"
        for (Superhero superHero : superHeroes) {
            // Get each superhero's saveTheWorld message and show it
            String message = superHero.saveTheWorld();
            System.out.println(message);
            // Show custom fly() message if implemented
            String fly = superHero.fly();
            if (fly != null) {
                System.out.println(fly);
            }
        }

    }
    public static void main(String[] args) {
        new Test();
    }

}
