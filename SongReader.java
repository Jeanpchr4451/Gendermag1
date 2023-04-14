import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class SongReader {

    public static Song[] readSongsArray(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        ArrayList<Song> songs = new ArrayList<>();
        String line = reader.readLine(); // skip header
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");
            int id = Integer.parseInt(fields[0]);
            String name = fields[1];
            int year = Integer.parseInt(fields[2]);
            String artist = fields[3];
            Song song = new Song(id, name, year, artist);
            songs.add(song);
        }
        reader.close();
        return songs.toArray(new Song[0]);
    }

    public static LinkedList<Song> readSongsLinkedList(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        LinkedList<Song> songs = new LinkedList<>();
        String line = reader.readLine(); // skip header
        while ((line = reader.readLine()) != null) {
            String[] fields = line.split(",");
            int id = Integer.parseInt(fields[0]);
            String name = fields[1];
            int year = Integer.parseInt(fields[2]);
            String artist = fields[3];
            Song song = new Song(id, name, year, artist);
            songs.add(song);
        }
        reader.close();
        return songs;
    }

}