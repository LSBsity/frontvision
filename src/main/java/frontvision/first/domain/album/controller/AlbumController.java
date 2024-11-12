package frontvision.first.domain.album.controller;

import frontvision.first.common.response.SuccessResponse;
import frontvision.first.domain.album.dto.AlbumDto;
import frontvision.first.domain.album.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping("/albums")
    public ResponseEntity<SuccessResponse<List<AlbumDto.Response>>> getAlbums() {
        return SuccessResponse.of(
                albumService.getAlbums()
        ).setStatus(HttpStatus.OK);
    }

}
