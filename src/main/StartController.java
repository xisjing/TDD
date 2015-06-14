package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;



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



	public Stack<Card> getDeck() {
		
		Stack<Card> deck= new Stack<Card>();
		
		for(int i = 0; i<24 ; i++){
			Card card;
			Random random = new Random();
			card = new Card(random.nextInt(3), random.nextInt(12), false);
			deck.push(card);
		}
		return deck;
	}
	

	public Stack<Card> getDiscovered() {
		
		return new Stack<Card>();
	}
	

	public ArrayList<Stack<Card>> getSuits() {
		
		ArrayList<Stack<Card>> suits = new ArrayList<Stack<Card>>();
		
		for(int i=0;i<4;i++){
			
			suits.add(new Stack<Card>());
		}
		
		return suits;
	}



	


}
