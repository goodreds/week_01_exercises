package w01b.test;

import w01b.superheroes.*;
import w01b.birds.*;

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

        // Create each of the birds
        Eagle eagle = new Eagle("Eddie");
        Emu emu = new Emu("Rod Hull & Emu");
        Parrot parrot = new Parrot("Polly");
        Penguin penguin = new Penguin("P-p-pick");


        // Create a collection and populate it with all the superhero objects and iterate over the collection and call the saveTheWorld() method.
        List<Superhero> superHeroes = new ArrayList<>();

        superHeroes.add(aquaman);
        superHeroes.add(superman);
        superHeroes.add(batman);
        superHeroes.add(birdman);
        superHeroes.add(wonderWoman);

        // iterate via "for loop"
        // Get each superhero's saveTheWorld message and show it
        // Show custom fly() message if implemented
        superHeroes.forEach(superHero -> {
            String message = superHero.saveTheWorld();
            System.out.println(message);
            String fly = superHero.fly();
            if (fly != null) {
                System.out.println(fly);
            }
        });

        List<Object> flyingThings = new ArrayList<>();

        flyingThings.add(superman);
        flyingThings.add(birdman);
        flyingThings.add(eagle);
        flyingThings.add(parrot);

        for (int i = 0; i < flyingThings.size(); i++) {
            String message = flyingThings.get(i).getClass().getName();
            System.out.println(message);
        }

    }
    public static void main(String[] args) {
        new Test();
    }

}
