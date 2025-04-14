package dev.cadastroDeColaboradores.Tarefas;

import dev.cadastroDeColaboradores.Employee.EmployeeModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_tarefas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaTarefa;
    private String responsavel;
    // @OneToMany Uma tarefa pode ter varios funcionarios

    @OneToMany(mappedBy = "tarefas") // tarefas é o nome do atributo na EmployeeModel
    private List<EmployeeModel> emp;

}
