package br.com.goldsgym.cadastro.mapper;

import org.springframework.stereotype.Component;

import br.com.goldsgym.cadastro.model.Serie;
import br.com.goldsgym.cadastro.model.dto.SerieDto;

@Component
public class SerieMapper {
	
	public SerieDto toDto(Serie serie) {
		SerieDto serieDto = new SerieDto();
		serieDto.setId(serie.getId());
		serieDto.setSerie(serie.getSerie());
		return serieDto;
	}

	public Serie toEntity(SerieDto serieDto) {
		Serie serie = new Serie();
		serie.setId(serieDto.getId());
		serie.setSerie(serieDto.getSerie());
		return serie;
	}
}
