package w01b.superheroes;

public class Superman extends Superhero {
    public Superman(String name) {
        super(name);
    }

    public String saveTheWorld() {
        return(super.saveTheWorld());
    }

    public String fly() {
        return ("Superman is flying to the fortress of solitude.");
    }
}
