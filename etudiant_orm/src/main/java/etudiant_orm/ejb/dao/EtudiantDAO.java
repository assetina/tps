package etudiant_orm.ejb.dao;

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import etudiant_orm.Etudiant;

@Stateless
public class EtudiantDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public Etudiant create(Etudiant Etudiant) {
        entityManager.persist(Etudiant);
        return Etudiant;
    }

    public Etudiant update(Etudiant Etudiant) {
        entityManager.merge(Etudiant);
        return Etudiant;
    }

    public void delete(long id) {
        Etudiant Etudiant = entityManager.find(Etudiant.class, id);
        if (Etudiant != null) {
            entityManager.remove(Etudiant);
        }
    }

    public Etudiant findById(long id) {
        return entityManager.find(Etudiant.class, id);
    }
}