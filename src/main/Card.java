package main;

import main.Card;

public class Card {

	private int suit;
	private int number;
	private boolean turnOn;

	public Card(int suit, int number, boolean turnOn) {
		this.suit = suit;
		this.number = number;
		this.turnOn = turnOn;
	}

	public boolean turnOn() {
		return turnOn;
	}


	public void overTurn() {
		this.turnOn = !this.turnOn;
	}
	
	@Override
	public boolean equals(Object object){
		assert object instanceof Card;
		Card card = (Card) object;
		return card.suit == suit && card.number == number;
		
	}

	
}
