package org.meltwater.java.datastructures;
import java.util.Arrays;

public class TheStack {
	private String[] stackArray;

	private int stackSize;

	private int topOfStack = -1;

	TheStack(int size){
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}
	public void displayTheStack(){
     for(int n = 0; n < 61; n++)System.out.print("-");
      System.out.println();
     for(int n = 0; n < stackSize; n++){
     	System.out.format("| %2s "+ " ", n);
      }
        System.out.println("|");
      for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
      for(int n = 0; n < stackSize; n++){
      if(stackArray[n].equals("-1")) System.out.print("|     ");
        else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
      }
        System.out.println("|");
      for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
      }
	public void push(String input){
		if(topOfStack +1 < stackSize){
			topOfStack++;
			stackArray[topOfStack] = input;
		} else System.out.println("Sorry but th stack is full");
		displayTheStack();
		System.out.println("PUSH " +input+" was added to the stack");
	}
	public String pop(){
		if(topOfStack >= 0){
			displayTheStack();
			System.out.println("POP " +stackArray[topOfStack]+" was removed from the stack\n");
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];
		} else{
			displayTheStack();
			System.out.println("Sorry but the stack is empty");
			return "-1";
		}
	}
	public String peek(){
		displayTheStack();
		System.out.println("PEEK " +stackArray[topOfStack]+" is at the top of stack");
		return stackArray[topOfStack];
	}
	public static void main(String[] args){
		TheStack theStack = new TheStack(10);
		theStack.push("10");
		theStack.push("15");
		theStack.push("20");
		theStack.push("25");
	}
}
