package com.stars.musicApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sepet_urun")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SepetUrun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "urun_id")
    private Urun urun;

    @ManyToOne
    @JoinColumn(name = "sepet_id")
    private Sepet sepet;
}
