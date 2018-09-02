package w01b.birds;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    public String fly() {
        return ("The " + name + " is flying in all its glorified colour!");
    }
}
