package w01a.superheroes;

public class Batman extends SuperHero {
    private String name;

    public Batman(String name) {
        this.name = name;
    }

    public void saveTheWorld() {
        System.out.print( name + " saves the world again! Gotham City celebrates\n");
    }
}
