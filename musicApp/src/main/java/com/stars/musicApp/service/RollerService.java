package com.stars.musicApp.service;

import com.stars.musicApp.entity.Roller;

import java.util.List;

public interface RollerService {

    List<Roller> findAll();

    Roller findById(int theId);

    Roller save(Roller theRoller);

    void delete(int theId);


}
