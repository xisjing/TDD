package main;

import java.util.Stack;


public class MoveController {
	
	private Stack<Card> cardsDeck;
	private Stack<Card> cardsDiscovered;
	
    public Stack<Card> getDeckCards() {
		
		return cardsDeck;
	}
    
    public Stack<Card> getDiscoveredCards(){
    	
    	return cardsDiscovered;
    }

	public MoveController(Stack<Card> deck, Stack<Card> discovered) {
		this.cardsDeck = deck;
		this.cardsDiscovered = discovered;
	}

	public void moveFromDecktoDiscovered() {
		
		if(cardsDeck.size() >= 3){
			for(int i = 0; i<3; i++){
				Card card = cardsDeck.pop();
				card.turnOver();
				cardsDiscovered.push(card);
			}
		}else{
			for(int i = 0; i<cardsDeck.size(); i++){
				Card card = cardsDeck.pop();
				card.turnOver();
				cardsDiscovered.push(card);
			}
	}

  }
}


