package cl.uv.ici.arq.spotify.demo.controller.service;

import java.util.List;

import cl.uv.ici.arq.spotify.demo.controller.dto.TrackDTO;

public interface TrackService {

	public List<TrackDTO> getTracks(Integer offset, Integer limit);
	public TrackDTO	createTrack(TrackDTO trackDTO);
	public TrackDTO getById(String idTrack);
	public boolean  delete(String idTrack);
	public TrackDTO update(TrackDTO trackDTO);
}
