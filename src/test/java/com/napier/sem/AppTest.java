package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.Statement;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }


    @Test
    void printSalariesTestNull()
    {
        app.printSalaries(null);
    }

    @Test
    void printSalariesTestEmpty()
    {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        app.printSalaries(employess);
    }

    @Test
    void printSalariesTestContainsNull()
    {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        employess.add(null);
        app.printSalaries(employess);
    }

    @Test
    void printSalaries()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }

    @Test
    void displayEmployeeTestNull()
    {
        app.displayEmployee(null);
    }

    @Test
    void displayEmployeeTestEmpty()
    {
        Employee emp = new Employee();
        app.displayEmployee(emp);
    }

    @Test
    void displayEmployee()
    {
        Employee emp = new Employee();
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        //employees.add(emp);
        app.displayEmployee(emp);
    }



    @Test
    void printSalariesByRoleTestNull()
    {
        app.printSalariesByRole(null);
    }

    @Test
    void printSalariesByRoleTestEmpty()
    {
        ArrayList<Employee> employees1 = new ArrayList<Employee>();
        app.printSalariesByRole(employees1);
    }

    @Test
    void printSalariesByRoleContainsNull()
    {
        ArrayList<Employee> employees1 = new ArrayList<Employee>();
        employees1.add(null);
        app.printSalariesByRole(employees1);
    }

    @Test
    void printSalariesByRole()
    {
        ArrayList<Employee> employees1 = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees1.add(emp);
        app.printSalariesByRole(employees1);
    }

    @Test
    void printSalariesByRoleFull()
    {
        //Test Null
        app.printSalariesByRole(null);

        //Test Print Salaries By Role
        ArrayList<Employee> employees1 = new ArrayList<Employee>();
        app.printSalariesByRole(employees1);

        //Test Print Salaries By Role with If
        employees1.add(null);
        app.printSalariesByRole(employees1);

        //Test Print Salaries By with If and Variable
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees1.add(emp);
        app.printSalariesByRole(employees1);
    }

    @Test
    void printSalariesByDepartmentFull()
    {
        //Test Null
        app.printSalariesByDepartment(null);

        //Test Print Salaries By Department
        ArrayList<Employee> employees2 = new ArrayList<Employee>();
        app.printSalariesByDepartment(employees2);

        //Test Print Salaries By Department with If
        employees2.add(null);
        app.printSalariesByDepartment(employees2);

        //Test Print Salaries By Department with If and Variable
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees2.add(emp);
        app.printSalariesByDepartment(employees2);
    }


}