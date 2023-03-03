import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook hi= new GradeBook(5);
	GradeBook hello = new GradeBook(5);
	@BeforeEach
	void setUp() throws Exception {
		
		hi.addScore(3);
		hello.addScore(2);
		hi.addScore(4);
		hello.addScore(5);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		hi = null;
		hello = null;
		
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		assertTrue(hi.toString().equals("3.0 4.0 "));
		assertTrue(hello.toString().equals("2.0 5.0 "));
	}

	@Test
	void testSum() {
		assertEquals(7.0,hi.sum());
		assertEquals(7.0,hello.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(3.0,hi.minimum());
		assertEquals(2.0,hello.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(4.0,hi.finalScore());
		assertEquals(5.0,hello.finalScore());
	}

}
