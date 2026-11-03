package com.mx.cbtis.gestor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class Ejercicio5MyApiGestorApplicationTests {

	@Test
	@DisplayName("Smoke Test: Valida que la aplicacion inicialice su clase principal")
	void contextLoads() {
		Ejercicio5MyApiGestorApplication app = new Ejercicio5MyApiGestorApplication();
		assertNotNull(app);
	}

}
