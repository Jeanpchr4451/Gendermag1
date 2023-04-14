public class Song {
    private int songID;
    private String songData1;
    private String songData2;
    private String songData3;
    private String songData4;
    
    // Constructor
    public Song(int songID, String songData1, String songData2, String songData3, String songData4) {
        this.songID = songID;
        this.songData1 = songData1;
        this.songData2 = songData2;
        this.songData3 = songData3;
        this.songData4 = songData4;
    }
    
    // Getters
    public int getSongID() {
        return songID;
    }
    
    public String getSongData1() {
        return songData1;
    }
    
    public String getSongData2() {
        return songData2;
    }
    
    public String getSongData3() {
        return songData3;
    }
    
    public String getSongData4() {
        return songData4;
    }
    
    // Setters
    public void setSongID(int songID) {
        this.songID = songID;
    }
    
    public void setSongData1(String songData1) {
        this.songData1 = songData1;
    }
    
    public void setSongData2(String songData2) {
        this.songData2 = songData2;
    }
    
    public void setSongData3(String songData3) {
        this.songData3 = songData3;
    }
    
    public void setSongData4(String songData4) {
        this.songData4 = songData4;
    }
    
    // toString method
    @Override
    public String toString() {
        return songID + "\t" + songData1 + "\t" + songData2 + "\t" + songData3 + "\t" + songData4;
    }
}