package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/listar")
    public String mostrarTodasMissoes(){
        return "listar missoes";
}

    @PostMapping("/criar")
    public String criarMissao(){
        return "Criando";
    }

    @PutMapping("/alteraID")
    public String alterarMissaoporID() {
        return "Alterar missao por id";
    }

    @DeleteMapping("/deletarID")
    public String deletarMissaoporID() {
        return "Deletar missao por id";
    }

}
