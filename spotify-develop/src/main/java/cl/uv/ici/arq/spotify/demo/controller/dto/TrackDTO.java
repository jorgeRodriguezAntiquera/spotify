package cl.uv.ici.arq.spotify.demo.controller.dto;

import lombok.Data;

@Data
public class TrackDTO {
	private String id;
	private String title;
	private String idPlaylist;
	private Integer duration;
	
}
