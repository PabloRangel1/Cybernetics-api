package dev.cadastroDeColaboradores;

import jakarta.persistence.*;

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

    public EmployeeModel() {
    }

    public EmployeeModel(String nome, String cargo, String departamento, String dtAdmissao) {
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
        this.dtAdmissao = dtAdmissao;
    }


}
