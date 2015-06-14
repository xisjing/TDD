package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import main.Card;
import main.StartController;

import org.junit.Before;
import org.junit.Test;

public class StartControllerTest {

	private StartController startController;
	
	@Before
	public void init(){
		startController = new StartController();
	}
	
	@Test
	public void getPeekTableausTest() {
		ArrayList<Card> peekTableaus = startController.getPeekTableaus();
		assertEquals(7, peekTableaus.size());
		for(Card card : peekTableaus){
			assertTrue(card.turnOn());
		}
			
	}
	
	@Test
	public void getDeckTest(){
		
		Stack<Card> deck = startController.getDeck();
		
		assertEquals(24, deck.size());
		for(Card card: deck){
			assertNotNull(card);
			assertFalse(card.turnOn());
		}
	}

}
