package tech.gabrieloliveira.tecback.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Assinatura {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuarios usuarios;


    @Column(nullable = false, length = 100)

    @Past
    private LocalDate dataInicio;
    @Future
    private LocalDate dataFim;

    private TipoPlano tipoPlano;
    private boolean ativa;

    @NotNull
    private String metodoPagamento;
    @CreditCardNumber
    private String numeroCartaoCredito;
    @ManyToOne
    private Filme filme;
    @ManyToOne
    private Series series;
}
