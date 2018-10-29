package ru.alsem.headfirst.chapter1;

/**
 * @author a.semennikov
 */
public class FlyWithWings implements FlyBehavior {
	@Override public void fly() {
		System.out.println("I'm flying!");
	}
}
