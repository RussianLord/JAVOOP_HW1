public class Track {
    private String trackName;
    private int lengthTrack, lap;


    public Track(String trackName, int lengthTrack, int lap) {
        this.trackName = trackName;
        this.lengthTrack = lengthTrack;
        this.lap = lap;
    }

    int getLap() {
        return lap;
    }

    int getLengthTrack() {
        return lengthTrack;
    }

    String getTrackName() {
        return trackName;
    }

    public void getInfo() {
        System.out.println("Трасса: " + getTrackName() + ". Длина трека: " + getLengthTrack() + ". Количество кругов: " + getLap());
    }
}
