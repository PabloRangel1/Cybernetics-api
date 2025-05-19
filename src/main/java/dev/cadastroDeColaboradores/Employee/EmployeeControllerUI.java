package dev.cadastroDeColaboradores.Employee;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/emp/ui")
public class EmployeeControllerUI {

    private final EmployeeService empService;


    public EmployeeControllerUI(EmployeeService employeeService) {
    this.empService = employeeService;
}

    @GetMapping("/adicionar")
    public String formularioEmployee(Model model) {
        model.addAttribute("employee", new EmployeeDTO());
        return "adicionarEmployee";
    }


    // Salva o novo employee
    @PostMapping
    public String salvarEmployee(@ModelAttribute("employee") EmployeeDTO employeeDTO,
                             RedirectAttributes redirectAttributes,
                             Model model) {
    try {
        empService.criarEmployee(employeeDTO);
        redirectAttributes.addFlashAttribute("mensagem", "Employee cadastrado com sucesso!");
    } catch (Exception e) {
        e.printStackTrace(); // mostra no console o erro real
        redirectAttributes.addFlashAttribute("mensagem", "Erro ao cadastrar: " + e.getMessage());
    }
    return "redirect:/emp/ui/adicionar";
}


    //localhost:8080/emp/ui/listar
    @GetMapping("/listar")
    public String listarEmployee(Model model) {
       List<EmployeeDTO> employees =  empService.listarEmployee();
       model.addAttribute("employees", employees);
       return "listarEmployees"; //retornar o nome da pagina que redenriza
    }

   @GetMapping("/listar/{id}")
    public String listarEmployeeID(@PathVariable Long id, Model model) {
    EmployeeDTO employeeDTO = empService.listarEmployeeID(id);

    if (employeeDTO != null) {
        model.addAttribute("employee", employeeDTO);
        return "detalhesEmployee";
    } else {
        return "redirect:/emp/ui/listar";
    }
}
    @GetMapping("/alterar/{id}")
    public String mostrarFormularioEdicao(@PathVariable Long id, Model model) {
    EmployeeDTO employeeDTO = empService.listarEmployeeID(id);
    if (employeeDTO != null) {
        model.addAttribute("employee", employeeDTO);
        return "editarEmployee"; // Novo template HTML para editar
    } else {
        return "redirect:/emp/ui/listar";
    }
}

    @PostMapping("/alterar/{id}")
    public String atualizarEmployee(@PathVariable Long id,
                                @ModelAttribute("employee") EmployeeDTO employeeDTO,
                                RedirectAttributes redirectAttributes) {
    try {
        empService.atualizarEmployee(id, employeeDTO);
        redirectAttributes.addFlashAttribute("mensagem", "Employee atualizado com sucesso!");
    } catch (Exception e) {
        e.printStackTrace();
        redirectAttributes.addFlashAttribute("mensagem", "Erro ao atualizar: " + e.getMessage());
    }
    return "redirect:/emp/ui/listar";
}

    @GetMapping("/deletar/{id}")
    public String deletarEmployeeID(@PathVariable Long id) {
        empService.deletarEmployeeID(id);
        return "redirect:/emp/ui/listar";
    }
}
