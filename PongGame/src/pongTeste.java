import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pong.elements.Player;
class pongTeste {

	@Test
	void test() {
		Player p = new Player(0,0,2);
		assertEquals(0, p.getScore());
		
		p.incScore();
		assertEquals(1, p.getScore());
		
	}
	@Test
	void test2() {
		Player p = new Player(0,0,2);
		assertEquals(0, p.y);
		
		p.move(500);
		assertEquals(0, p.y);
		
	}

}
