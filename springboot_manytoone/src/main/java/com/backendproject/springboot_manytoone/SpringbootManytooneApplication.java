package com.backendproject.springboot_manytoone;

import com.backendproject.springboot_manytoone.entity.Employee;
import com.backendproject.springboot_manytoone.entity.Item;
import com.backendproject.springboot_manytoone.repository.EmployeeRepository;
import com.backendproject.springboot_manytoone.repository.ItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringbootManytooneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=
				SpringApplication.run(SpringbootManytooneApplication.class, args);
		EmployeeRepository employeeRepository=configurableApplicationContext.getBean(EmployeeRepository.class);
		Employee employee=new Employee("praveen");
		Item item=new Item("E.C.R");
		Item item1=new Item("O.M.R");
		List<Item>items= Arrays.asList(item,item1);
		employee.setItems(items);
		employeeRepository.save(employee);


		}

	}


