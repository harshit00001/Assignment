package Day8.Assignment1;


public class SongMain {

	public static void main(String[] args) {
		Songs queue=new Songs(5);
		
		queue.enqueue(new FavSongs("Barsat ki dhun","Jubin"));
		queue.enqueue(new FavSongs("Mera Safar","Ritvik"));
		queue.enqueue(new FavSongs("Kesariya","Arijit"));
		queue.enqueue(new FavSongs("Pasoori","Jubin"));
		System.out.println(queue);
		System.out.println("\n-------Play Next Song and show Remaining Song: -------");
		queue.playnext("Pasoori");
		System.out.println("Number of Songs: "+queue.size());
		System.out.println("\n------Remove-----");
		queue.dequeue();
		System.out.println("\n-------Play Next Song and show Remaining Song: --------");
		queue.playnext("Mera Safar");
		System.out.println("Number of Songs: "+queue.size());
		
//		queue.dequeue();


	}

}
