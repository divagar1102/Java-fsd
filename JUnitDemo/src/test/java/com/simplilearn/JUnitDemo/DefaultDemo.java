package com.simplilearn.JUnitDemo;

public interface DefaultDemo {
public void day();
public default void month() {
	System.out.println("It is July");
}
}
