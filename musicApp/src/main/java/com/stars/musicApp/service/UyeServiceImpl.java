package com.stars.musicApp.service;

import com.stars.musicApp.dao.UyeRepository;
import com.stars.musicApp.entity.Uye;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class UyeServiceImpl  implements UyeService{


    private final UyeRepository uyeRepository;

    @Autowired
    public UyeServiceImpl(UyeRepository uyeRepository) {
        this.uyeRepository = uyeRepository;
    }

    @Override
    public List<Uye> findAll() {
        return uyeRepository.findAll();
    }

    @Override
    public Uye findById(int theId) {
        Optional<Uye> result = uyeRepository.findById(theId);

        Uye theUye = null;

        if (result.isPresent()) {
            theUye = result.get();
        } else {

            throw new RuntimeException("İlgili ID ile üye bulunamadı - " + theId);
        }

        return theUye;
    }

    @Override
    public Uye save(Uye theUye) {
        return uyeRepository.save(theUye);
    }

    @Override
    public void delete(int theId) {
        uyeRepository.deleteById(theId);
    }
}
