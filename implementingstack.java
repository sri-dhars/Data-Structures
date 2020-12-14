import java.util.Stack;

public class implementingstack {

	public static void main(String[] args) 
	{
		//Initializing a Stack.
		Stack<Integer> stacks= new Stack<Integer>();
		
		
		//Checks if the stack is empty (Boolean) return type.
		System.out.println("Is the stack empty : "+stacks.isEmpty());
		
		stacks.push(4);
		stacks.push(8);
		stacks.push(12);
		stacks.push(16);
		stacks.push(20);
		stacks.push(24);
		stacks.push(28);
		stacks.push(32);
		stacks.push(36);
		stacks.push(40);
		
		//Printing values in the stack
		System.out.println("Values in stack are : "+stacks);
		System.out.println("Number of elements in a stack : "+stacks.size());
		
		
		//Removing the top most element from the stack.
		stacks.pop();
		
	    System.out.println("Stack after one POP operation : " +stacks);
	    System.out.println("Number of elements in a stack : "+stacks.size());
	    System.out.println("Performing few pops.....");
	    
	    stacks.pop();
	    stacks.pop();
	    stacks.pop();

	    System.out.println("Values in stack at this instance are : "+stacks);
	    
	    //Finding the top most value of the stack using peek.
	    System.out.println("Top value of stack is : "+stacks.peek());
	    
	    //Checking to know the first entered value of stack.
	    System.out.println("First value of the stack : "+stacks.firstElement());
	    
	    //Checking the size of stack.
	    System.out.println("Number of elements in a stack : "+stacks.size());
	    
	    //Finding if the stack has a value.	    
	    System.out.println("Does the stack has a value '12' : "+stacks.contains(12));
	    
	    System.out.println("Does the stack has a value '32' : "+stacks.contains(32));
	    
	    
	    //Obtaining the value of stack at a particular index.
	    System.out.println("Element at index 4 is :"+stacks.elementAt(4));
	    
	    
	    System.out.println("After few push operation........");
	    
	    stacks.push(10);
	    stacks.push(20);
	    stacks.push(30);
	    stacks.push(40);
	    stacks.push(50);
	     
	    System.out.println("Stack size after few push operations : "+stacks.size());
	    
	    System.out.println("Values in stack after push operations are : "+stacks);
	    
	    //Removing an element at a particular index.
	    System.out.println("Value at index 8 is : "+stacks.remove(8));
	    	    
	    System.out.println("As the index value starts from 0, 8th element is 30 in the stack. After perfoming remove operation at 8th index value.");
	    
	    System.out.println("Stack has : "+stacks);
	    

	}

}
