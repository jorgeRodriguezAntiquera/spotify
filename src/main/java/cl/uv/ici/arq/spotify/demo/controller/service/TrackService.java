package cl.uv.ici.arq.spotify.demo.controller.service;

import java.util.List;

import cl.uv.ici.arq.spotify.demo.controller.dto.TrackDTO;

public interface TrackService {

	public List<TrackDTO> getTrack();
	public TrackDTO	createTrack(TrackDTO track);
	public TrackDTO getById(Integer id);
	public boolean  delete(Integer id);
	public TrackDTO update(TrackDTO track);
}
