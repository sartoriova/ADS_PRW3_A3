package br.edu.ifsp.prw3.prw3_2026_AP3.veiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosVeiculo(
        @NotBlank
        String marca,

        @NotBlank
        String modelo,

        String cor,

        @NotBlank
        @Pattern(regexp = "^\\d{4}$")
        int ano
) {
}
