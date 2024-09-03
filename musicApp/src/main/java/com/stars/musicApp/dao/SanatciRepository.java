package com.stars.musicApp.dao;

import com.stars.musicApp.entity.Sanatci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanatciRepository extends JpaRepository<Sanatci ,Integer> {
}
