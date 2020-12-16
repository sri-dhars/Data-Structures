package my.practice.java;

import java.util.Arrays;

public class QueueUsingArray {
	
	private static int size = 5;//setting the size of an array
	
	int array[] = new int[size];
	public int fin;//first element of the array
	public int fout;//last element of an array
	


	public QueueUsingArray(){
		//giving the initial index of an array
		fin = -1; 
		fout = -1;
	}
	
	public int[] enqueue(int e) {
		if(fin <= size) {
		++fout;
		array[fout]=e;
		}
      return array;
	}
	 
	public int dequeue() {
		int d = 0;
		if(size!=0) {
		fin++;
		d = array[fin];
		size--;
		}
		return d;
	}
        public void printQueue(){
		for(int i=0; i<queue.length;i++){
			system.out.println(queue[1]);
	}

	/**
	Results after excuting this main
	
	*/
	public static void main(String[] args) {
        int resultArray[];
		QueueUsingArray queueUsingArray = new QueueUsingArray();
		System.out.println("Elements in the queue are : ");
		resultArray=queueusingarray.enqueue(4);
		queueusingarray.printQueue(resultArray);
		resultArray=queueusingarray.enqueue(8);
		resultArray=queueusingarray.enqueue(12);
		resultArray=queueusingarray.enqueue(16);
		resultArray=queueusingarray.enqueue(20);
		System.out.println(Arrays.toString(resultArray));
		int element = queueusingarray.dequeue();
		System.out.println("\nDequeued element is: "+ element);
		
	}
}
