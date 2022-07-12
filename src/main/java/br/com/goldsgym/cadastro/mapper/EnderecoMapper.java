package br.com.goldsgym.cadastro.mapper;

import org.springframework.stereotype.Component;

import br.com.goldsgym.cadastro.model.Endereco;
import br.com.goldsgym.cadastro.model.dto.EnderecoDto;

@Component
public class EnderecoMapper {

	public EnderecoDto toDto(Endereco endereco) {
		EnderecoDto enderecoDto = new EnderecoDto();
		enderecoDto.setId(endereco.getId());
		enderecoDto.setRua(endereco.getRua());
		enderecoDto.setNumero (endereco.getNumero());
		enderecoDto.setComplemento (endereco.getComplemento());
		enderecoDto.setCep (endereco.getCep());
		return enderecoDto;
	}

	public Endereco toEntity(EnderecoDto enderecoDto) {
		Endereco endereco = new Endereco();
		endereco.setId(enderecoDto.getId());
		endereco.setRua(enderecoDto.getRua());
		endereco.setNumero (enderecoDto.getNumero());
		endereco.setComplemento (enderecoDto.getComplemento());
		endereco.setCep (enderecoDto.getCep());
		return endereco;
	}
	
}
