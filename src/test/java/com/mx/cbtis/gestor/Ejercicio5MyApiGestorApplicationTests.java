package com.mx.cbtis.gestor;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class Ejercicio5MyApiGestorApplicationTests {

	@MockBean
	private DataSource dataSource;

	@Test
	void contextLoads() {
	}

}
