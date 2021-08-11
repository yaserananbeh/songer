package com.example.songr.Controller;

import com.example.songr.Model.Album;
import com.example.songr.Model.Song;
import com.example.songr.Repos.AlbumRepository;
import com.example.songr.Repos.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class songController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/addsong/{id}")
    @ResponseBody
    public String addSong(@PathVariable int id){
        Album album= albumRepository.findById(id).get();
        Song song = new Song("song1",5,5,album);
        System.out.println(song);
        songRepository.save(song);
        return "yaser";
    }
}
