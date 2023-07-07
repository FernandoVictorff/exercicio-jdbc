package br.com.exercise.groupFive.conexaojdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;

import static br.com.exercise.groupFive.conexaojdbc.constantsDB.*;
import static java.util.Objects.isNull;

public class SingleConnection {

	private static final Logger LOGGER = LoggerFactory.getLogger(SingleConnection.class);
	private static Connection connection = null;

	static {
	    conectar();
	}
	
	public SingleConnection() {
		conectar();
	}
	
	private static void conectar() {
		try {			
			if (isNull(connection)) {
				Class.forName(DRIVER_CLASS_NAME);
				connection = DriverManager.getConnection(URL_CONNECTION, USER, PASSWORD);
				connection.setAutoCommit(false);
				LOGGER.info("Conectou no banco");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
}
