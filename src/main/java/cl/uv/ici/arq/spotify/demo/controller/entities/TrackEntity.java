package cl.uv.ici.arq.spotify.demo.controller.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Track")
public class TrackEntity {
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue
	private UUID trackId;
	
	@Column(name = "playlist", nullable = false)
	private UUID idPlaylist;
	private Integer duration;
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public UUID getTrackId() {
		return trackId;
	}

	public void setTrackId(UUID trackId) {
		this.trackId = trackId;
	}

	public UUID getIdPlaylist() {
		return idPlaylist;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public void setIdPlaylist(UUID idPlaylist) {
		this.idPlaylist = idPlaylist;
	}
		
	
}
