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
    @PostMapping("/criar")
    public EmployeeDTO criarEmployee(@RequestBody EmployeeDTO employee) {
        return empService.criarEmployee(employee);
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
    @PutMapping("/alterar/{id}")
    public EmployeeModel alterarNinjaID(@PathVariable Long id, @RequestBody EmployeeModel employeeAtualizado) {
        return empService.atualizarNinja(id, employeeAtualizado);
    }

    // Deletar Employee (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarEmployeeID(@PathVariable Long id) {
        empService.deletarEmployeeID(id);
    }

}
