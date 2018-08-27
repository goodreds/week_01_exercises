package w01.tutorials.superheroes;

public class Superhero {
    private String name;

    public Superhero(String name) {
        this.name = name;
        this.saveTheWorld();
    }

    public void saveTheWorld() {
        if (name == "Aquaman") {
            System.out.print( name + " saves the world again! Atlantis rejoices!\n" );
        } else if (name == "Batman") {
            System.out.print( name + " saves the world again! Gotham City celebrates!\n" );
        } else if (name != "Aquaman" || name != "Batman") {
            System.out.print( name + " saves the world again!\n" );
        }
    }
}
