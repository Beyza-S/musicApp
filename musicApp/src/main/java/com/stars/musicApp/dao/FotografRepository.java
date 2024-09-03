package com.stars.musicApp.dao;

import com.stars.musicApp.entity.Fotograf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotografRepository extends JpaRepository<Fotograf, Integer> {
}
