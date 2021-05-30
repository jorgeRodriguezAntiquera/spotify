package cl.uv.ici.arq.spotify.demo.controller.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
public class TrackDTO {
    private String title;
    private Integer duration;
	private String id;
	// private String idPlaylist;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/*public String getIdPlaylist() {
		return idPlaylist;
	}
	public void setIdPlaylist(String id_playlist) {
		this.idPlaylist = id_playlist;
	}*/
	
}
