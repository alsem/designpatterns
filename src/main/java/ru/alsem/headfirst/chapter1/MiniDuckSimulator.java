package ru.alsem.headfirst.chapter1;

/**
 * @author a.semennikov
 */
public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performQuack();
		duck.performFly();
	}
}
