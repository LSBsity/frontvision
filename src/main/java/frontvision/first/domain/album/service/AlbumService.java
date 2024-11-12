package frontvision.first.domain.album.service;

import frontvision.first.domain.album.domain.Album;
import frontvision.first.domain.album.dto.AlbumDto;
import frontvision.first.domain.album.repository.AlbumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AlbumService {

    private final AlbumRepository albumRepository;

    public List<AlbumDto.Response> getAlbums() {
        List<Album> findAlbums = albumRepository.findAll();

        return findAlbums.stream()
                .map(AlbumDto.Response::of)
                .collect(Collectors.toList());
    }
}
