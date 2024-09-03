package com.stars.musicApp.service;

import com.stars.musicApp.entity.Misafir;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MisafirServiceImpl implements MisafirService {

    @Override
    public List<Misafir> findAll() {
        return List.of();
    }

    @Override
    public Misafir findById(int theId) {
        return null;
    }

    @Override
    public Misafir save(Misafir theMisafir) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
