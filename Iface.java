package com.hcl.features;
@FunctionalInterface
public interface Iface {
public abstract void print();
public default void message()
{
	System.out.println("Success");
}
public static void wish()
{
	System.out.println("Good morning");
}
}
