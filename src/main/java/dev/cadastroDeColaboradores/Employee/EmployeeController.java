package dev.cadastroDeColaboradores.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    private final EmployeeService empService;

    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar Employee (CREATE)
    @PostMapping("/criar")
    public ResponseEntity<String> criarEmployee(@RequestBody EmployeeDTO employee) {
        EmployeeDTO novoEmp =  empService.criarEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Employee criado com sucesso: " + novoEmp.getNome() + "(ID): " + novoEmp.getId());
    }

    // Mostrar todos os Employee (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<EmployeeDTO>> listarEmployee() {
       List<EmployeeDTO> employees =  empService.listarEmployee();
       return ResponseEntity.ok(employees);
    }


    // Procurar Employee por ID (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarEmployeeID(@PathVariable Long id) {
       EmployeeDTO employeeDTO =  empService.listarEmployeeID(id);
       if(employeeDTO != null){
          return ResponseEntity.ok(employeeDTO);
       }else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND)
                   .body("Employee com id " + id + " não existe no nossos registros");
       }
    }

    // Alterar dados do Employee (UPDATE)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarEmployeeID(@PathVariable Long id, @RequestBody EmployeeDTO employeeAtualizado) {

        EmployeeDTO employee =  empService.atualizarEmployee(id, employeeAtualizado);
        if(employee != null){
            return ResponseEntity.ok(employee);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Employee com id " + id + " não existe no nossos registros");
        }
    }

    // Deletar Employee (DELETE)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarEmployeeID(@PathVariable Long id) {
        if (empService.listarEmployeeID(id) != null) {
            empService.deletarEmployeeID(id);
            return ResponseEntity.ok("Employee com o ID: " + id + " Employee Deletado com sucesso");
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O employee de ID: " + id + " não foi encontrado");
        }
    }

}
