package tech.gabrieloliveira.tecback.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_Series")
@Entity
public class Series {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @Column(nullable = false, length = 100)
    private String titulo;
    @Column(nullable = false)
    private String descricao;
    @OneToMany(mappedBy = "series", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Temporada> temporadas;
    private String elenco;
    private int classificacao;
    private LocalDate anoLancamento;


}
