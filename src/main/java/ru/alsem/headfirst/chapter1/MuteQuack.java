package ru.alsem.headfirst.chapter1;

/**
 * @author a.semennikov
 */
public class MuteQuack implements QuackBehavior {
	@Override public void quack() {
		System.out.println("<< Silence >>");
	}
}
