package w01.test;

import w01.superheroes.*;

import java.util.ArrayList;
import java.util.List;

public class TestSuperheroes {
	public TestSuperheroes() {
		Aquaman aquaman = new Aquaman("Aquaman");
        aquaman.saveTheWorld();

        Superman superman = new Superman("Superman");
        superman.saveTheWorld();

        Batman batman = new Batman("Batman");
        batman.saveTheWorld();

        Birdman birdman = new Birdman("Birdman");
        birdman.saveTheWorld();

        WonderWoman wonderWoman = new WonderWoman("Wonder Woman");
        wonderWoman.saveTheWorld();

        List superHeroes = new ArrayList();
        superHeroes.add(aquaman);
        superHeroes.add(superman);
        superHeroes.add(batman);
        superHeroes.add(birdman);
        superHeroes.add(wonderWoman);

        // iterate via "for loop"
        System.out.println("==> For Loop Example.");
        for (int i = 0; i < superHeroes.size(); i++) {
            System.out.println(superHeroes.get(i).getClass().getName());
        }

//        List<String> superHeroes = new ArrayList<>();

//        List<Object> superHeroes = new ArrayList<Object>();
//        superHeroes.add(Aquaman);
//        superHeroes.add(Batman);




//        List<String> superHeroes = Arrays.asList(aquaman, batman, birdman, superman, wonderWoman);

//        System.out.println("Enter the superhero name: ");
//        Scanner scanner = new Scanner(System.in);
//        String superHeroName = scanner.nextLine();
//        Superhero superhero = new Superhero(superHeroName);
//        System.out.print(superHeroName + "\n");
//        superhero.saveTheWorld();

//        Superhero aquaman = new Superhero("Aquaman");
//        Superhero superman = new Superhero("Superman");
//        Superhero batman = new Superhero("Batman");
//        Superhero birdman = new Superhero("Birdman");
//        Superhero wonderWoman = new Superhero("Wonder Woman");
	}
	public static void main(String[] args) {
		new TestSuperheroes();
	}
}
