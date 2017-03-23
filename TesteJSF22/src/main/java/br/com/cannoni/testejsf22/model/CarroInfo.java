package br.com.cannoni.testejsf22.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CarroInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String cor;
    
    @Column
    private Integer kilometragem;
    
    @OneToOne(optional = false)
    private Carro carro;
    
}
