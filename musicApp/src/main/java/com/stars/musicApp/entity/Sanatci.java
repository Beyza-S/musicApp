package com.stars.musicApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sanatci")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sanatci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ad")
    private String ad;

    @Column(name = "soyad")
    private String soyad;

    @Column(name = "dogum_yil")
    private int dogumYil;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Roller rol;
}
