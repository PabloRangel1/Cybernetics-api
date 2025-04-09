package Tarefas;

import Employee.Controller.Service.EmployeeModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_tarefas")
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaTarefa;
    private String categoria;
    private String responsavel;
    // @OneToMany Uma tarefa pode ter varios funcionarios
    @OneToMany(mappedBy = "tarefas")
    private List<EmployeeModel> emp;


}
