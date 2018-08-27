package w01.superheroes;

public class Superhero {
    private String name;

    protected Superhero() {
    }

    public Superhero(String name) {
        this.name = name;
    }

    public void saveTheWorld() {
        if (name == "Aquaman") {
            System.out.print( name + " saves the world again! Atlantis rejoices!\n" );
        } else
            if (name == "Batman") {
            System.out.print( name + " saves the world again! Gotham City celebrates!\n" );
        } else if (name != "Aquaman" || name != "Batman") {
            System.out.print( name + " saves the world again!\n" );
        }
    }
}
