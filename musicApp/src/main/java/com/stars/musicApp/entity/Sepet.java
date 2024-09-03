package com.stars.musicApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "sepet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sepet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "kullanici_id")
    private Kullanici kullanici;

    @OneToMany(mappedBy = "sepet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<SepetUrun> sepetUrunler = new LinkedHashSet<>();
}
