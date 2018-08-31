package w01a.superheroes;

public class Superman extends SuperHero {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    public void saveTheWorld() {
        System.out.print(name + " saves the world again!\n");
    }
}
