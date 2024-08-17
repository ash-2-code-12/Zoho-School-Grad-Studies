package playmusic;

public class MP3Player implements Playable {

    @Override
    public void play() {
        System.out.println("MP3 Player is playing music.");
    }

    @Override
    public void pause() {
        System.out.println("MP3 Player has paused the music.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player has stopped the music.");
    }
}

