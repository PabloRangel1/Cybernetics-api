package dev.cadastroDeColaboradores.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    //Chamadada do repository
    private final  EmployeeRepository empRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository empRepository, EmployeeMapper empMapper) {
        this.empRepository = empRepository;
        this.employeeMapper= empMapper;
    }

    //listar todos os meus Ninjas // puxando a variavel do repository
    public List<EmployeeDTO>listarEmployee(){
       List<EmployeeModel> emp = empRepository.findAll();
       return emp.stream()
               .map(employeeMapper::map)
               .collect(Collectors.toList());
    }

    // Listar todos meus ninjas por ID
    public EmployeeDTO listarEmployeeID(Long id ){
        Optional<EmployeeModel> empPorId = empRepository.findById(id);
        return empPorId.map(employeeMapper::map).orElse(null);
    }

    // Criar um novo Employee
    public EmployeeDTO criarEmployee(EmployeeDTO employeeDTO){
        EmployeeModel emp  = employeeMapper.map(employeeDTO); // Conversão de DTO para Model
        emp = empRepository.save(emp); // Salva no banco de dados
        return employeeMapper.map(emp); // RETORNA -> um dto novamente
    }

    // Atualizar Employee
    public EmployeeDTO atualizarEmployee(Long id, EmployeeDTO employeeDTO){
        Optional<EmployeeModel> empExistente = empRepository.findById(id);
        if (empExistente.isPresent()) {
            EmployeeModel empAtualizado = employeeMapper.map(employeeDTO);
            empAtualizado.setId(id);
            EmployeeModel empSalvo = empRepository.save(empAtualizado);
            return employeeMapper.map(empSalvo);
        }
        return null;
    }

    // Deletar o Employee -> Void
        public void deletarEmployeeID(Long id){
        empRepository.deleteById(id);
    }




}