package com.stackroute.musicservice.config;
import com.stackroute.musicservice.domain.Track;
import com.stackroute.musicservice.repository.TrackRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

//import java.util.logging.Logger;
@Component
public class CommandLineRunnerStartup implements CommandLineRunner {

    public static final Logger logs = LoggerFactory.getLogger(CommandLineRunnerStartup.class);
    private TrackRepository trackRepository;

    @Autowired
    public CommandLineRunnerStartup(TrackRepository trackRepository){
        this.trackRepository=trackRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        logs.info("Inserting data on start");

        Track trackOne = new Track(11,"ArjunReddy","Singer : VijayDevarkonda");
        trackRepository.save(trackOne);
        Track trackTwo = new Track(8,"NinnuKori","Singer : Nani");
        trackRepository.save(trackTwo);

        logs.info("data successfully inserted");
    }
}