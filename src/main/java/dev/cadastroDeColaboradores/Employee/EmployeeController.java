package dev.cadastroDeColaboradores.Employee;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private EmployeeService empService;

    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }

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
    public List<EmployeeModel> listarEmployee() {
        return empService.listarEmployee();
    }


    // Procurar Employee por ID (READ)
    @GetMapping("/listar/{id}")
    public EmployeeModel listarEmployeeID(@PathVariable Long id) {
        return empService.listarEmployeeID(id);
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
