package com.stars.musicApp.service;

import com.stars.musicApp.entity.Uye;

import java.util.List;

public interface UyeService {
    List<Uye> findAll();

    Uye findById(int theId);

    Uye save(Uye theUye);

    void delete(int theId);
}
