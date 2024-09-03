package com.stars.musicApp.dao;

import com.stars.musicApp.entity.Sepet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SepetRepository extends JpaRepository<Sepet,Integer> {
}
