package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Departement;

public interface IDepartementService {
	List<Departement> retrieveAllDepartements(); 
	public Departement addDepartement(Departement dep);
	void deleteDepartement(Long id);
	Departement updateDepartement(Departement dep);
	Departement retrieveDepartement(Long id);
}
