package com.example.songr.Controller;

import com.example.songr.Model.Album;
import com.example.songr.Model.Song;
import com.example.songr.Repos.AlbumRepository;
import com.example.songr.Repos.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AddSongForAlbumController {
    @Autowired
    AlbumRepository albumRepository;
    @Autowired
    SongRepository songRepository;

    @GetMapping("/addsongforalbum")
    public String addSongForAlbum(@RequestParam Integer id, Model model) {
        Album album = albumRepository.findById(id).get();
        model.addAttribute("albumid", album.getId());
        return "addSongForm";
    }

    @PostMapping("/handlesongtoalbum")
    @ResponseBody
    public RedirectView handlesongtoalbum(@RequestParam String title, Integer trackNumber, Integer length,
                                          @RequestParam Integer id,
                                          Model model) {
        Album album = albumRepository.findById(id).get();
        Song song=new Song(title,length,trackNumber,album);
        songRepository.save(song);
        String url = "/showalbum?id=" + id;
        return new RedirectView(url);
    }

}
