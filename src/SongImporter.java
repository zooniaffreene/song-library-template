import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class SongImporter
{
    public static ArrayList<Song> importSongsFromCSV(String filename)
    {
        ArrayList<Song> songs = new ArrayList<Song>();
        int lineNumber = 0;
        try {
            File file = new File(filename);
            Scanner csv = new Scanner(file);
            csv.useDelimiter(",");

            // First line is a header
            // artist_name, track_name, release_date, genre, len, shake the audience, obscene, danceability, loudness, topic
            String header_fields = csv.nextLine();

            while (csv.hasNextLine()) {
                try {
                    lineNumber++;
                    String artistName = csv.next();
                    String trackName = csv.next();
                    String releaseDate = csv.next();
                    String genre = csv.next();
                    String length = csv.next();
                    String shakeTheAudience = csv.next();
                    String obscene = csv.next();
                    String danceability = csv.next();
                    String loudness = csv.next();
                    String topic = csv.next();

                    // Debug print
                    //System.out.println("length: " + length + "topic: " + topic);

                    // Replace the next line with your song constructor
                    Song song = new Song(artistName, trackName); // code to construct a song object
                    songs.add(song);
                }
                catch (NoSuchElementException ex)
                {
                    System.out.println("Exception processing line: " + lineNumber);
                }
            }
            csv.close();
        } catch (Exception ex) {
            System.out.println("Error on line: " + lineNumber);
            ex.printStackTrace();
        }
        return songs;
    }
}