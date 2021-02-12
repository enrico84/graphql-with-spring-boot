package com.techshard.graphql.dao.repository;

import com.techshard.graphql.dao.entity.Veicolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeicoloRepository extends JpaRepository<Veicolo, Integer> {
}
