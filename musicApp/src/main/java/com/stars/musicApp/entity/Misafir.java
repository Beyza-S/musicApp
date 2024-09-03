package com.stars.musicApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "misafir")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Misafir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "kullanici_id")
    private Kullanici kullanici;
}
