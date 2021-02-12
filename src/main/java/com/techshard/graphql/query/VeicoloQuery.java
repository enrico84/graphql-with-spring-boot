package com.techshard.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.techshard.graphql.dao.entity.Veicolo;
import com.techshard.graphql.service.VeicoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VeicoloQuery implements GraphQLQueryResolver {

    @Autowired
    private VeicoloService vehicleService;

    public List<Veicolo> getVeicoli(final int count) {
        return this.vehicleService.getAllVeicoli(count);
    }

    public Optional<Veicolo> getVeicolo(final int id) {
        return this.vehicleService.getOneVeicolo(id);
    }
}
