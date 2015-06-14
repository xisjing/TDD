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
		
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
		deck.push(new Card(0,5,false));
			
		return deck;
	}





}
