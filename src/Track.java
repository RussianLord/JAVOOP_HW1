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

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public void setLengthTrack(int lengthTrack) {
        this.lengthTrack = lengthTrack;
    }

    public void setLap(int lap) {
        this.lap = lap;
    }

    String getTrackName() {
        return trackName;
    }

    public void getInfo() {
        System.out.println("Трасса: " + getTrackName() + ". Длина трека: " + getLengthTrack() + ". Количество кругов: " + getLap());
    }
}
