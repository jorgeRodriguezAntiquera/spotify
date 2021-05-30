package cl.uv.ici.arq.spotify.demo.controller.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
public class TrackDTO {
	@Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue
    private UUID trackId;

    @Column(name = "playlist", nullable = false)
    private UUID idPlaylist;

    private String title;
    private Integer duration;
	private String id;
	private String id_playlist;
	
	
}
