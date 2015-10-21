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
	public void testExplorerCommand_empty_is_00N() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,N)", explorer.executeCommand(""));
	}
	
	@Test
	public void testExplorerCommand_F_is_01N() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,1,N)", explorer.executeCommand("f"));
	}
	
	@Test
	public void testExplorerCommand_FF_is_02N() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,2,N)", explorer.executeCommand("ff"));
	}
	
	//turning tests
	//right
	@Test
	public void testExplorerCommand_R_is_00E() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,E)", explorer.executeCommand("r"));
	}	
	@Test
	public void testExplorerCommand_RR_is_00S() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,S)", explorer.executeCommand("rr"));
	}	
	@Test
	public void testExplorerCommand_RRR_is_00W() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,W)", explorer.executeCommand("rrr"));
	}	
	@Test
	public void testExplorerCommand_RRRR_is_00N() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,N)", explorer.executeCommand("rrrr"));
	}
	//left
	@Test
	public void testExplorerCommand_L_is_00W() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,W)", explorer.executeCommand("l"));
	}
	@Test
	public void testExplorerCommand_LL_is_00S() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,S)", explorer.executeCommand("ll"));
	}	
	@Test
	public void testExplorerCommand_LLL_is_00E() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,E)", explorer.executeCommand("lll"));
	}	
	@Test
	public void testExplorerCommand_LLLL_is_00N() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,N)", explorer.executeCommand("llll"));
	}
	
	@Test
	public void testExplorerCommand_FRF_is_11E() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(1,1,E)", explorer.executeCommand("frf"));
	}
	
	@Test
	public void testExplorerCommand_FFRF_is_12E() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(1,2,E)", explorer.executeCommand("ffrf"));
	}
	
	//tests for going over grid
	@Test
	public void testExplorerCommand_B_is_02N() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,2,N)", explorer.executeCommand("b"));
	}
	@Test
	public void testExplorerCommand_LF_is_20W() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(2,0,W)", explorer.executeCommand("lf"));
	}
	@Test
	public void testExplorerCommand_FFF_is_00N() {
		PlanetExplorer explorer = new PlanetExplorer(3,3,"");
		assertEquals("(0,0,N)", explorer.executeCommand("fff"));
	}
	
}
