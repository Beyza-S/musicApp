package com.stars.musicApp.service;

import com.stars.musicApp.entity.Fotograf;

import java.util.List;

public interface FotografService {

    List<Fotograf> findAll();

    Fotograf findById(int theId);

    Fotograf save(Fotograf theFotograf);

    void delete(int theId);


}
