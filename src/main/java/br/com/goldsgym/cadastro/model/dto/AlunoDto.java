package br.com.goldsgym.cadastro.model.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class AlunoDto {

	private Long id;
	@NotEmpty
	@NotNull(message = "Name cannot be empty.")
	@Length(min = 3, message = "Minimum of 3 characters")
	@Length(max = 15, message = "Cannot exceed 15 characters")
	private String nome;
	@NotNull
	@NotEmpty
	private String cpf;
	@NotNull
	@NotEmpty
	private String telefone;
	@NotNull
	private EnderecoDto enderecoDto;
	@NotNull
	private ProfessorDto professorDto;
	@NotNull
	private SerieDto serieDto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EnderecoDto getEndereco() {
		return enderecoDto;
	}

	public void setEndereco(EnderecoDto enderecoDto) {
		this.enderecoDto = enderecoDto;
	}
	
	public ProfessorDto getProfessor() {
		return professorDto;
	}

	public void setProfessor(ProfessorDto professorDto) {
		this.professorDto = professorDto;
	}
	
	public SerieDto getSerie() {
		return serieDto;
	}

	public void setSerie(SerieDto serieDto) {
		this.serieDto = serieDto;
	}
}