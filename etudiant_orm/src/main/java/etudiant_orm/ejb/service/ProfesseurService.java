package etudiant_orm.ejb.service;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import etudiant_orm.Professeur;
import etudiant_orm.ejb.dao.ProfesseurDAO;

@Stateless
public class ProfesseurService {
    @EJB
    private ProfesseurDAO professeurDAO;

    public Professeur create(Professeur professeur) {
        return professeurDAO.create(professeur);
    }

    public Professeur update(Professeur professeur) {
        return professeurDAO.update(professeur);
    }

    public void delete(long id) {
        professeurDAO.delete(id);
    }

    public Professeur findById(long id) {
        return professeurDAO.findById(id);
    }
}

// Repeat the same pattern for the other entities: Etudiant, Cours, Departement

