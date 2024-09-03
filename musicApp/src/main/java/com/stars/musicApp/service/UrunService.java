package com.stars.musicApp.service;

import com.stars.musicApp.entity.Urun;

import java.util.List;

public interface UrunService {

    List<Urun> findAll();

    Urun findById(int theId);

    Urun save(Urun theUrun);

    void delete(int theId);
}
