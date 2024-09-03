package com.stars.musicApp.service;

import com.stars.musicApp.entity.SanatciRoller;

import java.util.List;

public interface SanatciRollerService {
    List<SanatciRoller> findAll();

    SanatciRoller findById(int theId);

    SanatciRoller save(SanatciRoller theSanatciRoller);

    void delete(int theId);
}
