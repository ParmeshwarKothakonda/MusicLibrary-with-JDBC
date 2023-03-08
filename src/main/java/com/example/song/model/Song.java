package com.example.song.model;


public class Song{
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    public Song(int songId, String songName, String lyricist, String singer,String musicDirector){
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public int getSongId(){ //getter songId
        return this.songId;
    }

    public void setSongId(int songId){
        this.songId = songId;
    }

    public String getSongName(){ //getter songName
        return this.songName;
    }

    public void setSongName(String songName){
        this.songName = songName;
    }

    public String getLyricist(){ //getter lyricist
        return this.lyricist;
    }

    public void setLyricist(String lyricist){
        this.lyricist = lyricist;
    }

    public String getSinger(){ //getter singer
        return this.singer;
    }

    public void setSinger(String singer){
        this.singer = singer;
    }

    public String getMusicDirector(){ //getter musicDirector
        return this.musicDirector;
    }

    public void setMusicDirector(String musicDirector){
        this.musicDirector = musicDirector;
    }
}
