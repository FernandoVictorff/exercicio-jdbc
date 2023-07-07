package br.com.exercise.groupFive.dao;

import br.com.exercise.groupFive.conexaojdbc.SingleConnection;
import br.com.exercise.groupFive.dto.ProfessorDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

import static java.util.Objects.isNull;

public class ProfessorDAO {
	
	private static ProfessorDAO instance;
	private static final Logger LOGGER = LoggerFactory.getLogger(ProfessorDAO.class);

	private Connection connection;

	public static synchronized ProfessorDAO getInstance() {
		return isNull(instance) ? new ProfessorDAO() : instance;
	}

	private ProfessorDAO () {
		connection = SingleConnection.getConnection();
	}

	public void salvar (ProfessorDTO professorDTO) {
		try {
			String sql = (
				 """
				 INSERT INTO tb_professor 
				  (
					 nome, 
					 data_nascimento, 
					 carga_horaria, 
					 valor_hora, 
					 estrangeiro, 
					 horas_disponiveis, 
					 biografia, 
					 data_hora_cadastro
				  ) 
				 VALUES (?, ?, ?, ?, ?, ?, ?, ?)
				 """
			);
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setString(1, professorDTO.getNome());
			insert.setDate(2, Date.valueOf(professorDTO.getDataNascimento()));
			insert.setTime(3, Time.valueOf(professorDTO.getCargaHoraria()));
			insert.setDouble(4, professorDTO.getValorHora());
			insert.setBoolean(5, professorDTO.isEstrangeiro());
			insert.setInt(6, professorDTO.getHorasDisponiveis());
			insert.setString(7, professorDTO.getBiografia());
			insert.setTimestamp(8, Timestamp.valueOf(professorDTO.getDataHoraCadastro()));
			insert.execute();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		LOGGER.info("Dados inseridos na tabela!");
	}
}
