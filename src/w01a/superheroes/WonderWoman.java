package w01a.superheroes;

public class WonderWoman extends SuperHero {
    private String name;

    public WonderWoman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void saveTheWorld() {
        System.out.print(getName() + " saves the world again!\n");
    }
}
