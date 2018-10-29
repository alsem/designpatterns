package ru.alsem.headfirst.chapter1;

/**
 * @author a.semennikov
 */
public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override public void display() {
		System.out.println("I'm a real Mallard duck");	
	}
}
