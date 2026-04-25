package br.edu.ifsp.prw3.prw3_2026_AP3.mecanico;

import jakarta.validation.constraints.NotBlank;

public record DadosMecanico(
        @NotBlank
        String nome_mecanico,

        @NotBlank
        String anos_experiencia
) {
}
