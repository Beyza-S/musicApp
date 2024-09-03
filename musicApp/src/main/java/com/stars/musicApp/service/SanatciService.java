package com.stars.musicApp.service;

import com.stars.musicApp.entity.Sanatci;

import java.util.List;

public interface SanatciService {
    List<Sanatci> findAll();

    Sanatci findById(int theId);

    Sanatci save(Sanatci theSanatci);

    void delete(int theId);
}
