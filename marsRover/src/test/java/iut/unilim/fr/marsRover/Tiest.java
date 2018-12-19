package iut.unilim.fr.marsRover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

import org.junit.Test;

public class Tiest {
	private Planete mars;
	
	@Before
	public void setUp() {
		this.mars= new Planete(100,100);
	}

	@Test
	public void planeteAvecBonneLongueur() {
		int longueur = this.mars.getLongueur();
		assertEquals(100, longueur);
		
	}
	
	@Test
	public void planeteAvecBonneLarguer() {

		int largeur=this.mars.getLargeur();
		assertEquals(100, largeur);
	}
}
