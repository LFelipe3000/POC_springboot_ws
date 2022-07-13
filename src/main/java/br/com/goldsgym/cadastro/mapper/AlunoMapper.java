package br.com.goldsgym.cadastro.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.goldsgym.cadastro.model.Aluno;
import br.com.goldsgym.cadastro.model.dto.AlunoDto;

@Component
public class AlunoMapper {
	
	private final EnderecoMapper enderecoMapper;
	private final ProfessorMapper professorMapper;
	private final SerieMapper serieMapper;
 	public AlunoMapper (EnderecoMapper enderecoMapper,
						ProfessorMapper professorMapper,
						SerieMapper serieMapper) {
		this.enderecoMapper = enderecoMapper;
		this.professorMapper = professorMapper;
		this.serieMapper = serieMapper;
	}

	public AlunoDto toDto(Aluno aluno) {
		AlunoDto alunoDto = new AlunoDto();
		alunoDto.setId(aluno.getId());
		alunoDto.setNome(aluno.getNome());
		alunoDto.setCpf(aluno.getCpf());
		alunoDto.setTelefone(aluno.getTelefone());
		alunoDto.setEndereco(this.enderecoMapper.toDto(aluno.getEndereco()));
		alunoDto.setProfessor(this.professorMapper.toDto(aluno.getProfessor()));
		alunoDto.setSerie(this.serieMapper.toDto(aluno.getSerie()));
		return alunoDto;
	}
	
	public Aluno toEntity(AlunoDto alunoDto) {
		Aluno aluno = new Aluno();
		aluno.setId(alunoDto.getId());
		aluno.setNome(alunoDto.getNome());
		aluno.setCpf(alunoDto.getCpf());
		aluno.setTelefone(alunoDto.getTelefone());
		aluno.setEndereco(this.enderecoMapper.toEntity(alunoDto.getEndereco()));
		aluno.setProfessor(this.professorMapper.toEntity(alunoDto.getProfessor()));
		aluno.setSerie(this.serieMapper.toEntity(alunoDto.getSerie()));
		return aluno;
	}

	List<Aluno> toEntity(List<AlunoDto> alunosDto) {
		return alunosDto.stream()
						.map(alunoDto -> this.toEntity(alunoDto))
						.collect(Collectors.toList());
	}

	List<AlunoDto> toDto(List<Aluno> alunos) {
		return alunos.stream()
					 .map(aluno -> this.toDto(aluno))
					 .collect(Collectors.toList());
	}
}