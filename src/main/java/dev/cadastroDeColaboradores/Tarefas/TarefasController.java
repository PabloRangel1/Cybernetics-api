package dev.cadastroDeColaboradores.Tarefas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tarefas")
public class TarefasController {
    // LOCALHOST:8080/tarefas/crud <-"controller"

    @GetMapping("/listar")
    public String listarTarefa() {
        return "Missoes listadas";
    }

    @PostMapping("/criar") //Envio da infos
    public String criarTarefa() {
        return "Tarefa criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarTarefa() {
        return "Tarefa atualizada";
    }

    @DeleteMapping("deletar")
    public String deletar() {
        return "Tarefa deletada";
    }


}
