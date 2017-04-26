/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Comparator;

/**
 *
 * @author ltrinastic
 */
public class MovieByTitle implements Comparator<Movie> {

    public MovieByTitle() {
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
    
}
