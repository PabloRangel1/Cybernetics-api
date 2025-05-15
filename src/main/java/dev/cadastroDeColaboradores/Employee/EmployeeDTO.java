package dev.cadastroDeColaboradores.Employee;

import dev.cadastroDeColaboradores.Tarefas.TarefasModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id;
    private String nome;
    private String email;
    private String cargo;
    private TarefasModel tarefas;
    private String departamento;
}
