package br.edu.ifsp.prw3.prw3_2026_AP3.conserto;

import br.edu.ifsp.prw3.prw3_2026_AP3.mecanico.Mecanico;
import br.edu.ifsp.prw3.prw3_2026_AP3.veiculo.Veiculo;

public record DadosDetalhamentoConserto(
        Long id,
        String data_entrada,
        String data_saida,
        Mecanico mecanico,
        Veiculo veiculo
) {
    public DadosDetalhamentoConserto (Conserto conserto) {
        this (
                conserto.getId(),
                conserto.getData_entrada(),
                conserto.getData_saida(),
                conserto.getMecanico(),
                conserto.getVeiculo()
        );
    }
}
