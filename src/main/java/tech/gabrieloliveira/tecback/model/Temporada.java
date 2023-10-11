package tech.gabrieloliveira.tecback.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int numero;
    private String descricao;
    private int totalEpsodios;
    @ManyToOne
    private Series series;

}
