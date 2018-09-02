package w01b.superheroes;

public class Batman extends Superhero {
    public Batman(String name) {
        super(name);
    }

    public String saveTheWorld() {
        return (name + " saves the world again! Gotham City celebrates");
    }
}
