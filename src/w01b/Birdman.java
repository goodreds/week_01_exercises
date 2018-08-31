package w01b;

public class Birdman extends Superhero {
    Birdman(String name) {
        super(name);
    }

    public String saveTheWorld() {
        return(super.saveTheWorld());
    }

    public String fly() {
        return ("Birdman is flying close to the sun.");
    }
}
