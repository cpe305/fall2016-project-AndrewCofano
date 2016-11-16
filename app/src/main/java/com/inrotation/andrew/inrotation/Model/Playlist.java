package com.inrotation.andrew.inrotation.model;

import java.util.ArrayList;

public class Playlist {

    public String playlistName;
    public HostUser owner;
    public int songCount;
    public int playlistDuration;

    private Song currentSong;
    private ArrayList<Song> songList;
    private Song nextSong;
    private Song prevSong;

    public Playlist(String playlistName, HostUser owner, int songCount, int playlistDuration) {
        this.playlistName = playlistName;
        this.owner = owner;
        this.songCount = songCount;
        this.playlistDuration = playlistDuration;
    }








}