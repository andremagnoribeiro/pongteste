

import static org.junit.jupiter.api.Assertions.*;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;


import pong.game.Game;
import pong.states.GameState;

class testesPong11{

	@Test
	void teste1() throws InterruptedException, AWTException {
		//Criando instancia do jogo
		Game game = new Game();
		game.start();
		Thread.sleep(2000);
		//Criando robo para jogar
		Robot r = new Robot();
		
		//Navegando pelo menu
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
		//Verificando estado do jogo
		GameState gs = (GameState)game.getState();
		r.keyPress(KeyEvent.VK_END);
		Thread.sleep(10000);
		r.keyRelease(KeyEvent.VK_END);
		Thread.sleep(2000);
		
		
		//Caso de Teste 1 - Movimentando jogador A para cima
		double yPlayerA = gs.getPlayerA().getY();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_W);
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(2000);
		assertNotEquals(yPlayerA, gs.getPlayerA().getY());
		
		
		//Caso de Teste 2 - Movimentando jogador A para baixo
		yPlayerA = gs.getPlayerA().getY();
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_S);
		assertNotEquals(yPlayerA, gs.getPlayerA().getY());
		
		//Caso de Teste 3 -  Movimentando jogador B para baixo
		double yPlayerB = gs.getPlayerB().getY();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_DOWN);
		assertNotEquals(yPlayerB, gs.getPlayerB().getY());
		Thread.sleep(30000);
		
		//Caso de Teste 4 - Movimentando jogador B para cima
		yPlayerB = gs.getPlayerB().getY();
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_UP);
		assertNotEquals(yPlayerB, gs.getPlayerB().getY());
		
		//Caso de teste 5 - Voltando para o menu
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		assertEquals("pong.states.MenuState", game.getState().getClass().getName());
		
		
		//Caso de Teste 6- Testando navegabilidade para a tela Help
		Thread.sleep(8000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		assertEquals("pong.states.HelpState", game.getState().getClass().getName());



	}


}
