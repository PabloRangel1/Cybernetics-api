package dev.cadastroDeColaboradores.Tarefas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tarefas")
public class TarefasController {
    // LOCALHOST:8080/tarefas/crud <-"controller"

    @GetMapping("/listar") //Faz um read das nossas infos que vao vir de uma LIST
    public String listarTarefa() {
        return "Missoes listadas";
    }

    @PostMapping("/criar") //Envio da infos
    public String criarTarefa() {
        return "Tarefa criada com sucesso";
    }

    @PutMapping("/alterar") // altera nossas tarefas
    public String alterarTarefa() {
        return "Tarefa atualizada";
    }

    @DeleteMapping("deletar") // deletaa uma tarefa
    public String deletar() {
        return "Tarefa deletada";
    }


}
