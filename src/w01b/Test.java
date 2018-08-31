package w01b;

import java.util.ArrayList;
import java.util.List;

public class Test {
    Test() {

        // Create each of the superheroes
        Aquaman aquaman = new Aquaman("Aquaman");
        Superman superman = new Superman("Superman");
        Batman batman = new Batman("Batman");
        Birdman birdman = new Birdman("Birdman");
        WonderWoman wonderWoman = new WonderWoman("Wonder Woman");

        // Get each of the superheroes to save the world
//        aquaman.saveTheWorld(); // Custom message overrides parent saveTheWorld() method
//        superman.saveTheWorld();
//        batman.saveTheWorld(); // Custom message overrides parent saveTheWorld() method
//        birdman.saveTheWorld();
//        wonderWoman.saveTheWorld();

        // Create a collection and populate it with all the superhero objects and iterate over the collection and call the saveTheWorld() method.
        List<Superhero> superHeroes = new ArrayList<Superhero>();

        superHeroes.add(aquaman);
        superHeroes.add(superman);
        superHeroes.add(batman);
        superHeroes.add(birdman);
        superHeroes.add(wonderWoman);

        // iterate via "for loop"
        for (int i = 0; i < superHeroes.size(); i++) {
            String message = superHeroes.get(i).saveTheWorld();
            System.out.println(message);
        }

    }
    public static void main(String[] args) {
        new Test();
    }

}
