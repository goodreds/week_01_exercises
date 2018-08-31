package w01a.test;

import w01a.superheroes.*;

import java.util.ArrayList;
import java.util.List;

public class TestSuperheroes {
	 TestSuperheroes() {
	    // Create superheroes as separate classes
//		Aquaman aquaman = new Aquaman("Aquaman");
        Superman superman = new Superman("Superman");
//        Batman batman = new Batman("Batman");
//        Birdman birdman = new Birdman("Birdman");
//        WonderWoman wonderWoman = new WonderWoman("Wonder Woman");

        // Call saveTheWorld method (varies by class)
//		aquaman.saveTheWorld();
		superman.saveTheWorld();
//		batman.saveTheWorld();
//		birdman.saveTheWorld();
//		wonderWoman.saveTheWorld();

        List<Object> superHeroes = new ArrayList <Object>();

        // List superHeroes = new ArrayList();
        superHeroes.add(new Aquaman("aquaman"));

        superHeroes.add(superman);

//        superHeroes.add(batman);
//        superHeroes.add(birdman);
//        superHeroes.add(wonderWoman);

        // iterate via "for loop"
        for (int i = 0; i < superHeroes.size(); i++) {
            System.out.println(superHeroes.get(i).getClass().getName());
            System.out.println(superHeroes.get(i).getClass());
        }

//        Person person = (Person) obj;


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
