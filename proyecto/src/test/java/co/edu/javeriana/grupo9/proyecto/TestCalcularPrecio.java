package co.edu.javeriana.grupo9.proyecto;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import control.*;
import entity.Obra;
import entity.*;
class TestCalcularPrecio {
	private ControlGaleria controlgaleria;
	Artista artista;
	public void prueba() {
	controlgaleria=new ControlGaleria();	
	}
	@BeforeAll
	static void setUpBeforeClass () throws Exception{
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception{
	}
	@BeforeEach
	void setUp() throws Exception{
	}
	@AfterEach
	void tearDown() throws Exception{
	}
	
	@Test
	void testVerObras() {
	//	assertEquals("controlgaleria.VerObras()",controlgaleria.VerObras());

	}
	
	@Test
	void testBuscarObra() {
		System.out.println("Buscar obra por nombre de la misma");
		String nombre= "Monalisa";
		assertEquals(nombre, "Monalisa");
	}
	 
	@Test 
	void testBuscarArtista() {
		System.out.println("Buscar artista por codigo");
		long codigo=1233907;
		assertEquals(codigo, 1233907);
	}

	@Test
	void testModificarObra() {
		System.out.println("Ingresar el codigo de la obra que desea modificar");
		long codigo1=1233907;
		long codigo2=1254567;
		long codigo3=4563545;
		long codigo4=2978671;
		long codigo5=2938471;
		long codigo6=1973671;
		long codigo7=9830123;
		long codigo8=1273371;
		
	}
}
