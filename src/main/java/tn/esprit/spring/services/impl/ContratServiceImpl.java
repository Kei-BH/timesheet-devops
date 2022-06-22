package tn.esprit.spring.services.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repositories.ContratRepository;
import tn.esprit.spring.repositories.DepartementRepository;
import tn.esprit.spring.services.ContratService;
import tn.esprit.spring.services.IEmployeService;

@Service
public class ContratServiceImpl implements ContratService {
	private static final Logger logger = LogManager.getLogger(ContratServiceImpl.class);
	@Autowired
	private ContratRepository contratRepository;
	@Autowired
	private IEmployeService employeService;

	@Override
	public Contrat addContrat(Contrat c) {
		
			Contrat contrat= new Contrat();
			logger.info("start mapping process");
			contrat.setReference(c.getReference());
			contrat.setSalaire(c.getSalaire());
			contrat.setTypeContrat(c.getTypeContrat());
			contrat.setDateDebut(c.getDateDebut());
			logger.info("end mapping process");
			logger.info("save contrat");
		return contratRepository.save(contrat);
	}

	@Override
	public Contrat updateContrat(Contrat contrat) {
		return contratRepository.save(contrat);
	}

	@Override
	public void deleteContrat(Long id) {
		contratRepository.deleteById(id);
	}

	@Override
	public List<Contrat> findAllContrats() {
		return (List<Contrat>) contratRepository.findAll();
	}

	@Override
	public Contrat findContratById(Long id) {
		return contratRepository.findById(id).get();
	}

}
