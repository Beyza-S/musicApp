package com.stars.musicApp.service;

import com.stars.musicApp.entity.Sepet;

import java.util.List;

public interface SepetService {

    List<Sepet> findAll();

    Sepet findById(int theId);

    Sepet save(Sepet theSepet);

    void delete(int theId);
}
