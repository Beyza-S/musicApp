package com.stars.musicApp.dao;

import com.stars.musicApp.entity.Roller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RollerRepository extends JpaRepository<Roller, Integer> {
}
