public class Song
{
  // Private instance variables for the 10 attributes
  private String title = "Unknown";
  private String artist = "Unknown Artist";
  private String album = "Unknown Album";
  private int releaseYear = 0;
  private String genre = "Unknown Genre";
  private int duration = 0;  // duration in seconds
  private double rating = 0.0;  // out of 5
  private boolean isExplicit = false;
  private long streams = 0;
  private String writer = "Unknown Writer";

  // Default constructor
  public Song(){} 

  // Overloaded constructor to take all 10 parameters
  public Song(String title, String artist, String album, int releaseYear, String genre, int duration, double rating, boolean isExplicit, long streams, String writer) 
  {
    this.title = title;
    this.artist = artist;
    this.album = album;
    this.releaseYear = releaseYear;
    this.genre = genre;
    this.duration = duration;
    this.rating = rating;
    this.isExplicit = isExplicit;
    this.streams = streams;
    this.writer = writer;
  }

  // toString method for printing the object
  @Override
  public String toString()
  {
    return "Song: " + title + "\n" +
           "Artist: " + artist + "\n" +
           "Album: " + album + "\n" +
           "Release Year: " + releaseYear + "\n" +
           "Genre: " + genre + "\n" +
           "Duration: " + duration + " seconds\n" +
           "Rating: " + rating + "/5\n" +
           "Explicit: " + (isExplicit ? "Yes" : "No") + "\n" +
           "Streams: " + streams + "\n" +
           "Writer: " + writer;
  }
  
  // Getters for the instance variables
  public String getTitle() { return title; }
  public String getArtist() { return artist; }
  public String getAlbum() { return album; }
  public int getReleaseYear() { return releaseYear; }
  public String getGenre() { return genre; }
  public int getDuration() { return duration; }
  public double getRating() { return rating; }
  public boolean getIsExplicit() { return isExplicit; }
  public long getStreams() { return streams; }
  public String getWriter() { return writer; }

  // Setters for the instance variables
  public void setTitle(String title) { this.title = title; }
  public void setArtist(String artist) { this.artist = artist; }
  public void setAlbum(String album) { this.album = album; }
  public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }
  public void setGenre(String genre) { this.genre = genre; }
  public void setDuration(int duration) { this.duration = duration; }
  public void setRating(double rating) { this.rating = rating; }
  public void setIsExplicit(boolean isExplicit) { this.isExplicit = isExplicit; }
  public void setStreams(long streams) { this.streams = streams; }
  public void setWriter(String writer) { this.writer = writer; }
}
