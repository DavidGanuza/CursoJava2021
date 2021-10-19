package es.com.inetum.elementos.modelo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import es.com.inetum.elementos.modelo.Piedra;
import es.com.inetum.elementos.modelo.ElementoFactory;
import es.com.inetum.elementos.modelo.Papel;
import es.com.inetum.elementos.modelo.Tijera;
import es.com.inetum.elementos.modelo.Lagarto;
import es.com.inetum.elementos.modelo.Spock;

public class ElementoFactoryTest {
	// Pruebas
	Piedra piedra;
	Papel papel;
	Tijera tijera;
	Lagarto lagarto;
	Spock spock;

	@Before
	public void setUp() throws Exception {
		// Antes de cada prueba inicializamos
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
		lagarto= new Lagarto();
		spock = new Spock();
	}

	@After
	public void tearDown() throws Exception {
		// Despues de cada prueba destruimos
		piedra = null;
		papel = null;
		tijera = null;
		lagarto = null;
		spock = null;
	}

	// PIEDRA
	@Test
	public void testCompararPiedraConTijera() {
		assertEquals (1, piedra.comparar(tijera));
		assertEquals ("Piedra gana a Tijera", piedra.getDescripcionResultado());
	}
	
	@Test
	public void testCompararPiedraConLagarto() {
		assertEquals (1, piedra.comparar(lagarto));
		assertEquals ("Piedra gana a Lagarto", piedra.getDescripcionResultado());
	}

	@Test
	public void testCompararPiedraConPapel() {
		assertEquals (-1, piedra.comparar(papel));
	}

	@Test
	public void testCompararPiedraConSpock() {
		assertEquals (-1, piedra.comparar(spock));
	}
	
	@Test
	public void testCompararPiedraConPiedra() {
		assertEquals (0, piedra.comparar(piedra));
	}

	// PAPEL
	@Test
	public void testCompararPapelConPiedra() {
		assertEquals (1, papel.comparar(piedra));
		assertEquals ("Papel gana a Piedra", papel.getDescripcionResultado());
	}
	
	@Test
	public void testCompararPapelConSpock() {
		assertEquals (1, papel.comparar(spock));
		assertEquals ("Papel gana a Spock", papel.getDescripcionResultado());
	}

	@Test
	public void testCompararPapelConTijera() {
		assertEquals (-1, papel.comparar(tijera));
	}

	@Test
	public void testCompararPapelConLagarto() {
		assertEquals (-1, papel.comparar(lagarto));
	}
	
	@Test
	public void testCompararPapelConPapel() {
		assertEquals (0, papel.comparar(papel));
	}

	// TIJERA
	@Test
	public void testCompararTijeraConPapel() {
		assertEquals (1, tijera.comparar(tijera));
		assertEquals ("Tijera gana a Papel", tijera.getDescripcionResultado());
	}
	
	@Test
	public void testCompararTijeraConLagarto() {
		assertEquals (1, tijera.comparar(lagarto));
		assertEquals ("Tijera gana a Lagarto", tijera.getDescripcionResultado());
	}

	@Test
	public void testCompararTijeraConPiedra() {
		assertEquals (-1, tijera.comparar(piedra));
	}

	@Test
	public void testCompararTijeraConSpock() {
		assertEquals (-1, tijera.comparar(spock));
	}
	
	@Test
	public void testCompararTijeraConTijera() {
		assertEquals (0, tijera.comparar(tijera));
	}

	// LAGARTO
	@Test
	public void testCompararLagartoConPapel() {
		assertEquals (1, lagarto.comparar(papel));
		assertEquals ("Lagarto gana a Papel", lagarto.getDescripcionResultado());
	}
	
	@Test
	public void testCompararLagartoConSpock() {
		assertEquals (1, lagarto.comparar(spock));
		assertEquals ("Lagarto gana a Spock", lagarto.getDescripcionResultado());
	}

	@Test
	public void testCompararLagartoConPiedra() {
		assertEquals (-1, lagarto.comparar(piedra));
	}

	@Test
	public void testCompararLagartoConTijera() {
		assertEquals (-1, lagarto.comparar(tijera));
	}
	
	@Test
	public void testCompararLagartoConLagarto() {
		assertEquals (0, lagarto.comparar(lagarto));
	}

	// SPOCK
	@Test
	public void testCompararSpockConTijera() {
		assertEquals (1, spock.comparar(tijera));
		assertEquals ("Spock gana a Tijera", spock.getDescripcionResultado());
	}
	
	@Test
	public void testCompararSpockConPiedra() {
		assertEquals (1, spock.comparar(piedra));
		assertEquals ("Spock gana a Piedra", spock.getDescripcionResultado());
	}

	@Test
	public void testCompararSpockConPapel() {
		assertEquals (-1, spock.comparar(papel));
	}

	@Test
	public void testCompararSpockConLagarto() {
		assertEquals (-1, spock.comparar(lagarto));
	}
	
	@Test
	public void testCompararSpockConSpock() {
		assertEquals (0, spock.comparar(spock));
	}
	
	
	
	
	
	// GETINSTANCE
	@Test
	public void testGetInstancePiedra() {
		assertTrue (ElementoFactory.getInstance(0) instanceof Piedra);
	}
	
	@Test
	public void testGetInstancePapel() {
		assertTrue (ElementoFactory.getInstance(1) instanceof Papel);
	}
	
	@Test
	public void testGetInstanceTijera() {
		assertTrue (ElementoFactory.getInstance(2) instanceof Tijera);
	}
	
	@Test
	public void testGetInstanceLagarto() {
		assertTrue (ElementoFactory.getInstance(3) instanceof Lagarto);
	}
	
	@Test
	public void testGetInstanceSpock() {
		assertTrue (ElementoFactory.getInstance(4) instanceof Spock);
	}
}
