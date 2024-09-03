package com.stars.musicApp.dao;

import com.stars.musicApp.entity.Misafir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MisafirRepository extends JpaRepository<Misafir, Integer> {
}
