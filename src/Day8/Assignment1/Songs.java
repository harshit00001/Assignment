package Day8.Assignment1;
public class Songs {
	private FavSongs[] arr; //Array to Store queue element
	private int front; // this will represent the first element of the queue
	private int rear;  // this will represent the last element in the queue
	private int capacity; // total capacity of the queue
	private int count; // current size of the queue
	Songs(int size)
	{
		arr=new FavSongs[size];
		this.capacity=size;
		this.rear= -1;
		this.front=-1;
		count =0;
	}
	public void enqueue(FavSongs fav)
	{
		if(rear==capacity-1)
		System.out.println("Playlist is full");
		else {
		System.out.println("song: "+fav.getS_name() + "=> Artist: "+fav.getArtist());
		rear=(rear+1)%capacity;
		arr[rear]=fav;
		count++;
		}
	}
	public FavSongs dequeue()
	{
		FavSongs x=arr[front+1];
		if(rear==-1)
		{
			System.out.println("Playlist is empty");
		}
		else {
		System.out.println("Removing song: "+x);
		front=(front+1)%capacity;
		count--;
		}
		return x;
	}
	public void playnext(String name)
	{
		if(rear==-1)
		{
			System.out.println("Playlist is Empty, Song not Available");
		}
		else if (rear==capacity-1)
			System.out.println("Next Song is not Available");
		else {
			for(int i=0;i<rear+1;i++) {
				if(name.equals(arr[i].getS_name()))
				{
					System.out.println("Song: "+ arr[i].getS_name() +" => Artist: " + arr[i].getArtist() );
					System.out.println("Remaining Song: "+ (rear-i));
					break;
				}
				
			}
			}
	}
	
	public int size()
	{
		return count;
	}
}
