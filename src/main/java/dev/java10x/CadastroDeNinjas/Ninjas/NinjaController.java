package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas (){
         return "Essda é minha primeir amensagem nessa rota";
    }

    @GetMapping("/todos")
    public String mostrarTodosNinja(){
        return "Todos";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Criando";
    }

    @PutMapping("/alteraID")
        public String alterarNinjaporID() {
            return "Alterar ninja por id";
        }

    @DeleteMapping("/deletarID")
    public String deletarNinjaporID() {
        return "Deletar ninja por id";
    }

}
