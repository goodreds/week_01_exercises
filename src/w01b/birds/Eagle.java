package w01b.birds;

public class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }

    public String fly() {
        return ("The " + name + " is soaring!");
    }
}
