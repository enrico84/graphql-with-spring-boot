package com.techshard.graphql.service;

import com.techshard.graphql.dao.entity.Veicolo;
import com.techshard.graphql.dao.repository.VeicoloRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeicoloService {

    private final VeicoloRepository vehicleRepository ;

    public VeicoloService(final VeicoloRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository ;
    }

    @Transactional
    public Veicolo createUnVeicolo(final String type,final String modelCode, final String brandName, final String launchDate) {
        final Veicolo vehicle = new Veicolo();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return this.vehicleRepository.save(vehicle);
    }

    @Transactional(readOnly = true)
    public List<Veicolo> getAllVeicoli(final int count) {
        return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Veicolo> getOneVeicolo(final int id) {
        return this.vehicleRepository.findById(id);
    }
}
