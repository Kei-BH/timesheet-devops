package tn.esprit.spring;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IDepartementService;


@SpringBootTest
public class DepartementTest {

	@Autowired
	IDepartementService iDepartementService;

	@Test
	void testRetrieveDepartement() {
		Departement departement = new Departement();
		departement.setName("Informatique");
		departement = iDepartementService.addDepartement(departement);
		assertTrue(iDepartementService.retrieveDepartement(departement.getId()) != null);
	}

}