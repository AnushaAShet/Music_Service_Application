package com.stackroute.musicservice.service;
import com.stackroute.musicservice.domain.Track;

import java.util.List;
public interface TrackService{
    public Track saveTrack(Track track) throws Exception;
    public List<Track> showAllTrack();
    public Track updateComment(Track track) throws Exception;
    public boolean deleteTrack(Track track) throws Exception;
    public List<Track> getTrackByName(String trackName) throws Exception;
}