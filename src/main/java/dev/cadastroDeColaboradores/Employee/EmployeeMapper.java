package dev.cadastroDeColaboradores.Employee;

import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

    public EmployeeModel map(EmployeeDTO employeeDTO) {

        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setId(employeeDTO.getId());
        employeeModel.setNome(employeeDTO.getNome());
        employeeModel.setEmail(employeeDTO.getEmail());
        employeeModel.setCargo(employeeDTO.getCargo());
        employeeModel.setTarefas(employeeDTO.getTarefas());
        employeeModel.setDepartamento(employeeDTO.getDepartamento());

        return employeeModel;
    }

    public EmployeeDTO map(EmployeeModel employeeModel) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employeeModel.getId());
        employeeDTO.setNome(employeeModel.getNome());
        employeeDTO.setEmail(employeeModel.getEmail());
        employeeDTO.setCargo(employeeModel.getCargo());
        employeeDTO.setTarefas(employeeModel.getTarefas());
        employeeDTO.setDepartamento(employeeModel.getDepartamento());
        return employeeDTO;
    }

}
