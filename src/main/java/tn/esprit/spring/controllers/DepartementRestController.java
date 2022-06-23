package tn.esprit.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;

@RestController
public class DepartementRestController {
	
	@Autowired
	private IDepartementService iDepartementService;

	@GetMapping("/retrieve-all-departements")
	public List<Departement> retrieveAllDepartements() {
		List<Departement> list = iDepartementService.retrieveAllDepartements();
		return list;
	}

	@GetMapping("/retrieve-departement/{departement-id}")
	public Departement retrieveDepartement(@PathVariable("departement-id") Long departementId) {
		return iDepartementService.retrieveDepartement(departementId);
	}

	@PostMapping("/add-departement")
	public Departement addDepartement(@RequestBody Departement e) {
		Departement Departement = iDepartementService.addDepartement(e);
		return Departement;
	}

	@DeleteMapping("/remove-departement/{departement-id}")
	public void removeDepartement(@PathVariable("departement-id") Long departementId) {
		iDepartementService.deleteDepartement(departementId);
	}

	@PutMapping("/modify-departement")
	public Departement updateDepartement(@RequestBody Departement departement) {
		return iDepartementService.updateDepartement(departement);
	}	
}
