package com.stars.musicApp.service;

import com.stars.musicApp.entity.Urun;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrunServiceImpl implements UrunService {

    @Override
    public List<Urun> findAll() {
        return List.of();
    }

    @Override
    public Urun findById(int theId) {
        return null;
    }

    @Override
    public Urun save(Urun theUrun) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
