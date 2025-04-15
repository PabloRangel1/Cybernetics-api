package dev.cadastroDeColaboradores.Employee;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar Employee (CREATE)
    @PostMapping("criar")
    public String criarEmployee() {
        return "Employee criado";
    }
    // Mostrar todos os Employee (READ)
    @GetMapping("/listar")
    public String mostrarTodosEmployee() {
        return "Mostrar todos Employee";
    }
    // Procurar Employee por ID (READ)
    @GetMapping("/listarID")
    public String mostrarTodosEmployeeID() {
        return "Mostrar employee por id";
    }
    // Alterar dados do Employee (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaID() {
            return "";
    }
    // Deletar Employee (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarEmployee() {
        return "Deletar employee";
    }

}
