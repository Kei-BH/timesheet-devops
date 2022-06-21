package tn.esprit.spring;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@SpringBootTest
public class EntrepriseServiceImplTest {

	@Autowired
	IEntrepriseService entrepriseService;

	@Test
	void testRetreiveEntreprise() {
		Entreprise entreprise = new Entreprise();

		entreprise.setName("entreprise");
		entreprise.setRaisonSocial("raisonsocial");
		entreprise = entrepriseService.addEntreprise(entreprise);

		assertTrue(entrepriseService.retrieveEntreprise(entreprise.getId()) != null);
	}

}
