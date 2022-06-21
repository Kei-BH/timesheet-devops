package tn.esprit.spring.services.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repositories.EntrepriseRepository;
import tn.esprit.spring.services.IEntrepriseService;


@Service
public class EntrepriseServiceImpl implements IEntrepriseService{

	@Override
	public List<Entreprise> retrieveAllEntreprises() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entreprise addEntreprise(Entreprise u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntreprise(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Entreprise updateEntreprise(Entreprise u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entreprise retrieveEntreprise(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
