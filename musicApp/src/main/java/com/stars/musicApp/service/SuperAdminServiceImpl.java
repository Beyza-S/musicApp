package com.stars.musicApp.service;

import com.stars.musicApp.entity.SuperAdmin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperAdminServiceImpl implements SuperAdminService {

    @Override
    public List<SuperAdmin> findAll() {
        return List.of();
    }

    @Override
    public SuperAdmin findById(int theId) {
        return null;
    }

    @Override
    public SuperAdmin save(SuperAdmin theSuperAdmin) {
        return null;
    }

    @Override
    public void delete(int theId) {

    }
}
