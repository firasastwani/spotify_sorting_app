package main.java.com.firas.spotify_sorting_app.Repo;

import com.firas.spotify_sorting_app.Model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "song")
public interface SongsRepo extends JpaRepository<Song, Integer> {

    
}