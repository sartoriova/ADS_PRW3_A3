package br.edu.ifsp.prw3.prw3_2026_AP3.conserto;

import br.edu.ifsp.prw3.prw3_2026_AP3.mecanico.DadosMecanico;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoConserto(
        @NotNull
        Long id,

        String data_saida,

        DadosMecanico mecanico
) {
}
