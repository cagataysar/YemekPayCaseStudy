package com.main.YemekPayCaseStudy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SelectBeforeUpdate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SelectBeforeUpdate
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;

    @Column(nullable = false ,length = 50)
    private String TITLE;

    @Column(length = 255)
    private String DESCRIPTION;

    @Column(nullable = false)
    private Date DUE_DATE;

    @Column(nullable = false)
    private Boolean COMPLETED;
}
