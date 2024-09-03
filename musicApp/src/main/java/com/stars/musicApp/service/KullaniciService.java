package com.stars.musicApp.service;

import com.stars.musicApp.entity.Kullanici;

import java.util.List;

public interface KullaniciService {

    List<Kullanici> findAll();

    Kullanici findById(int theId);

    Kullanici save(Kullanici theKullanici);

    void delete(int theId);


}
