package cl.uv.ici.arq.spotify.demo.controller.dto;

import lombok.Data;

@Data
public class AuthorDTO {
	private Integer id;
	private String name;
	private Integer followers;
	private Genre[] genres; 
	private Integer id_playlist;
}
