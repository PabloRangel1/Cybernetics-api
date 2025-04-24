package dev.cadastroDeColaboradores.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    //Chamadada do repository
    private EmployeeRepository empRepository;

    public EmployeeService(EmployeeRepository empRepository) {
        this.empRepository = empRepository;
    }

    //listar todos os meus Ninjas // puxando a variavel do repository
    public List<EmployeeModel>listarEmployee(){
        return empRepository.findAll();
    }

}
