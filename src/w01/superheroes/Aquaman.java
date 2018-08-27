package w01.superheroes;

public class Aquaman extends Superhero {
	private String name;
	
	public Aquaman(String name) {
		this.name = name;
	}

	public void saveTheWorld() {
        System.out.print( name + " saves the world again! Atlantis rejoices!\n" );
	}
}


