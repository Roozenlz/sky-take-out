package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    void save(EmployeeDTO employeeDTO);

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    PageResult<Employee> pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    int startOrStop(Integer status, Long id);

    Employee queryById(Long id);

    int update(EmployeeDTO employeeDTO);

}
