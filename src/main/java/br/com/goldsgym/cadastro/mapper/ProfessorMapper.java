package br.com.goldsgym.cadastro.mapper;

import org.springframework.stereotype.Component;

import br.com.goldsgym.cadastro.model.Professor;
import br.com.goldsgym.cadastro.model.dto.ProfessorDto;

@Component
public class ProfessorMapper {

	public ProfessorDto toDto(Professor professor) {
		ProfessorDto professorDto = new ProfessorDto();
		professorDto.setId(professor.getId());
		professorDto.setNome(professor.getNome());
		return professorDto;
	}
	
	public Professor toEntity(ProfessorDto professorDto) {
		Professor professor = new Professor();
		professor.setId(professorDto.getId());
		professor.setNome(professorDto.getNome());
		return professor;
	}
}