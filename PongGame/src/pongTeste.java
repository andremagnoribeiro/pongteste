
import static org.junit.jupiter.api.Assertions.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;


import pong.game.Game;
import pong.states.GameState;

class PongTests {

	@Test
	void teste1() throws InterruptedException, AWTException {
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
		
		
		assertEquals("pong.states.GameState", game.getState().getClass().getName());
		
		Thread.sleep(2000);
		GameState gs = (GameState)game.getState();
		
		Thread.sleep(2000);
		
		
		//1 Caso de Teste
		double yPlayerA = gs.getPlayerA().getY();
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_W);
	
		Thread.sleep(2000);
		assertNotEquals(yPlayerA, gs.getPlayerA().getY());
		
		
		//2 Caso de Teste
		yPlayerA = gs.getPlayerA().getY();
		
		
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_S);
		
		assertNotEquals(yPlayerA, gs.getPlayerA().getY());
		
		//3 Caso de Teste
		
		double yPlayerB = gs.getPlayerA().getY();
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		assertNotEquals(yPlayerB, gs.getPlayerB().getY());
		
		//4 Caso de Uso
		
		yPlayerB = gs.getPlayerA().getY();
		
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_UP);
		
		assertNotEquals(yPlayerB, gs.getPlayerB().getY());
		
		//5 Caso de Teste
		
		
		r.keyPress(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(2000);
		
		assertEquals("pong.states.MenuState", game.getState().getClass().getName());
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(200);
		r.keyPress(KeyEvent.VK_ENTER);
	

	}


}