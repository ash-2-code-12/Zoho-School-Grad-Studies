package playmusic;

public class StreamingPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Streaming Player is playing music.");
    }

    @Override
    public void pause() {
        System.out.println("Streaming Player has paused the music.");
    }

    @Override
    public void stop() {
        System.out.println("Streaming Player has stopped the music.");
    }
}
