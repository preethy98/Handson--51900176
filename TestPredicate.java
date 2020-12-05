package com.hcl.features;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(100));
		Predicate<Integer> q=i->(i>10);
		System.out.println(q.test(5));
		Predicate<String> st=str->(str.length()>3);
		System.out.println(st.test("JAVA"));
		Predicate<Double> st1=s->(s==3);
		System.out.println(st1.test(5.5));
		print(p,a);
		
	}

	public static void print(Predicate<Integer> r,int[] v)
	{
		for(int ele1:v)
		{
			if(ele1 %2==0)
				System.out.println("Even number "+ele1);
		}
		for(int ele2:v)
		{
			if(ele2 %2==0)
				System.out.println("Odd number "+ele2);
		}
	}
}
