package com.stars.musicApp.service;

import com.stars.musicApp.entity.Fotograf;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FotografServiceImpl implements FotografService {

    @Override
    public List<Fotograf> findAll() {
        return List.of();
    }

    @Override
    public Fotograf findById(int theId) {
        return null;
    }

    @Override
    public Fotograf save(Fotograf theFotograf) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
