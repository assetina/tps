package etudiant_orm.ejb.dao;

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import etudiant_orm.Departement;

@Stateless
public class DepartementDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public Departement create(Departement Departement) {
        entityManager.persist(Departement);
        return Departement;
    }

    public Departement update(Departement Departement) {
        entityManager.merge(Departement);
        return Departement;
    }

    public void delete(long id) {
        Departement Departement = entityManager.find(Departement.class, id);
        if (Departement != null) {
            entityManager.remove(Departement);
        }
    }

    public Departement findById(long id) {
        return entityManager.find(Departement.class, id);
    }
}