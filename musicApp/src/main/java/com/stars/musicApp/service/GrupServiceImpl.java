package com.stars.musicApp.service;

import com.stars.musicApp.entity.Grup;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupServiceImpl implements GrupService {


    @Override
    public List<Grup> findAll() {
        return List.of();
    }

    @Override
    public Grup findById(int theId) {
        return null;
    }

    @Override
    public Grup save(Grup theGrup) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
