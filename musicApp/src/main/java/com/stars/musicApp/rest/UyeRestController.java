package com.stars.musicApp.rest;

import com.stars.musicApp.dto.UyeDTO;
import com.stars.musicApp.entity.Uye;
import com.stars.musicApp.service.UyeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/uye")
public class UyeRestController {

    private final UyeService uyeService;
    private final ModelMapper modelMapper;


    @Autowired
    public UyeRestController(UyeService theUyeService, ModelMapper modelMapper) {
        this.uyeService = theUyeService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/create")
    public ResponseEntity<UyeDTO> createUye(@RequestBody UyeDTO uyeDTO) {

        Uye uye = modelMapper.map(uyeDTO, Uye.class);

        Uye kaydetUye = uyeService.save(uye);

        UyeDTO kaydetUyeDTO = modelMapper.map(kaydetUye, UyeDTO.class);

        return new ResponseEntity<>(kaydetUyeDTO, HttpStatus.CREATED);
    }
}

