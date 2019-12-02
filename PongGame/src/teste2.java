import static org.junit.jupiter.api.Assertions.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.jupiter.api.Test;

import pong.game.Game;

class teste2 {

	@Test
	void teste2() throws InterruptedException, AWTException {
		Game game = new Game();
		game.start();
		Thread.sleep(2000);
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);
		assertEquals("pong.states.GameState", game.getState().getClass().getName());
		
		
		
		
		
	}

}
