package tn.esprit.spring;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
//import tn.esprit.spring.payload.ContratPayload;
//import tn.esprit.spring.payload.EmployeePayload;
import tn.esprit.spring.services.ContratService;
import tn.esprit.spring.services.IEmployeService;

@SpringBootTest
public class ContratTest {
	@Autowired
	ContratService contratService;
	@Autowired
	IEmployeService employeService;

	@Test
	void testAddContrat() {
		Employe employe = new Employe();
		employe.setNom("Ghassen");
		employe.setPrenom("Zakraoui");
		employe.setEmail("ghassen.zakraoui2@esprit.tn");
		employe.setActif(true);
		employe = employeService.addEmploye(employe);

		
		Contrat c = new Contrat();
		c.setReference(3L);
		c.setSalaire(2500L);
		c.setTypeContrat("CDI");
		c.setDateDebut(new Date());
		Contrat contrat = contratService.addContrat(c);
		assertTrue(contrat != null);

	}

}
