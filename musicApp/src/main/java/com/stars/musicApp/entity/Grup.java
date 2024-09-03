package com.stars.musicApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "grup")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Grup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ad")
    private String ad;

    @Column(name = "cikis_yil")
    private int cikisYil;

    @ManyToOne
    @JoinColumn(name = "sanatci_id")
    private Sanatci sanatci;

    @OneToMany(mappedBy = "grup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Fotograf> fotograflar = new LinkedHashSet<>();

    @OneToMany(mappedBy = "grup", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Urun> urunler = new LinkedHashSet<>();
}
