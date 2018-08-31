package w01a.superheroes;

public class Birdman extends SuperHero {
    private String name;

    public Birdman(String name) {
        this.name = name;
    }

    public void saveTheWorld() {
        System.out.print(name + " saves the world again!\n");
    }
}
