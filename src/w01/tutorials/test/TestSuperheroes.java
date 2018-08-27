package w01.tutorials.test;

import w01.tutorials.superheroes.*;

import java.util.Scanner;

public class TestSuperheroes {

	public TestSuperheroes() {

//		Aquaman aquaman = new Aquaman("Aquaman");
//        aquaman.saveTheWorld();
//
//        Batman batman = new Batman("Batman");
//        batman.saveTheWorld();
//
//        Birdman birdman = new Birdman("Birdman");
//        birdman.saveTheWorld();
//
//        Superman superman = new Superman("Superman");
//        superman.saveTheWorld();
//
//        WonderWoman wonderWoman = new WonderWoman("Wonder Woman");
//        wonderWoman.saveTheWorld();

//        System.out.println("Enter the superhero name: ");
//        Scanner scanner = new Scanner(System.in);
//        String superHeroName = scanner.nextLine();
//        Superhero superhero = new Superhero(superHeroName);
//        System.out.print(superHeroName + "\n");
//        superhero.saveTheWorld();

        Superhero aquaman = new Superhero("Aquaman");
        Superhero superman = new Superhero("Superman");
        Superhero batman = new Superhero("Batman");
        Superhero birdman = new Superhero("Birdman");
        Superhero wonderWoman = new Superhero("Wonder Woman");
	}
	
	public static void main(String[] args) {
		new TestSuperheroes();
	}

}
