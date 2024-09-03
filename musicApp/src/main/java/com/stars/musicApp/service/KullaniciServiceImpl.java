package com.stars.musicApp.service;

import com.stars.musicApp.entity.Kullanici;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KullaniciServiceImpl implements KullaniciService {

    @Override
    public List<Kullanici> findAll() {
        return List.of();
    }

    @Override
    public Kullanici findById(int theId) {
        return null;
    }

    @Override
    public Kullanici save(Kullanici theKullanici) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
