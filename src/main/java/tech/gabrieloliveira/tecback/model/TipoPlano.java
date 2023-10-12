package tech.gabrieloliveira.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@AllArgsConstructor
public enum TipoPlano {



    BASICO("Básico", 9.99),
    PADRAO("Padrão", 14.99),
    PREMIUM("Premium", 19.99);

    private final String descricao;
    private final double precoMensal;






}
