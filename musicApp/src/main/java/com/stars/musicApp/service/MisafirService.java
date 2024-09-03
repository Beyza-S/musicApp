package com.stars.musicApp.service;

import com.stars.musicApp.entity.Misafir;

import java.util.List;

public interface MisafirService {

    List<Misafir> findAll();

    Misafir findById(int theId);

    Misafir save(Misafir theMisafir);

    void delete(int theId);
}
