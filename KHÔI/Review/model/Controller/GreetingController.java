package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class GreetingController {

    @GetMapping("/music")
    public String music(Model model) {
        Singer mySinger = new Singer("Singer01", "Lady Gaga");

        Song mySong = new Song("Song01", "Always Remember Us this Way");
        Song mySong1 = new Song("Song02", "Woman in Love");
        Song mySong2 = new Song("Song03", "What I Wanna Do");

        MyRecord myRecord = new MyRecord("rec01", "1st Record",
            "https://www.youtube.com/embed/5vheNbQlsyU?si=XDCvieaoIQFEZgh");

        ArrayList<Song> listOfSong = new ArrayList<>();
        listOfSong.add(mySong);
        listOfSong.add(mySong1);
        listOfSong.add(mySong2);

        System.out.println("song::::" + listOfSong.get(0).songName);

        model.addAttribute("singer", mySinger);
        model.addAttribute("song", mySong.songName);
        model.addAttribute("record", myRecord);
        model.addAttribute("listOfSong", listOfSong);

        return "music";
    }

    @GetMapping("/myentertain")
    public String myEntertain(Model model) {
        return "entertainment";
    }
}
