package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjasRepository extends JpaRepository<NinjaModel,Long> {
}
