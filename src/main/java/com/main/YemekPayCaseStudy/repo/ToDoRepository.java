package com.main.YemekPayCaseStudy.repo;

import com.main.YemekPayCaseStudy.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ToDoRepository extends JpaRepository< ToDo, Integer > {

//    @Query ("update ToDo set TITLE = :TITLE, COMPLETED = :COMPLETED, DESCRIPTION = :DESCRIPTION,  where ID = :ID")
//    void updateToDo(@Param("id") Long id);
}
