package com.example.songr.Controller;

import com.example.songr.Repos.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class showSongsController {
    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public String showAllSongs(Model model){
        model.addAttribute("songs",songRepository.findAll());
        return "songs.html";
    }
}
