package etudiant_orm.ejb.dao;

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import etudiant_orm.Cours;

@Stateless
public class CoursDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public Cours create(Cours Cours) {
        entityManager.persist(Cours);
        return Cours;
    }

    public Cours update(Cours Cours) {
        entityManager.merge(Cours);
        return Cours;
    }

    public void delete(long id) {
        Cours Cours = entityManager.find(Cours.class, id);
        if (Cours != null) {
            entityManager.remove(Cours);
        }
    }

    public Cours findById(long id) {
        return entityManager.find(Cours.class, id);
    }
}