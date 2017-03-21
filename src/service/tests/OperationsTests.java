package service.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import service.Operations;

public class OperationsTests {

	@Test
	public void testAdd() {
		long resultat = Operations.add(10,20,30);
		Assert.assertEquals(resultat, 60);
		System.out.println("TEST ADD");
	}
	
	@Test
	public void testAdd2() {
		long resultat = Operations.add(100,20);
		Assert.assertEquals(resultat, 100+20);
	}
	
	@Test
	public void testAddNoParameter() {
		long resultat = Operations.add();
		Assert.assertEquals(resultat, 0);
	}

	@Test
	public void testMult() {
		long resultat = Operations.mult(10,20,30);
		Assert.assertEquals(resultat, 10*20*30);
	}

	@Test
	public void testMult2() {
		long resultat = Operations.mult(100,20);
		Assert.assertEquals(resultat, 100*20);
	}
	
	@Test
	public void testMultNoParameter() {
		long resultat = Operations.mult();
		Assert.assertEquals(resultat, 0);
	}
	
	@Test
	public void testMultParmaString() {
		long resultat = Operations.mult();
		Assert.assertEquals(resultat, 0);
	}
	
	@Before
	public void testBefore(){
		System.out.println(">> AVANT CHAQUE TEST");
	}
	
	@After
	public void testAfter(){
		System.out.println(">> APRES CHAQUE TEST");
	}
	
	@BeforeClass
	public static void testBeforeClass(){
		System.out.println("===========================================");
		System.out.println(">> AVANT CHAQUE SUITE DE TEST");
		System.out.println("===========================================");
		
	}
	
	@AfterClass
	public static void testAfterClass(){
		System.out.println("===========================================");
		System.out.println(">> APRES CHAQUE SUITE DE TEST");
		System.out.println("===========================================");
	}
}
