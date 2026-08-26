package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasvindas")
    public String boasVindas (){
         return "Essda é minha primeir amensagem nessa rota";
    }

    @GetMapping("/todos")
    public List<NinjaModel> mostrarTodosNinja(){
        return ninjaService.listarNinjas();
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
