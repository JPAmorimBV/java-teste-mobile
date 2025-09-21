package br.com.fiap.sprint3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_SPRINT3_MOTO")

@Getter
@Setter
@NoArgsConstructor
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm_placa", nullable = false, unique = true)
    private String placa;

    @Column(name = "ds_status", nullable = false)
    private String status;
    
    @ManyToOne
    @JoinColumn(name = "filial_id")
    private Filial filial;
}
