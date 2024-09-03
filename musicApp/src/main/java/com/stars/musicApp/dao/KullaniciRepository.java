package com.stars.musicApp.dao;

import com.stars.musicApp.entity.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepository extends JpaRepository <Kullanici, Integer>{
}
