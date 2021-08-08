package com.example.songr;

import Model.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SongrApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testTheAlbumContstructor() {
        Album album1 = new Album("album1", "test", 5, 3, "https://blog.dozmia.com/content/images/2019/01/Portrait-The" +
                "-Weeknd.jpg");
        assertEquals("Album{title='album1', artist='test', songCount=5, length=3, imageUrl='https://blog.dozmia.com/content/images/2019/01/Portrait-The-Weeknd.jpg'}",album1.toString());
    }

    @Test
    public void testSetters() {
        Album album1 = new Album("album1", "test", 5, 3, "https://blog.dozmia.com/content/images/2019/01/Portrait-The" +
                "-Weeknd.jpg");
        album1.setTitle("album1Test");
        album1.setArtist("artistTest");
        album1.setSongCount(5);
        album1.setLength(19);
        album1.setImageUrl("https://blog.dozmia.com/content/images/2019/01/Portrait-The");
        assertEquals("Album{title='album1Test', artist='artistTest', songCount=5, length=19, imageUrl='https://blog" +
                ".dozmia.com/content/images/2019/01/Portrait-The'}",album1.toString());
    }

    @Test
    public void testGetters() {
        Album album1 = new Album("album1", "test", 5, 3, "https://blog.dozmia.com/content/images/2019/01/Portrait-The" +
                "-Weeknd.jpg");
        album1.getTitle();
        album1.getArtist();
        album1.getLength();
        album1.getSongCount();
        album1.getImageUrl();
        System.out.println(album1);
        assertEquals("album1",album1.getTitle());
        assertEquals("test",album1.getArtist());
        assertEquals(5,album1.getSongCount());
        assertEquals(3,album1.getLength());
        assertEquals("https://blog.dozmia.com/content/images/2019/01/Portrait-The-Weeknd.jpg",album1.getImageUrl());
    }

}
