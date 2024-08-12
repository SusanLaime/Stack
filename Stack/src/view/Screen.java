package view;

import model.EmptyStack;
import model.FullStack;
import model.Stack;

public class Screen {
	public static void main(String[] args) {
		try {
			Stack stack = new Stack(3);
			stack.Push(5);
			stack.Push(4);
			stack.Push(2);
			System.out.println(stack.Pop());
			stack.Push(2);
			stack.Push(2);
			System.out.println(stack.Pop());
			stack.Pop();
			stack.Pop();
			stack.Pop();
			stack.Pop();
			stack.Pop();
			stack.Pop();
		} catch (FullStack e) {
			System.out.println("Full Stack");
			System.out.println(e.getMessage());
		}catch (EmptyStack e) {
			System.out.println("The stack is empty.");
		}
	}
}
