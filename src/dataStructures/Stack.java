package dataStructures;



import java.util.*;
public class Stack {

	private int top;
	private int capacity;
	private int arr[];
	Stack(int size){
		
		arr=new int[size];
		capacity=size;
		top=-1;
		
	}
	
	
	// push function 
	
	public void push(int x) {
		
		if(top>= capacity-1 ) {
			System.out.println("Stack is full ");
		}else {
		
		top++;
		arr[top]=x;
		
		System.out.println("added ");
	       }
	}
	
	
	
	boolean isEmpty() {
		if (top == -1) {return true ;}else {
			return false; 
		}
	}
	

	
	public void pop() {
		
		if(!isEmpty()) {
		top--;
		System.out.println("removed ");
	}else {
		System.out.println("Stack is empty ");
	  }
	}
	
	public void print() {
		for(int i=top;i>=0;i--) {
			System.out.println(" "+arr[i]);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		s.push(9);
		int y=0;
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.print(); 
	;
		
		
		
	}

}
