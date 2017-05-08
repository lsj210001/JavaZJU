package dome;

public class MP3 extends Item {
    private int duration;
    private String album;
    private String trackName;
    private String performer;
    private String bitRate;

    public MP3(String title, int playingTime, boolean gotIt, String comment, int duration, String album, String trackName, String performer, String bitRate) {
        super(title, playingTime, gotIt, comment);
        this.duration = duration;
        this.album = album;
        this.trackName = trackName;
        this.performer = performer;
        this.bitRate = bitRate;
    }

    @Override
    public void print() {
        System.out.println("MP3");
        super.print();
    }
}
