package main;

import java.util.ArrayList;

import main.Card;

public class StartController {

	public ArrayList<Card> getPeekTableaus() {
		
		ArrayList<Card> peekTableaus = new ArrayList<Card>();
		
		peekTableaus.add(new Card(0,5,true)); 
		peekTableaus.add(new Card(0,5,true)); 
		peekTableaus.add(new Card(0,5,true)); 
		peekTableaus.add(new Card(0,5,true)); 
		peekTableaus.add(new Card(0,5,true)); 
		peekTableaus.add(new Card(0,5,true));
		peekTableaus.add(new Card(0,5,true)); 
	
		return peekTableaus;
	}

}
