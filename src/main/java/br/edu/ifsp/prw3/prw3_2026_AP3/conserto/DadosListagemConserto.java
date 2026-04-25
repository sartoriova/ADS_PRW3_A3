package br.edu.ifsp.prw3.prw3_2026_AP3.conserto;

public record DadosListagemConserto(Long id,
                                    String data_entrada,
                                    String data_saida,
                                    String nome_mecanico,
                                    String marca,
                                    String modelo) {
    public DadosListagemConserto(Conserto conserto) {

        this(
                conserto.getId(),
                conserto.getData_entrada(),
                conserto.getData_saida(),
                conserto.getMecanico().getNome_mecanico(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo()
        );
    }
}
