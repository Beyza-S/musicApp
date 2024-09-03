package com.stars.musicApp.service;

import com.stars.musicApp.entity.Sepet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SepetServiceImpl implements SepetService {

    @Override
    public List<Sepet> findAll() {
        return List.of();
    }

    @Override
    public Sepet findById(int theId) {
        return null;
    }

    @Override
    public Sepet save(Sepet theSepet) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
