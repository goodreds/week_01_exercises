package w01b;

public class Superman extends Superhero {
    Superman(String name) {
        super(name);
    }

    public String saveTheWorld() {
        return(super.saveTheWorld());
    }

    public String fly() {
        return ("Superman is flying to the fortress of solitude.");
    }
}
