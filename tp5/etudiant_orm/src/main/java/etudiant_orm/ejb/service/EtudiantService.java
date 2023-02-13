package etudiant_orm.ejb.service;



import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import etudiant_orm.Etudiant;
import etudiant_orm.ejb.dao.EtudiantDAO;

@Stateless
public class EtudiantService {
    @EJB
    private EtudiantDAO EtudiantDAO;

    public Etudiant create(Etudiant Etudiant) {
        return EtudiantDAO.create(Etudiant);
    }

    public Etudiant update(Etudiant Etudiant) {
        return EtudiantDAO.update(Etudiant);
    }

    public void delete(long id) {
        EtudiantDAO.delete(id);
    }

    public Etudiant findById(long id) {
        return EtudiantDAO.findById(id);
    }
}

// Repeat the same pattern for the other entities: Etudiant, Cours, Departement

