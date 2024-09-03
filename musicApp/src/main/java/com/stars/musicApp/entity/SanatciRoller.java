package com.stars.musicApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sanatci_roller")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SanatciRoller {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;

        @ManyToOne
        @JoinColumn(name = "sanatci_id")
        private Sanatci sanatci;

        @ManyToOne
        @JoinColumn(name = "rol_id")
        private Roller roller;
}
