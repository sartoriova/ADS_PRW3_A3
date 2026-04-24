package br.edu.ifsp.prw3.prw3_2026_AP3.controller;

import br.edu.ifsp.prw3.prw3_2026_AP3.conserto.Conserto;
import br.edu.ifsp.prw3.prw3_2026_AP3.conserto.ConsertoRepository;
import br.edu.ifsp.prw3.prw3_2026_AP3.conserto.DadosCadastroConserto;
import br.edu.ifsp.prw3.prw3_2026_AP3.conserto.DadosListagemConserto;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("conserto")
public class ConsertoController {
    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroConserto dados) {
        repository.save(new Conserto(dados));
    }

    @GetMapping
    public Page<Conserto> listar(Pageable paginacao) {
        return repository.findAll(paginacao);
    }

    @GetMapping("algunsdados")
    public List<DadosListagemConserto> listarAlgunsDados() {
        return repository.findAll().stream().map(DadosListagemConserto::new).toList();
    }
}
