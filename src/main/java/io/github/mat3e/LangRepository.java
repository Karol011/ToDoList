package io.github.mat3e;


import lombok.Getter;

import java.util.List;
import java.util.Optional;

@Getter
public class LangRepository {

    List<Lang> findAll() {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.createQuery("FROM Lang", Lang.class).list();
        transaction.commit();
        session.close();
        return result;
    }

    Optional<Lang> findById(Integer id) {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.get(Lang.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }
}
