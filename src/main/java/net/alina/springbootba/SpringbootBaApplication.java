package net.alina.springbootba;

import net.alina.springbootba.model.Employee;
import net.alina.springbootba.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBaApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFirstName("Andreea");
		employee.setLastName("Muresan");
		employee.setEmailId("andreeamuresan@qa.com.uk");
		employeeRepository.save(employee);


		Employee employee1=new Employee();
		employee1.setFirstName("Ramona");
		employee1.setLastName("Moldovean");
		employee1.setEmailId("ramonamoldovean@qa.com.uk");
		employeeRepository.save(employee1);









	}
}
