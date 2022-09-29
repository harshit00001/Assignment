package Day8.Assignment3;
public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDemo queue=new QueueDemo(5);
		queue.enqueue(21);
		queue.enqueue(84);
		queue.enqueue(4);
		queue.enqueue(7);
		queue.enqueue(80);
		System.out.println(queue);
		System.out.println("Front= "+queue.peek());
		System.out.println("size= "+queue.size());
		queue.dequeue();
		System.out.println("Front= "+queue.peek());
		System.out.println("size= "+queue.size());

	}

}
