package w01.tutorials.superheroes;

public class Aquaman {
	private String name;
	
	public Aquaman(String name) {
		this.name = name;
	}
	
	public void saveTheWorld() {
	    if (name == "Aquaman") {
            System.out.print( name + " saves the world again! Atlantis rejoices!\n" );
        } else {
            System.out.print( name + " saves the world again!\n" );
        }

	}
}


