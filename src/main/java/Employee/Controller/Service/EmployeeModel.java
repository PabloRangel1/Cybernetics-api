package Employee.Controller.Service;

import Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cargo;
    private String departamento;
    private String dtAdmissao;
    // @ManyToOne um empregado tem uma única tarefa
    @ManyToOne
    @JoinColumn(name = "tarefas_id")
    private TarefasModel tarefa;


}
