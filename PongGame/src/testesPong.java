
import static org.junit.jupiter.api.Assertions.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;


import pong.game.Game;
import pong.states.GameState;

class testesPong{

	@Test
	void teste1() throws InterruptedException, AWTException {
		Game game = new Game();
		game.start();
		Thread.sleep(2000);
		Robot r = new Robot();

		
		//  Caso de Teste
		r.keyPress(300);
		r.keyPress(300);
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		
		
		
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);		
		Thread.sleep(2000);
		GameState gs = (GameState)game.getState();
		
		
		r.keyPress(KeyEvent.VK_END);
		Thread.sleep(10000);
		r.keyRelease(KeyEvent.VK_END);
		
		
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
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		assertNotEquals(yPlayerB, gs.getPlayerB().getY());
		
		
		
		Thread.sleep(30000);
		
	
		
		//4 Caso de Uso
		
		yPlayerB = gs.getPlayerA().getY();
		
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_UP);
		
		assertNotEquals(yPlayerB, gs.getPlayerB().getY());
		
		// 5 Caso de Teste
		
		
		r.keyPress(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(2000);
		
		
		
		// 6 Caso de Teste
		
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		
		//assertEquals("pong.states.GameState", game.getState().getClass().getName());
		
		
		
		// 7 Caso de Teste
		r.keyPress(KeyEvent.VK_ESCAPE);
		
		
		Thread.sleep(8000);
		
		//assertEquals("pong.states.MenuState", game.getState().getClass().getName());
		
	
		
		
		Thread.sleep(8000);
		
		
		
		// 8 Caso de Teste
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(6000);
		
		
		//assertEquals("pong.states.HelpState", game.getState().getClass().getName());

		
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(6000);
		
	
		
		
		
		Thread.sleep(5000);
	

	}


}