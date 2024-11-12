package frontvision.first.domain.artist.domain;

import frontvision.first.domain.album.domain.Album;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Artist {

    @Id
    @Column(name = "ARTIST_ID")
    private Long id;

    @Column(name = "ARTIST_NAME")
    private String name;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums = new ArrayList<>();
}