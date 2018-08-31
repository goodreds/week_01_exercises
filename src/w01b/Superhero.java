package w01b;

public class Superhero {
    protected String name;

    Superhero(String name) {
        this.name = name;
    }
    public String saveTheWorld() {
        return (name + " saves the world again!");
    }
    public String fly() {
        return null;
    }
}
