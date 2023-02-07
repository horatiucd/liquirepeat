package com.hcd.liquirepeat.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "minifig")
@SequenceGenerator(sequenceName = "minifig_seq", name = "CUSTOM_SEQ_GENERATOR", initialValue = 1, allocationSize = 1)
@Data
public class Minifig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CUSTOM_SEQ_GENERATOR")
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    public Minifig() {

    }

    public Minifig(String name) {
        this.name = name;
    }
}
