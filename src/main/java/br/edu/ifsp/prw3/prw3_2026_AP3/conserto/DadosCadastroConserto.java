package br.edu.ifsp.prw3.prw3_2026_AP3.conserto;

import br.edu.ifsp.prw3.prw3_2026_AP3.mecanico.DadosMecanico;
import br.edu.ifsp.prw3.prw3_2026_AP3.veiculo.DadosVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroConserto(
        @NotBlank
        @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
        String data_entrada,

        @NotBlank
        @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$")
        String data_saida,

        @NotNull
        @Valid
        DadosMecanico mecanico,

        @NotNull
        @Valid
        DadosVeiculo veiculo
) {
}
