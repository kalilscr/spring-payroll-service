package payroll.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import payroll.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}