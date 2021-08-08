package Controller;

import Model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String getAlbum(Model model) {
        Album album1 = new Album("album1", "test", 5, 3, "https://blog.dozmia.com/content/images/2019/01/Portrait-The" +
                "-Weeknd.jpg");
        Album album2 = new Album("album2", "test", 10, 15, "https://marketplace.canva" +
                ".com/EAEjetwMNIs/1/0/1600w/canva-pink-and-white-dreams-minimalist-aesthetic-cd-album-cover" +
                "-b28zMxj5I6Q.jpg");
        Album album3 = new Album("album3", "test", 5, 30, "https://mir-s3-cdn-cf.behance" +
                ".net/project_modules/max_1200/602f4731226337.5646928c3633f.jpg");
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        model.addAttribute("Albums", albums);
        return "albums.html";
    }

}
