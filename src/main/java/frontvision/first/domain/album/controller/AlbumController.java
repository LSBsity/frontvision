package frontvision.first.domain.album.controller;

import frontvision.first.common.response.SuccessResponse;
import frontvision.first.domain.album.dto.AlbumDto;
import frontvision.first.domain.album.service.AlbumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AlbumController {

    private static int count = 0;
    private final AlbumService albumService;

    @GetMapping("/albums")
    public ResponseEntity<SuccessResponse<List<AlbumDto.Response>>> getAlbums() {
        log.info("getAlbum" + ++count);
        return SuccessResponse.of(
                albumService.getAlbums()
        ).setStatus(HttpStatus.OK);
    }

}
