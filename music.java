package array;
interface media {
	void play();
	void stop();
	default void  pause() {
		System.out.println("Media paused");
		
	}
	static void about() {
		System.out.println("This is  A media Interface");
		
	}
}
interface AdvancedMedia extends media
{
	void next_track();
	
}
class MusicPlayer  implements AdvancedMedia
{
	public void play()
	{
		System.out.println("Music started");

	}
	public void stop()
	{
		System.out.println("Music stopped");
	}
	public void next_track()
	{
		System.out.println("Next Song");
	}
}
public class music {
	public static void main(String[] args)
	{
	 MusicPlayer mp=new MusicPlayer();
	 mp.play();
	 mp.next_track();
	 mp.pause();
	 media.about();
	 mp.stop();
		 
	}
	
    
}
