class Music{
    void music()
    {
        System.out.println("Music Started Playing");

    }
}
class Musics extends Music{
    void stop()
    {
        System.out.println("The music suddenly stopped");
    }
}
public class Inheritance {
    public static void main (String[] args)
    {
        Musics ms=new Musics();
        ms.music();
        ms.stop();
    }
}
