package com.qa.Dice;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	int sides;

	public Dice(int sides) {
		this.sides = sides;
	}

	public int getSides() {
		return this.sides;
	}

	public void rollDice() {

		if (getSides() == 2) {
			System.out.println("It's a coin");
			int n = new Random().nextInt(2) + 1;
			if (n == 1)
				System.out.println("Head");
			if (n == 2)
				System.out.println("Tail");
		} else if (getSides() == 4) {
			System.out.println("It's a 4 sided cube");
			System.out.println("Rolled number::" +( new Random().nextInt(4) + 1));
		} else if (getSides() == 6) {
			System.out.println("It's a 6 sided cube");
			System.out.println("Rolled number::" + (new Random().nextInt(6) + 1));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleasse enter sides of cube");
		int n = sc.nextInt();
		sc.close();
		Dice dice = new Dice(n);
		dice.rollDice();
	}

}
