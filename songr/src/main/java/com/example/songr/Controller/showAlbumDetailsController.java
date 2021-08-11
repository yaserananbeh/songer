package com.example.songr.Controller;

import com.example.songr.Model.Album;
import com.example.songr.Repos.AlbumRepository;
import com.example.songr.Repos.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class showAlbumDetailsController {
    @Autowired
    AlbumRepository albumRepository ;
    @Autowired
    SongRepository songRepository ;
    @GetMapping("/showalbum")
    public String showOneAlbum(@RequestParam Integer id, Model model){
        Album album=albumRepository.findById(id).get();
        model.addAttribute("songs",songRepository.findAllByAlbumId(id));
        model.addAttribute("album",album);
//        System.out.println(songRepository.findAllByAlbumId(id));
        return "showOneAlbumDetails";
    }
}
