package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {

	@Test
	public void testExplorerInit() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
	}
	
	@Test
	public void testExplorerCommand_F_is_01N() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(01N)", explorer.executeCommand("f"));
	}
	
}
