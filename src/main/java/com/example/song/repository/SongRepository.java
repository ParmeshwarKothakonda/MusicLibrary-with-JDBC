package com.example.song.repository;


import com.example.song.model.Song;
import java.util.*;

public interface SongRepository{
    //Add all the methods here!
    ArrayList<Song> getSongs(); //get for All

    Song getSongById(int songId); //get for specific song

    Song addSong(Song song); // add a song details

    Song updateSong(int songId, Song song); // update a song details

    void deleteSong(int songId); //delete a song details

}