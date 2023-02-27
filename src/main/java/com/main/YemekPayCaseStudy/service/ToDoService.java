package com.main.YemekPayCaseStudy.service;

import com.main.YemekPayCaseStudy.model.ToDo;
import com.main.YemekPayCaseStudy.repo.ToDoRepository;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.Transaction;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.service.spi.SessionFactoryServiceInitiator;
import org.springframework.cglib.proxy.Factory;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class ToDoService {

    private ToDoRepository repository;

    private EntityManager em;

    private EntityManagerFactory emf;

    public List< ToDo > getAll()
    {
        return repository.findAll();
    }

    public ToDo getById(Integer id) {
        return repository.findById(id).get();
    }

    public void deleteById(Integer ID) {
        repository.deleteById(ID);
    }

    public ToDo createToDo(ToDo toDo) {
        toDo.setTITLE(toDo.getTITLE());
        toDo.setDESCRIPTION(toDo.getDESCRIPTION());
        toDo.setCOMPLETED(false);
        toDo.setDUE_DATE(new Date());
        toDo = repository.save(toDo);

        return repository.findById(toDo.getID()).get();
    }

    /*public ToDo updateToDo(Integer id) {
        ToDo toDo = repository.findById(id).get();
        toDo.setTITLE(toDo.getTITLE());
        toDo.setDESCRIPTION(toDo.getDESCRIPTION());
        toDo.setCOMPLETED(toDo.getCOMPLETED());
        toDo.setDUE_DATE(toDo.getDUE_DATE());
        repository.save(toDo);

        return repository.findById(id).get();
    }*/
}
