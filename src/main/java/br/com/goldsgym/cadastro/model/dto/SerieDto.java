package br.com.goldsgym.cadastro.model.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SerieDto {

	private Long id;
	@NotEmpty
	@NotNull(message = "Type of serie cannot be empty.")
	private String serie;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
}
