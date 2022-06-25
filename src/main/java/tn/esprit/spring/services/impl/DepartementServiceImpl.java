package tn.esprit.spring.services.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repositories.DepartementRepository;
import tn.esprit.spring.services.IDepartementService;


@Service
public class DepartementServiceImpl implements IDepartementService {

	@Autowired
	DepartementRepository departementRepository;

	private static final Logger l = LogManager.getLogger(DepartementServiceImpl.class);

	@Override
	public List<Departement> retrieveAllDepartements() {
		List<Departement> departements = null;
		try {
			l.info("In Method retrieveAllDepartements:");
			departements = (List<Departement>) departementRepository.findAll();
			l.debug("connexion à la DB Ok :");
			for (Departement Departement : departements) {
				l.debug("Departement :" + Departement.getName());
			}
			l.info("Out of Method retrieveAllDepartements with Success" + departements.size());
		} catch (Exception e) {
			l.error("Out of Method retrieveAllDepartements with Errors: " + e);
		}
		return departements;
	}

	@Override
	public Departement addDepartement(Departement departement) {
		Departement e_saved = null;
		try {
			l.info("In Method addDepartement:");
			e_saved = departementRepository.save(departement);
			l.info("Out of Method addDepartement with Success");
		} catch (Exception e) {
			l.error("Out of Method addDepartement with Errors: " + e);
		}
		return e_saved;
	}

	@Override
	public Departement updateDepartement(Departement departement) {
		Departement e_updated = null;
		try {
			l.info("In Method updateDepartement:");
			e_updated = departementRepository.save(departement);
			l.info("Out of Method updateDepartement with Success");
		} catch (Exception e) {
			l.error("Out of Method updateDepartement with Errors: " + e);
		}
		return e_updated;
	}

	@Override
	public void deleteDepartement(Long id) {
		try {
			l.info("In Method deleteDepartement:");
			departementRepository.deleteById(id);
			l.info("Out of Method deleteDepartement with Success");
		} catch (Exception e) {
			l.error("Out of Method deleteDepartement with Errors: " + e);
		}
	}

	@Override
	public Departement retrieveDepartement(Long id) {
		Departement departement = null;
		try {
			l.info("In Method retrieveDepartement:");
			departement = departementRepository.findById(id).get();
			l.info("Out of Method retrieveDepartement with Success");
		} catch (Exception e) {
			l.error("Out of Method retrieveDepartement with Errors: " + e);
		}
		return departement;
	}

}
