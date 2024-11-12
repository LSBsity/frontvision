package frontvision.first.domain.album.domain;

import frontvision.first.domain.artist.domain.Artist;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "ALBUM")
public class Album {

    @Id
    @Column(name = "ALBUM_ID")
    private Long id;

    @Column(name = "ALBUM_TITLE")
    private String title;

    @Column(name = "ALBUM_LYRIC", columnDefinition = "TEXT")
    private String lyric;

    @Column(name = "ALBUM_THUMBNAIL_URL")
    private String thumbnailUrl;

    @Column(name = "ALBUM_VIDEO_URL")
    private String videoUrl;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "ARTIST_ID")
    private Artist artist;
}
