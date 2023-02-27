package com.main.YemekPayCaseStudy.repo;

import com.main.YemekPayCaseStudy.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public interface ToDoRepository extends JpaRepository< ToDo, Integer > {

}