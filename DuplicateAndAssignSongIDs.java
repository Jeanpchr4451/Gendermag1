import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DuplicateAndAssignSongIDs {
    public static void main(String[] args) {
        String inputFile = "songs.txt";
        String outputFile = "duplicated_songs_with_ids.txt";
        
        LinkedList<Song> songsList = readSongsToLinkedList("songs.txt");
        displayAllSongs(songsList);

        try {
            // Read input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();

            // Duplicate lines and add song IDs
            List<String> duplicatedLinesWithIds = new ArrayList<>();
            Random rand = new Random();
            for (String originalLine : lines) {
                int songId = rand.nextInt(9000000) + 1000000;  // generate a 7-digit random number between 1000000 and 9999999
                String duplicatedLine = songId + "," + originalLine;  // add song ID as first column
                duplicatedLinesWithIds.add(duplicatedLine);
                duplicatedLinesWithIds.add(duplicatedLine);
            }

            // Write output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            for (String duplicatedLineWithId : duplicatedLinesWithIds) {
                writer.write(duplicatedLineWithId);
                writer.newLine();
            }
            writer.close();

            System.out.println("Duplicated songs with IDs written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void displayAllSongs(LinkedList<Song> songs) {
        for (Song song : songs) {
            System.out.println("Song ID: " + song.getSongId());
            System.out.println("Song Data 1: " + song.getSongData1());
            System.out.println("Song Data 2: " + song.getSongData2());
            System.out.println("Song Data 3: " + song.getSongData3());
        }
        
    }
}