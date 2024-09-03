package com.stars.musicApp.dao;

import com.stars.musicApp.entity.Grup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupRepository extends JpaRepository<Grup, Integer> {
}
