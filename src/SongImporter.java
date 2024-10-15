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
                if (lineNumber > 30)
                {
                    break;
                }

                lineNumber++; // Keep track of line numbers to make inspection of data errors simpler.

                // This puts the next line of the file into a String named line.
                String line = csv.nextLine();
                // The string is then split on each comma into an array of fields.
                String[] fields = line.split(",");

                // Each field is given a name to simply their usage in constructing songs. 
                String artistName = fields[0];
                String trackName = fields[1];
                String releaseDate = fields[2];
                String genre = fields[3];
                String length = fields[4];
                String shakeTheAudience = fields[5];
                String obscene = fields[6];
                String danceability = fields[7];
                String loudness = fields[8];
                String topic = fields[9];

                // Debug print
                //System.out.println("artist: " + artist + " length: " + length + "topic: " + topic);

                // Replace the next line with your song constructor
                Song song = new Song(artistName, trackName); // code to construct a song object

                // Add the song object to the data output.
                songs.add(song);
            }
            csv.close();
        } catch (Exception ex) {
            System.out.println("Error on line: " + lineNumber);
            ex.printStackTrace();
        }
        return songs;
    }
}