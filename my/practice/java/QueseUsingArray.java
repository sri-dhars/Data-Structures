package my.practice.java;

public class QueseUsingArray {
	
	int array[];
	public int fin;
	public int fout;
	private static int size;
	public QueseUsingArray(int i) {
		// TODO Auto-generated constructor stub
	}

	public void array(){
		array = new int[size];
		fin = 0;
		fout = 0;
		size = 0;
	}
	
	public int enqueue(int e) {
		if(fin == -1) {
		fout++;
		array[fout]=e;
		size++;
		}
      return e;
	}
	
	public int dequeue(int d) {
		if(size == fout) {
		array[fin] = d;
		fin--;
		}
      return d;		
	}
    
	public static void main(String[] args) {
		
		QueseUsingArray array = new QueseUsingArray(size);
		System.out.println("Elements in the queue are : ");
		System.out.println("["+array.enqueue(4)+","+array.enqueue(8)+","+array.enqueue(12)+","+array.enqueue(16)+"]");		
		
	}
}
