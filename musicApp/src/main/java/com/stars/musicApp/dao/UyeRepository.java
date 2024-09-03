package com.stars.musicApp.dao;

import com.stars.musicApp.entity.Uye;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UyeRepository extends JpaRepository<Uye,Integer> {
}
