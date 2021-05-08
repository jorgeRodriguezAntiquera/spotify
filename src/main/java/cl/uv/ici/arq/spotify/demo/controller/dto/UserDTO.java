package cl.uv.ici.arq.spotify.demo.controller.dto;
import lombok.Data;

@Data
public class UserDTO {
	private Integer id;
	private String username;
	private Integer[] id_playlist;
	private String name;
}
