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

    @Column(name = "playlist", nullable = false)
    private UUID idPlaylist;

    private String title;
    private Integer duration;
}
