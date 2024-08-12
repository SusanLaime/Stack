package model;

public class Stack {

	//push.- pile. Can you unpile more than one?
	//pop.- unpile.After using pop, you can reduce.
	private int[] array;
	private int index;
	
	public Stack(int n) {
		array= new int[n];
		index=-1;
	}
	public void Push(int value) throws FullStack {
		//F.I.L.O
		//Fist IN, Last Out
		//array[++index]=value;
		try {
			array[++index]= value;
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			throw new FullStack("Full stack");
			//levantar?
		}
	}	
		
	public int Pop() throws EmptyStack {
		try{
			return array[index --];
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			throw new EmptyStack("Empty Stack");
		}
		
	}
}
