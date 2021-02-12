package com.techshard.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.Veicolo;
import com.techshard.graphql.service.VeicoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class VeicoloMutation implements GraphQLMutationResolver {

    @Autowired
    private VeicoloService vehicleService;

    public Veicolo createVeicolo(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createUnVeicolo(type, modelCode, brandName, launchDate);
    }
}
