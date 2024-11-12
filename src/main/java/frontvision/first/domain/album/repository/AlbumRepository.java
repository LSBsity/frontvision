package frontvision.first.domain.album.repository;

import frontvision.first.domain.album.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
}
