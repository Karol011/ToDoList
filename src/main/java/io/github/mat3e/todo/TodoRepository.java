package io.github.mat3e.todo;



import io.github.mat3e.HibernateUtil;
import lombok.Getter;

import java.util.List;
import java.util.Optional;

@Getter
public class TodoRepository {

    public List<Todo> findAll() {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.createQuery("FROM Todo", Todo.class).list();
        transaction.commit();
        session.close();
        return result;
    }

    public Optional<Todo> findById(Integer id) {
        var session = HibernateUtil.getSessionFactory().openSession();
        var transaction = session.beginTransaction();
        var result = session.get(Todo.class, id);
        transaction.commit();
        session.close();
        return Optional.ofNullable(result);
    }
}
