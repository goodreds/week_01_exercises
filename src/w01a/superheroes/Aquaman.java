package w01a.superheroes;

import w01a.test.SuperHeroInterface;

public class Aquaman extends SuperHero implements SuperHeroInterface {
	private String name;

	public Aquaman(String name) {
		super();
		this.name = name;
	}

	@Override
	public void saveTheWorld() {
        System.out.print( name + " saves the world again! Atlantis rejoices!\n" );
	}
}


