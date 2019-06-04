package view;

import model.Deck;

public class SingletonExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Deck deck = new Deck();
		deck.print();*/
		for (int i = 0; i < 10; i++) {
			Deck deck = new Deck();
			deck.print();
		}
	}

}
