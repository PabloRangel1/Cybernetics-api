package dev.cadastroDeColaboradores.Employee;

import dev.cadastroDeColaboradores.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    // colocando a coluna de email como unica
    @Column(unique = true)
    private String email;

    @Column(name = "cargo")
    private String cargo;



    // @ManyToOne um empregado tem uma única tarefa
    @ManyToOne
    @JoinColumn(name = "tarefas_id") // FK do banco
    private TarefasModel tarefas;

}
