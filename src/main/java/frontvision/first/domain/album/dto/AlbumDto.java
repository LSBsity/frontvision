package frontvision.first.domain.album.dto;

import frontvision.first.domain.album.domain.Album;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class AlbumDto {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private Long id;
        private String title;
        private String artist;
        private String lyric;
        private String thumbnailUrl;
        private String videoUrl;

        public static Response of(Album album) {
            return Response.builder()
                    .id(album.getId())
                    .title(album.getTitle())
                    .artist(album.getArtist().getName())
                    .lyric(album.getLyric())
                    .thumbnailUrl(album.getThumbnailUrl())
                    .videoUrl(album.getVideoUrl())
                    .build();
        }
    }
}
