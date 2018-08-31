package w01b;

public class Batman extends Superhero {
    Batman(String name) {
        super(name);
    }

    public String saveTheWorld() {
        return (name + " saves the world again! Gotham City celebrates");
    }
}
