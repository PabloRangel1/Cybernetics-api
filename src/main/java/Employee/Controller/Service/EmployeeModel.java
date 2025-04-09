package Employee.Controller.Service;

import Tarefas.TarefasModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
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

    public EmployeeModel() {
    }
    public EmployeeModel(String nome, String cargo, String departamento, String dtAdmissao) {
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
        this.dtAdmissao = dtAdmissao;
    }


}
