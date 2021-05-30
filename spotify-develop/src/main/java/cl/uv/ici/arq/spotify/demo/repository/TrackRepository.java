package cl.uv.ici.arq.spotify.demo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cl.uv.ici.arq.spotify.demo.entities.TrackEntity;

@Repository("trackRepository")
public interface TrackRepository extends JpaRepository<TrackEntity, UUID> {

    @Query(value = "SELECT * FROM TRACK", nativeQuery=true)
    public List<TrackEntity> getAll();
}