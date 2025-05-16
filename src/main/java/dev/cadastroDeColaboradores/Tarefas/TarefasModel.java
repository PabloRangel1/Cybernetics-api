package dev.cadastroDeColaboradores.Tarefas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.cadastroDeColaboradores.Employee.EmployeeModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tb_tarefas")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDaTarefa;
    private String responsavel;
    // @OneToMany Uma tarefa pode ter varios funcionarios

        @OneToMany(mappedBy = "tarefas") // tarefas é o nome do atributo na EmployeeModel
        @JsonIgnore
        private List<EmployeeModel> emp;

}
