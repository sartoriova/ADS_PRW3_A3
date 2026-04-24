package br.edu.ifsp.prw3.prw3_2026_AP3.conserto;

import br.edu.ifsp.prw3.prw3_2026_AP3.mecanico.DadosMecanico;
import br.edu.ifsp.prw3.prw3_2026_AP3.veiculo.DadosVeiculo;

public record DadosCadastroConserto(String data_entrada, String data_saida, DadosMecanico mecanico, DadosVeiculo veiculo) {
}
