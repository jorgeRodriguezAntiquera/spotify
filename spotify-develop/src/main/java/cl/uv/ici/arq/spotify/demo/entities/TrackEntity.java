package cl.uv.ici.arq.spotify.demo.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "Track")
public class TrackEntity {
	@Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue
    private UUID trackId;

    //@Column(name = "playlist", nullable = false)
    //private UUID idPlaylist;

    private String title;
    private Integer duration;
    
	public UUID getTrackId() {
		return trackId;
	}
	public void setTrackId(UUID trackId) {
		this.trackId = trackId;
	}
	/*
	public UUID getIdPlaylist() {
		return idPlaylist;
	}
	public void setIdPlaylist(UUID idPlaylist) {
		this.idPlaylist = idPlaylist;
	}
	public String getTitle() {
		return title;
	}*/
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
    
}
