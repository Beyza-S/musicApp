package com.stars.musicApp.service;

import com.stars.musicApp.entity.Roller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RollerServiceImpl implements RollerService {

    @Override
    public List<Roller> findAll() {
        return List.of();
    }

    @Override
    public Roller findById(int theId) {
        return null;
    }

    @Override
    public Roller save(Roller theRoller) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
