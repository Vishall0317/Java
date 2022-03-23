package com.hcl.Stack;

import java.util.Stack;

public class AppOne {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		
		//push,pop,peek

		System.out.println(stack.size());
		stack.push("100");
		stack.push("200");
		stack.push("300");
		stack.push("400");
		stack.push("500");
		
		System.out.println(stack);
		for(int i=0;i<stack.size();i++) {
			System.out.println(stack.pop());
		}
		
		
	}

}