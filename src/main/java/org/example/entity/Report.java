package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import org.example.base.BaseEntity;

import java.io.Serializable;

@Entity
public class Report<ID extends Serializable,  E extends BaseEntity<ID>> extends BaseEntity<Long>{

    @ManyToOne
    E entity;

    @ManyToOne
    User user;

}
