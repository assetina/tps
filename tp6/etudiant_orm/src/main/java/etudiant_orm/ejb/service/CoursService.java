package etudiant_orm.ejb.service;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import etudiant_orm.Cours;
import etudiant_orm.ejb.dao.CoursDAO;

@Stateless
public class CoursService {
    @EJB
    private CoursDAO CoursDAO;

    public Cours create(Cours Cours) {
        return CoursDAO.create(Cours);
    }

    public Cours update(Cours Cours) {
        return CoursDAO.update(Cours);
    }

    public void delete(long id) {
        CoursDAO.delete(id);
    }

    public Cours findById(long id) {
        return CoursDAO.findById(id);
    }
}

// Repeat the same pattern for the other entities: Etudiant, Cours, Departement

