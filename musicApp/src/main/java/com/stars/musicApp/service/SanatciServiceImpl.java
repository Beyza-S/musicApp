package com.stars.musicApp.service;

import com.stars.musicApp.entity.Sanatci;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanatciServiceImpl implements SanatciService {

    @Override
    public List<Sanatci> findAll() {
        return List.of();
    }

    @Override
    public Sanatci findById(int theId) {
        return null;
    }

    @Override
    public Sanatci save(Sanatci theSanatci) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
