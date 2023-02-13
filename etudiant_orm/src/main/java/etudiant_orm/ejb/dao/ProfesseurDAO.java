package etudiant_orm.ejb.dao;

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import etudiant_orm.Professeur;

@Stateless
public class ProfesseurDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public Professeur create(Professeur professeur) {
        entityManager.persist(professeur);
        return professeur;
    }

    public Professeur update(Professeur professeur) {
        entityManager.merge(professeur);
        return professeur;
    }

    public void delete(long id) {
        Professeur professeur = entityManager.find(Professeur.class, id);
        if (professeur != null) {
            entityManager.remove(professeur);
        }
    }

    public Professeur findById(long id) {
        return entityManager.find(Professeur.class, id);
    }
}