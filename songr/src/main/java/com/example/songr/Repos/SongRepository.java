package com.example.songr.Repos;


import com.example.songr.Model.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song,Integer> {
    Iterable<Song> findAllByAlbumId(Integer id);
}
