package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;


public interface ContratService {
	Contrat addContrat(Contrat contrat);
	Contrat updateContrat(Contrat contrat);
	void deleteContrat(Long id);
	List<Contrat> findAllContrats();
	Contrat findContratById(Long id);
}
