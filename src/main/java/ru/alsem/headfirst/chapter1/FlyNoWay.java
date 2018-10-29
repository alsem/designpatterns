package ru.alsem.headfirst.chapter1;

/**
 * @author a.semennikov
 */
public class FlyNoWay implements FlyBehavior {
	@Override public void fly() {
		System.out.println("I can't fly");
	}
}
