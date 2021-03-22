package ch7;

public class DeckTest {
	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);
		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
	}
}

class Deck {
	final int CARD_NUM = 52;
	Card c[] = new Card[CARD_NUM];
	
	Deck() {
		int cnt = 0;
		for(int i = Card.KIND_MAX; i > 0; i--) {
			for(int j = 1; j < Card.NUM_MAX + 1; j++) {
				c[cnt++] = new Card(i, j);
			}
		}
	}
	
	Card pick(int index) {
		if(0 <= index && index < CARD_NUM) {
			return c[index];
		}
		else {
			return pick();
		}
	}
	
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int num = (int) (Math.random() * CARD_NUM);
			Card temp = c[0];
			c[0] = c[num];
			c[num] = temp;
		}
	}
}

class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card() {
		this(SPADE, 1);
	}
	
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String kind = "";
		String number = "";
		
		switch (this.kind) {
		case 4:
			kind = "SPADE";
			break;
		case 3:
			kind = "DIAMOND";
			break;
		case 2:
			kind = "HEART";
			break;
		case 1:
			kind = "CLOVER";
			break;

		default:
			break;
		}
		
		switch (this.number) {
		case 13:
			number = "K";
			break;
		case 12:
			number = "Q";
			break;
		case 11:
			number = "J";
			break;

		default:
			number = this.number + "";
			break;
		}
		return "kind : " + kind + ", number : " + number;
	}
}






























