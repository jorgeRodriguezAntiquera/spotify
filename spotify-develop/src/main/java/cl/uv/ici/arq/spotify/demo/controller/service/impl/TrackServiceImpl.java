package cl.uv.ici.arq.spotify.demo.controller.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.reflect.TypeToken;

import cl.uv.ici.arq.spotify.demo.controller.dto.TrackDTO;
import cl.uv.ici.arq.spotify.demo.controller.service.TrackService;
import cl.uv.ici.arq.spotify.demo.entities.TrackEntity;
import cl.uv.ici.arq.spotify.demo.mapper.MapperUtils;
import cl.uv.ici.arq.spotify.demo.repository.TrackRepository;

@Service("trackService")
public class TrackServiceImpl implements TrackService {
	
	@Autowired
	TrackRepository trackRepository;
	
	private TrackEntity mapUserEntity(TrackDTO trackDTO) {
		TrackEntity track = new TrackEntity();
		
		track.setDuration(trackDTO.getDuration());
		track.setTitle(trackDTO.getTitle());

		return track;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<TrackDTO> getTracks(Integer offset, Integer limit) {
		
		/*List<TrackDTO> tracks_filtered = new ArrayList<TrackDTO>();
		
		for (int index = 0; index < this.tracks.size(); index++) {
			if(tracks_filtered.size() != limit & index >= offset) {
				tracks_filtered.add(this.tracks.get(index));
			}
		}
		
		return tracks_filtered;*/
		return (List<TrackDTO>) MapperUtils.mapAsList(trackRepository.findAll(), new TypeToken<List<TrackDTO>>() {}.getType());
	}
	
	
	@Override
	public TrackDTO createTrack(TrackDTO trackDTO) {
		TrackEntity trackEntity = this.mapUserEntity(trackDTO);
		trackEntity = this.trackRepository.save(trackEntity);
		trackDTO = (TrackDTO) MapperUtils.map(trackEntity, TrackDTO.class);
		return trackDTO;
	}
	
	@Override
	public TrackDTO getById(String idTrack) {
		return (TrackDTO) MapperUtils.map(this.trackRepository.findById(UUID.fromString(idTrack)).get(), TrackDTO.class);
	}
	@Override
	public boolean delete(String trackId) {
		boolean delete=true;		
		this.trackRepository.deleteById(UUID.fromString(trackId));		
		return delete;
	}
	
	@Override
	public TrackDTO update(TrackDTO trackDTO) {
		TrackEntity trackEntity = this.mapUserEntity(trackDTO);
		trackEntity.setTrackId(UUID.fromString(trackDTO.getId()));
		trackEntity = this.trackRepository.save(trackEntity);
		trackDTO = (TrackDTO) MapperUtils.map(trackEntity, TrackDTO.class);
		return trackDTO;
	}
}