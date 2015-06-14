package main;

import java.util.ArrayList;
import java.util.Random;

import main.Card;

public class StartController {

	public ArrayList<Card> getPeekTableaus() {
		
		ArrayList<Card> peekTableaus = new ArrayList<Card>();
		
		for(int i = 0; i<7 ; i++){
			Card card;
			Random random = new Random();
			card = new Card(random.nextInt(3), random.nextInt(12), true);
			peekTableaus.add(card);
		}
	
		return peekTableaus;
	}

}
