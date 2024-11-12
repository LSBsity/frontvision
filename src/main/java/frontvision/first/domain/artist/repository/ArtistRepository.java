package frontvision.first.domain.artist.repository;

import frontvision.first.domain.artist.domain.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
