package com.stars.musicApp.dao;

import com.stars.musicApp.entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrunRepository extends JpaRepository<Urun,Integer> {
}
