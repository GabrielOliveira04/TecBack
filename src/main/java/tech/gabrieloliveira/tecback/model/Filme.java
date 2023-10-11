package tech.gabrieloliveira.tecback.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_filme")
@Entity
public class Filme {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column(nullable = false,length = 100)
private String titulo;
@Column(nullable = false,length = 255)
private String descricao;
@Column(nullable = false)
private String genero;

private String elenco;


}
