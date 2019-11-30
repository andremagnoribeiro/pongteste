package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.junit.jupiter.api.Test;

import com.sun.glass.events.KeyEvent;

import pong.game.Game;
import pong.states.GameState;

class PongTests {

	@Test
	void TestsCases_Classes_Eq_Validas() throws InterruptedException {		
		try {
			Game game = new Game();
			game.start();
			
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
			
			assertEquals("pong.states.GameState", game.getState().getClass().getName());
			
			GameState gs = (GameState)game.getState();
			
			double yA = gs.getPlayerA().getY();
			
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_S);
			
			assertNotEquals(yA, gs.getPlayerA().getY());
			
			yA = gs.getPlayerA().getY();
			
			r.keyPress(KeyEvent.VK_W);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_W);
			
			assertNotEquals(yA, gs.getPlayerA().getY());
			
			double yB = gs.getPlayerA().getY();
			
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			assertNotEquals(yB, gs.getPlayerB().getY());
			
			yB = gs.getPlayerA().getY();
			
			r.keyPress(KeyEvent.VK_UP);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_UP);
			
			assertNotEquals(yB, gs.getPlayerB().getY());
			
			r.keyPress(KeyEvent.VK_ESCAPE);
			
			Thread.sleep(1000);
			
			assertEquals("pong.states.MenuState", game.getState().getClass().getName());
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
			
			assertEquals("pong.states.HelpState", game.getState().getClass().getName());
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyPress(KeyEvent.VK_UP);
			
			Thread.sleep(1000);
			
			assertEquals("pong.states.MenuState", game.getState().getClass().getName());			
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	void TestsCases_Classes_Eq_Invalidas() throws InterruptedException {		
		try {
			Game game = new Game();
			game.start();
			
			Robot r = new Robot();

			r.keyPress(KeyEvent.VK_W);
			r.keyRelease(KeyEvent.VK_W);

			Thread.sleep(1000);
			
			assertEquals("pong.states.MenuState", game.getState().getClass().getName());

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.mousePress(InputEvent.BUTTON1_DOWN_MASK);

			Thread.sleep(1000);
			
			assertEquals("pong.states.HelpState", game.getState().getClass().getName());
			
			r.keyPress(KeyEvent.VK_UP);
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			r.keyPress(KeyEvent.VK_ENTER);
			
			Thread.sleep(1000);
			
			GameState gs = (GameState)game.getState();
			
			double yA = gs.getPlayerA().getY();
			
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_A);
			
			assertEquals(yA, gs.getPlayerA().getY());
			
			yA = gs.getPlayerA().getY();
			
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			assertEquals(yA, gs.getPlayerA().getY());
			
			double yB = gs.getPlayerA().getY();
			
			r.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_RIGHT);
			
			assertEquals(yB, gs.getPlayerB().getY());
			
			yB = gs.getPlayerA().getY();
			
			r.keyPress(KeyEvent.VK_D);
			Thread.sleep(100);
			r.keyRelease(KeyEvent.VK_D);
			
			assertEquals(yB, gs.getPlayerB().getY());
			
			r.keyPress(KeyEvent.VK_SPACE);
			
			Thread.sleep(1000);
			
			assertEquals("pong.states.GameState", game.getState().getClass().getName());
			
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
