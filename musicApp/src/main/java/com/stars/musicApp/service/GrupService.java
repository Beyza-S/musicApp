package com.stars.musicApp.service;

import com.stars.musicApp.entity.Grup;

import java.util.List;

public interface GrupService {

    List<Grup> findAll();

    Grup findById(int theId);

    Grup save(Grup theGrup);

    void delete(int theId);
}
