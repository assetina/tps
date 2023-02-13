package Departement_orm.ejb.service;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Departement_orm.Departement;
import Departement_orm.ejb.dao.DepartementDAO;

@Stateless
public class DepartementService {
    @EJB
    private DepartementService DepartementDAO;

    public Departement create(Departement Departement) {
        return DepartementDAO.create(Departement);
    }

    public Departement update(Departement Departement) {
        return DepartementDAO.update(Departement);
    }

    public void delete(long id) {
        DepartementDAO.delete(id);
    }

    public Departement findById(long id) {
        return DepartementDAO.findById(id);
    }
}

// Repeat the same pattern for the other entities: Departement, Cours, Departement

