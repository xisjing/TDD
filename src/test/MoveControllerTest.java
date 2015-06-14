package test;

import static org.junit.Assert.*;
import main.MoveController;
import main.StartController;

import org.junit.Before;
import org.junit.Test;

public class MoveControllerTest {
	
	private StartController startController;
	private MoveController moveController;
	
	@Before
	public void before() {
		startController = new StartController();
		moveController = new MoveController(startController.getDeck(),startController.getDiscovered());
	}

	@Test
	public void moveFromDecktoDiscoveredTest() {
		
		int cardsDeck = moveController.getDeckCards().size();
		int cardsDiscovered = moveController.getDiscoveredCards().size();
		moveController.moveFromDecktoDiscovered();
		
		if(cardsDeck>=3){
			assertTrue(moveController.getDeckCards().size() == cardsDeck-3);
			assertTrue(moveController.getDiscoveredCards().size() == cardsDiscovered+3);
		}else{
			assertTrue(moveController.getDeckCards().size() == 0);
			assertTrue(moveController.getDiscoveredCards().size() == cardsDeck+cardsDiscovered);
		}
		
		
		
	}

}
