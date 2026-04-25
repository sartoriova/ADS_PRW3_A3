package br.edu.ifsp.prw3.prw3_2026_AP3.conserto;

import br.edu.ifsp.prw3.prw3_2026_AP3.mecanico.Mecanico;
import br.edu.ifsp.prw3.prw3_2026_AP3.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conserto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data_entrada;
    private String data_saida;
    private boolean ativo;

    @Embedded
    private Mecanico mecanico;

    @Embedded
    private Veiculo veiculo;

    public Conserto(DadosCadastroConserto dados) {
        this.data_entrada = dados.data_entrada();
        this.data_saida = dados.data_saida();
        this.ativo = true;
        this.mecanico = new Mecanico(dados.mecanico());
        this.veiculo = new Veiculo(dados.veiculo());
    }

    public void atualizarInformacoes(DadosAtualizacaoConserto dados) {
        if (dados.data_saida() != null) {
            this.data_saida = dados.data_saida();
        }

        if(dados.mecanico() != null) {
            this.mecanico.atualizarInformacoes(dados.mecanico());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
