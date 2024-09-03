package com.stars.musicApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "urun")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Urun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "ad")
    private String ad;

    @Column(name = "fiyat")
    private int fiyat;

    @ManyToOne
    @JoinColumn(name = "grup_id")
    private Grup grup;

    @OneToMany(mappedBy = "urun", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<SepetUrun> sepetUrunler = new LinkedHashSet<>();
}
