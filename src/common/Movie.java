package common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie implements Comparable {
    private String title;
    private String director;
    private String movieId;

    public Movie() {
    }

    public Movie(String title, String director, String movieId) {
        this.title = title;
        this.director = director;
        this.movieId = movieId;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.title);
        hash = 89 * hash + Objects.hashCode(this.director);
        hash = 89 * hash + Objects.hashCode(this.movieId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.director, other.director)) {
            return false;
        }
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movie title= " + title + ", director= " + director + ", movieId= " + movieId;
    }

    @Override
    public int compareTo(Object o) {
        Movie m = (Movie)o;
        return new CompareToBuilder()
               .append(this.movieId, m.movieId)
               .toComparison();
    }
    
    
    
    public static void main(String[] args) {
        Movie m1 = new Movie("Jaws", "Steven Speilberg", "1122");
        Movie m2 = new Movie("Avatar", "James Cameron", "3344");
        Movie m3 = new Movie("Jaws", "Steven Speilberg", "1122");
        Movie m4 = new Movie("Harry Potter and the Sorceror's Stone", "Chris Columbus", "0731");
        
        Map <String, Movie> myMap = new HashMap<>();
        myMap.put("1122", m1);
        myMap.put("3344", m2);
        myMap.put("1122", m3);
        myMap.put("0731", m4);
        
        Movie m = myMap.get("0731");
        System.out.println("Getting movie information with movie id of 0731: " + m);
        
        Collection <Movie> movCol = myMap.values();
        for(Movie movObj : movCol){
            Movie x = movObj;
            System.out.println(x);
        }
    }
    
    

}
