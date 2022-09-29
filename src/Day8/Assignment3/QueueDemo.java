package Day8.Assignment3;

public class QueueDemo {

		// TODO Auto-generated method stub
		private int[] arr; //Array to Store queue element
		private int front; // this will represent the first element of the queue
		private int rear;  // this will represent the last element in the queue
		private int capacity; // total capacity of the queue
		private int count; // current size of the queue
		QueueDemo(int size)
		{
			arr=new int[size];
			this.capacity=size;
			rear= -1;
			count =0;
		}
		public void enqueue(int item)
		{
			System.out.println("Inserting: "+item);
			rear=(rear+1)%capacity;
			arr[rear]=item;
			count++;
		}
		public int dequeue()
		{
			int x=arr[front];
			System.out.println("Removing: "+x);
			front=(front+1)%capacity;
			count--;
			return x;
		}
		public int peek()
		{
			return arr[front];
		}
		public int size()
		{
			return count;
		}
		


}
