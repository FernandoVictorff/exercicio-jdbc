package testjdbc;

import br.com.exercise.groupFive.dao.ProfessorDAO;
import br.com.exercise.groupFive.dto.ProfessorDTO;
import org.junit.Test;

import java.time.LocalDateTime;

import static constants.TestConstants.*;

public class TestBancoJdbc {
	
	@Test
	public void initBanco() {
		ProfessorDAO professorDAO = ProfessorDAO.getInstance();
		professorDAO.salvar(
			ProfessorDTO.newBuilder()
				.nome(DEFAULT_PROFESSOR_NOME)
				.dataNascimento(DEFAULT_PROFESSOR_DATA_NASCIMENTO)
				.cargaHoraria(DEFAULT_PROFESSOR_CARGA_HORARIA)
				.valorHora(DEFAULT_PROFESSOR_VALOR_HORA)
				.estrangeiro(DEFAULT_PROFESSOR_IS_ESTRANGEIRO)
				.horasDisponiveis(DEFAULT_PROFESSOR_HORAS_DISPONIVEIS)
				.biografia(DEFAULT_PROFESSOR_BIOGRAFIA)
				.dataHoraCadastro(LocalDateTime.now())
				.build()
		);
	}
}
