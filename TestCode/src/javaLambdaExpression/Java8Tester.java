package javaLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Tester {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Print all numbers:");
		for(int i:processList(list, n->true)){
			System.out.println(i);
		}
		
		System.out.println("Print even numbers:");
		for(int i:processList(list, n->n%2 == 0)){
			System.out.println(i);
		}
		
		System.out.println("Print numbers greater than 3:");
		for(int i:processList(list, n->n>3)){
			System.out.println(i);
		}
	}
	
	private static List<Integer> processList(List<Integer> list, Predicate<Integer> pre){
		List<Integer> toList = new ArrayList<Integer>();
		for(int i:list){
			if(pre.test(i)){
				toList.add(i);
			}
		}
		return toList;
	}
}
