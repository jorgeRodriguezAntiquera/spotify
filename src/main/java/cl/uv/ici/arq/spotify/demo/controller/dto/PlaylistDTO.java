package cl.uv.ici.arq.spotify.demo.controller.dto;
import lombok.Data;

@Data
public class PlaylistDTO {

	private Integer id;
	private String name;
	private Integer id_user;
	private Integer id_author;
	private Integer[] id_tracks;
	
}
