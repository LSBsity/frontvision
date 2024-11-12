package frontvision.first.domain.album.repository;

import frontvision.first.domain.album.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {

    @Query("select a from Album a join fetch a.artist")
    List<Album> findAll();
}
