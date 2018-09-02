package w01b.superheroes;

public class Birdman extends Superhero {
    public Birdman(String name) {
        super(name);
    }

    public String saveTheWorld() {
        return(super.saveTheWorld());
    }

    public String fly() {
        return ("Birdman is flying close to the sun.");
    }
}
