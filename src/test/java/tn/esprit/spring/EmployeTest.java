package tn.esprit.spring;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;

@SpringBootTest
public class EmployeTest {

	@Autowired
	IEmployeService iEmployeService;

	@Test
	void testRetrieveEmploye() {
		Employe employe = new Employe();
		employe.setNom("Ben Hamouda");
		employe.setPrenom("Khaled");
		employe.setEmail("khaled.benhamouda1a@esprit.tn");
		employe.setRole(Role.INGENIEUR);
		employe.setActif(true);
		employe = iEmployeService.addEmploye(employe);
		assertTrue(iEmployeService.retrieveEmploye(employe.getId()) != null);
	}

}