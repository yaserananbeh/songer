package com.example.songr.Controller;

import com.example.songr.Model.Album;
import com.example.songr.Repos.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAlbum(Model model) {

        model.addAttribute("Albums", albumRepository.findAll());
        return "albums.html";
    }
    @PostMapping("/addalbum")
    public RedirectView addBook(@ModelAttribute Album album,Model model) {
        model.addAttribute("album",album);
        albumRepository.save(album);
        return new RedirectView("/albums");
    }
}
