package playmusic;

public class CDPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("CD Player is playing music.");
    }

    @Override
    public void pause() {
        System.out.println("CD Player has paused the music.");
    }

    @Override
    public void stop() {
        System.out.println("CD Player has stopped the music.");
    }
}
