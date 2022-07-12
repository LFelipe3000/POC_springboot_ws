package br.com.goldsgym.cadastro.model.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EnderecoDto {

	private Long id;
	@NotNull @NotEmpty
	private String rua;
	@NotNull @NotEmpty
	private int numero;
	@NotNull @NotEmpty
	private String complemento;
	@NotNull @NotEmpty
	private String cep;
	
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
