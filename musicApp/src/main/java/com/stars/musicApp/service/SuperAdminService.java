package com.stars.musicApp.service;

import com.stars.musicApp.entity.SuperAdmin;

import java.util.List;

public interface SuperAdminService {
    List<SuperAdmin> findAll();

    SuperAdmin findById(int theId);

    SuperAdmin save(SuperAdmin theSuperAdmin);

    void delete(int theId);
}
