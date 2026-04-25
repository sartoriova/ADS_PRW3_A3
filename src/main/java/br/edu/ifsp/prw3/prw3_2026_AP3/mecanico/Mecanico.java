package br.edu.ifsp.prw3.prw3_2026_AP3.mecanico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {
    private String nome_mecanico;
    private String anos_experiencia;

    public Mecanico(DadosMecanico dados) {
        this.nome_mecanico = dados.nome_mecanico();
        this.anos_experiencia = dados.anos_experiencia();
    }

    public void atualizarInformacoes(DadosMecanico dados) {
        if (dados.nome_mecanico() != null) {
            this.nome_mecanico = dados.nome_mecanico();
        }

        if (dados.anos_experiencia() != null) {
            this.anos_experiencia = dados.anos_experiencia();
        }
    }
}
